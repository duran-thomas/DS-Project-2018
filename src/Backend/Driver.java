//Name: Duran Thomas
//ID: 1401134


package Backend;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        ExpressionTree testTree = new ExpressionTree();
       
        String postfix = ("-72.5 -92.2 +");
        String infix = ("7+9+3");
        //String postfix = ("5 10 15 - * 7 +");
		
        //System.out.println(testTree.infixToPostfix(infix));
        
//        Node test = testTree.buildPostfixTree(postfix);
//		testTree.inOrder(test);
//		System.out.println("");
//		System.out.printf("Result: %.1f", testTree.evaluate(test));
//		
//		System.out.println("\nMemory Function");
//        
//        Stack<String> mem = new Stack<>();
//        
//        mem = testTree.addToMemory(postfix);
//        
//        System.out.println("View Memory: " + mem);
//        System.out.println(mem.lastElement());
//        
//        System.out.println("After Memory Clear: " + testTree.clearMemory(mem));
//        testTree.writeToFile(postfix + "\n");
        
        System.out.println(testTree.infixToPostfix(infix));
	}
}