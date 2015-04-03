public class Tree {
	
	private Node root;

	public Tree(int value){ root = new Node(value);}

	Node getRoot(){ return root; }

	public boolean addNode(int value){ return addNode(root,value);}

	public static boolean addNode(Node target, int value){
		
		if (target == null)  return false;

		if (target.value == value) return false;

		if (target.value < value) {//right
			if(target.getRight() == null){
				target.setRight(new Node(value));
				return true;
			}
			else{
				return addNode(target.getRight(),value);
			}
		}

		if (target.value > value) {//left
			if(target.getLeft() == null){
				target.setLeft(new Node(value));
				return true;
			}
			else{
				return addNode(target.getLeft(),value);
			}
		}
		return false;
	}

	public Node searchNode(Node node, int value){
		
		if(node == null) return null;

		if(node.value == value) return node;

		if(node.value < value) return searchNode(node.getRight(),value);

		if(node.value > value) return searchNode(node.getLeft(),value);

		return null;
	}

}