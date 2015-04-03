public class Tree {
	
	private Node root;

	public Tree(int value){ root = new Node(value);}

	public Node getRoot(){ return root; }

	public boolean addNode(int value){ return addNode(root,value);}

	private static boolean addNode(Node target, int value){
		
		if (target == null) return false;

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

	
	public Node searchNode(int value){
		return searchNode(root, value);
	}
	
	private Node searchNode(Node node, int value){
		
		if(node == null) {
			System.out.println("searchNode, node is null");
			return null;
		}

		if(node.value == value) return node;

		if(node.value < value) return searchNode(node.getRight(),value);

		if(node.value > value) return searchNode(node.getLeft(),value);

		return null;
	}

	public void preOrder(){
		preOrder(root);
	}
	
	private void preOrder(Node node){
		System.out.println(node.value);
		if (node.getLeft()!=null) {
			preOrder(node.getLeft());
		}
		if (node.getRight()!=null) {
			preOrder(node.getRight());
		}
	}
	
	public void postOrder(){
		postOrder(root);
	}
	
	private void postOrder(Node node){
		  if (node.getLeft() != null) {
			  postOrder(node.getLeft());
		  }
		  if (node.getRight() != null) {
			  postOrder(node.getRight());
		  }
		  System.out.println(node.value);
	}
	
	public void inOrder(){
		inOrder(root);
	}
	
	private void inOrder(Node node) {
		
		if (node.getLeft() != null) {
			inOrder(node.getLeft());
		}
		System.out.println(node.value);
		if (node.getRight() != null) {
			inOrder(node.getRight());
		}
	}
}