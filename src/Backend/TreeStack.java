package Backend;

public class TreeStack {

	Node treeNode;
	TreeStack next;
	
	public TreeStack(Node treeNode) {
		this.treeNode = treeNode;
		next = null;
	}
	
	public TreeStack() {
		treeNode = null;
		next = null;
	}

	
	
	public static TreeStack top;
}