public class SearchTest {

	public static void main(String[] args) {



		Tree tree = new Tree(10);

		tree.addNode(6);
		tree.addNode(8);
		tree.addNode(4);
		tree.addNode(14);
		tree.addNode(16);
		tree.addNode(12);
		
		System.out.println(tree.searchNode(10));
		System.out.println(tree.searchNode(6));
		System.out.println(tree.searchNode(8));
		System.out.println(tree.searchNode(4));
		System.out.println(tree.searchNode(14));
		System.out.println(tree.searchNode(12));
		System.out.println(tree.searchNode(16));
		System.out.println(tree.searchNode(1));
		System.out.println(tree.searchNode(2));
	}

}
