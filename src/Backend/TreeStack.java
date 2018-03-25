//Name: Duran Thomas
//ID: 1401134

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