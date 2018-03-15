package Backend;

import javax.management.RuntimeErrorException;
//import java.util.*;

public class ExpressionTree {

	Stack top;
	
	public ExpressionTree() {
		top = null;
	}
	
	public void clear() {
		top = null;
	}
	
	public void push(Node nodeVal) {
		if(top == null) {
			top = new Stack(nodeVal);
		}else {
			Stack temp = new Stack(nodeVal);
			temp.next = top;
			top = temp;
		}
	}
	
	public Node pop() {
		if(top == null) throw new RuntimeException("List Is Empty"); 
		else {
			Node temp = top.treeNode;
			top = top.next;
			return temp;
		}
	}
	
	public Node root() {
		return top.treeNode;
	}
	
	public void insert(char ch) {
		try {
			Node data = new Node(ch);
			if(isDigit(ch)) {
				push(data);
			}else if(isOperator(ch)) {
//				Node data = new Node(ch);
//				data.left = pop();
//				data.right = pop();
//				push(data);
				
				data.right = pop();
				data.left = pop();
				push(data);
			}
		} catch (Exception e) {
			System.out.println("Invalid Expression");
		}
	}
	
	public boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
	
	public boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
	
	private int toDigit(char ch)
    {
        return ch - '0';
    }
	
	public Node buildTree(char eqn[])
    {
//        for (int i = eqn.length() - 1; i >= 0; i--)
//            insert(eqn.charAt(i));
		Node t, t1, t2;
		for(int i = 0; i < eqn.length; i++) {
			if(!isOperator(eqn[i])) {
				t = new Node(eqn[i]);
				push(t);
			}else {
				t = new Node(eqn[i]);
				
				t1 = pop();
				t2 = pop();
				
				t.right = t1;
				t.left = t2;
				
				push(t);
			}
		}
		
        t = root();
        pop();
        return t;
    }
	
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
			char operator = val.data;
			
			switch(operator) {
			case '+' : result = left + right;
				break;
            case '-' : result = left - right;
            	break;
            case '*' : result = left * right; 
            	break;
            case '/' : result = left / right; 
            	break;
            default  : result = left + right; 
            	break;
			}
			return result;
		}
	}
	
    public void postOrder(Node val)
    {
        if (val != null)
        {
            postOrder(val.left);            
            postOrder(val.right);
            System.out.print(val.data);            
        }    
    }
    
    public void inOrder(Node val)
    {
        if (val != null)
        {
            inOrder(val.left);
            System.out.print(val.data);
            inOrder(val.right);            
        }    
    }
    
    private void preOrder(Node val)
    {
        if (val != null)
        {
            System.out.print(val.data);
            preOrder(val.left);
            preOrder(val.right);            
        }    
    }
    
    public void postfix()
    {
        postOrder(root());
    }
    
    public void infix()
    {
        inOrder(root());
    }
    
    public void prefix()
    {
        preOrder(root());
    }
}
