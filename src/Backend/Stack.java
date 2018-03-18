package Backend;

public class Stack {

	Node treeNode;
	Stack next;
	
	public Stack(Node treeNode) {
		this.treeNode = treeNode;
		next = null;
	}
	
	public Stack() {
		treeNode = null;
		next = null;
	}

	public static Stack top;
}
