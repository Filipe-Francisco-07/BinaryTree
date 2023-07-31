package BinaryTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchTree tree = new SearchTree();		
		tree.insert(25);
		tree.insert(22);
		tree.insert(35);
		tree.insert(6666);
		tree.insert(25);
		tree.insert(25);
		tree.insert(25);
		
		tree.showInOrder();
		
	}
}
