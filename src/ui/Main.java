package ui;

import model.AVLTree;

public class Main {

	public static void main(String[] args) {
		AVLTree<Integer> tree = new AVLTree<Integer>();
		for (int i = 0; i <= 20; i++) {
			int t = (int) Math.floor(Math.random()*100+1);
			tree.insert(new Integer(t));
		}
			
		tree.PrintTree();
	}
}
