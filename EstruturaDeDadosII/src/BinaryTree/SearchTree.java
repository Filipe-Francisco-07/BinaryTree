package BinaryTree;

public class SearchTree {
	private class Nodo{
		private int key;
		private Nodo right,left;
		
		public Nodo(int item) {
			this.key = item;
			right = left = null;
		}
	}
	
	Nodo raiz = null;
	
	public void insert(int key) {
		raiz = insertData(raiz,key);
	}
	
	private Nodo insertData(Nodo raiz, int key) {
		if(raiz == null) {
			raiz = new Nodo(key);
			System.out.println("inserted at the root");
				return raiz;
		}
		if(key < raiz.key) {
			raiz.left = insertData(raiz.left,key);
			System.out.println("inserted at left side");
		}else if(key > raiz.key) {
			raiz.right = insertData(raiz.right,key);
			System.out.println("inserted at right side");
		}else {
			System.out.println("stop :(");
		}
		
		return raiz;
	}
	
	public void showInOrder() {
		showOrderly(raiz);
	}
	
	private void showOrderly(Nodo raiz) {
		if(raiz != null) {
			showOrderly(raiz.left);
		
			System.out.println(raiz.key);
			showOrderly(raiz.right);
		}
	}
	
}
