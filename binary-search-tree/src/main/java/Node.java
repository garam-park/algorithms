public class Node {

	public int value;
	
	private Node left;
	private Node right;

	public Node(int value){
		this.value = value;
		left = null;
		right = null;
	}

	public Node getLeft(){return left;}

	public Node getRight(){return right;}

	public void setLeft(Node left){
		this.left = left;
		System.out.println(toString()+" set Left Node ("+left.toString()+")");
		}

	public void setRight(Node right){
		this.right = right;
		System.out.println(toString()+" set Right Node ("+right.toString()+")");
	}
	
	@Override
	public String toString() {
		return "Node("+super.toString()+","+value+")";
	}

}
