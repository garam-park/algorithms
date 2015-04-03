public class Node {

	public int value;
	private Node left;
	private Node right;

	public Node(int value){
		this.value = value;
		left = null;
		right = null;
	}

	public Node getLeft(){
		return left;
	}

	public Node getRight(){
		return right;
	}


	public void setLeft(Node left){
		this.left = left;
	}

	public void setRight(Node right){
		this.right = right;
	}

}
