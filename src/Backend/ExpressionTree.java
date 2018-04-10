//Name: Duran Thomas
//ID: 1401134

package Backend;

import java.util.*;
import java.io.*;

public class ExpressionTree {

	TreeStack top;
	
	public ExpressionTree() {
		top = null;
	}
	
	public void clear() {
		top = null;
	}
	
	//Push Data To Tree
	public void push(Node nodeVal) {
		if(top == null) {
			top = new TreeStack(nodeVal);
		}else {
			TreeStack temp = new TreeStack(nodeVal);
			temp.next = top;
			top = temp;
		}
	}
	
	//Pop Data To Tree
	public Node pop() {
		if(top == null) throw new RuntimeException("List Is Empty"); 
		else {
			Node temp = top.treeNode;
			top = top.next;
			return temp;
		}
	}
	
	//Return Root Value
	public Node root() {
		return top.treeNode;
	}
	
	//Check If Character Is A Digit Or Not
	public boolean isDigit(char ch) {
		return ch >= '0' && ch <= '9';
    }
	
	//Check If Character Is A Operator Or Not
	public boolean isOperator(String ch) {
		return ch.equals("+")  || ch.equals("-")  || ch.equals("*")  || ch.equals("/");
    }
	
	//Convert Character To Digit
	private float toDigit(String data)
	{
		Float val = Float.parseFloat(data);
        return val;
    }
	
	//Evaluate Tree Data To Give Result
	public double evaluate() {
		return evaluate(root());
	}
	
	public double evaluate(Node val) {
		if(val.left == null && val.right == null) 
			return toDigit(val.data);
		else {
			double result = 0.0;
			double left = evaluate(val.left);
			double right = evaluate(val.right);
			String operator = val.data;
			
			switch(operator) {
			case "+" : result = left + right;
				break;
            case "-" : result = left - right;
            	break;
            case "*" : result = left * right; 
            	break;
            case "/" : result = left / right; 
            	break;
            default  : result = left + right; 
            	break;
			}
			return result;
		}
	}
	
	//Organize Tree Values In PostOrder
    public void postOrder(Node val)
    {
        if (val != null)
        {
            postOrder(val.left);            
            postOrder(val.right);
            System.out.print(val.data);            
        }    
    }
    
  //Organize Tree Values InOrder
    public void inOrder(Node val)
    {
        if (val != null)
        {
            inOrder(val.left);
            System.out.print(val.data);
            inOrder(val.right);            
        }    
    }
    
  //Organize Tree Values In PreOrder
    public void preOrder(Node val)
    {
        if (val != null)
        {
            System.out.print(val.data);
            preOrder(val.left);
            preOrder(val.right);            
        }    
    }
    
    //Generates Postfix Expression
    public void postfix()
    {
        postOrder(root());
    }
    
    //Generate Infix Expression
    public void infix()
    {
        inOrder(root());
    }
    
    //Generate Prefix Expression
    public void prefix()
    {
        preOrder(root());
    }
    
    //Creates Tree In Postfix Form
    public Node buildPostfixTree(String eqn) {
    	Node tree, t1, t2;
    	String exrn[] = eqn.split("\\s+");
    	for(int i=0;i<=exrn.length-1;i++) {
    		if(isOperator(exrn[i])) {
    			tree = new Node(exrn[i]);
    			t1 = pop();
    			tree.right = t1;
    			t2 = pop();
    			tree.left = t2;
    			push(tree);
    		}else {
    			tree = new Node(exrn[i]);
    			push(tree);
    		}
    	}
    	tree = root();
    	pop();
    	return tree;
    }
    
    //Check Precedence Of Value
    static double Prec(char ch) {
    	if (ch == '+' || ch == '-') return 1;
    	else if (ch == '*' || ch == '/') return 2;
    	else if (ch == '^') return 3;
    	else return 0;
	}
    
    //Create Tree In Infix Form
    public String infixToPostfix(String exp) {
		String result = new String("");
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i<exp.length(); ++i)
		{
			char c = exp.charAt(i);
			
			if (Character.isLetterOrDigit(c)) {
				result += c;
				result += " ";
			}
				
			else if (c == '(')
				stack.push(c);
			else if (c == ')')
			{
				while (!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
					result += " ";
				
				if (!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression"; 	 
				else
					stack.pop();
			}
			else
			{
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
					result += stack.pop();
					result += " ";
				stack.push(c);
			}
	
		}
		while (!stack.isEmpty())
			result += stack.pop();
			result += " ";
	
		return result;
	}
    
    //Add Equation To Memory
    public Stack<String> addToMemory(String eqn) {
		Stack<String> memory = new Stack<>();
    	
		String post[] = eqn.split("\\s+");
		for (int i=0;i<post.length;i++) {
			memory.push(post[i]);
		}
		return memory;
    }
    
    //Clear Memory
    public Stack<String> clearMemory(Stack<String> memory) {
    	while(!memory.isEmpty()) {
    		memory.pop();
    	}
    	return memory;
    }
    
    //Remove Last Element From Memory
    public Stack<String> clearLastElemet(Stack<String> memory){
    	memory.pop();
    	return memory;
    }
    
    //Save Expression To File
    public void writeToFile(String eqn) {
    	try {
    		FileWriter add = new FileWriter("calc-files.txt", true);
    		add.write(eqn);
    		add.close();
    	}catch(IOException e) {
    		System.out.println("File Not Found");
    		e.printStackTrace();
    	}
    }
}
