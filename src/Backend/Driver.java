package Backend;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.println("Expression Tree Test");
 
        /** make object of ExpressionTree **/
        ExpressionTree et = new ExpressionTree();
 
//        System.out.println("\nEnter equation in prefix form");
//        et.buildTree(scan.next());
        
        String postfix = "793/5*+82/-62/5*+";
		char[] charArray = postfix.toCharArray();
		
		Node root = et.buildTree(charArray);
//		et.inOrder(root);
		System.out.println("");
		System.out.println(et.evaluate(root));
		
//        System.out.print("\nPrefix  : ");
//        et.prefix();
//        System.out.print("\n\nInfix   : ");
//        et.infix();
//        System.out.print("\n\nPostfix : ");
//        et.postfix();
        //System.out.println("\n\nEvaluated Result : "+ et.evaluate());
		
	}

}
