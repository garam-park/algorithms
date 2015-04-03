
public class OderTest {

	public static void main(String[] args) {
	
		Tree tree = new Tree(10);

		tree.addNode(6);
		tree.addNode(8);
		tree.addNode(4);
		tree.addNode(14);
		tree.addNode(16);
		tree.addNode(12);
		
		System.out.println();
		System.out.println("Pre - Order ");
		tree.preOrder();
		
		System.out.println();
		System.out.println("In - Order ");
		tree.inOrder();
		
		System.out.println();
		System.out.println("Post - Order ");
		tree.postOrder();
		
		
	}
}
