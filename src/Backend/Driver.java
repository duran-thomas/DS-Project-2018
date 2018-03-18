package Backend;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
        ExpressionTree tree = new ExpressionTree();
        
        String postfix = ("793/5*+82/-62/5*+");
		char[] charArray = postfix.toCharArray();
		
		Node root = tree.buildPostFixTree(charArray);
		tree.inOrder(root);
		System.out.println("");
		System.out.println("Result: " + tree.evaluate(root));
	}

}
