public class AddTest {

	public static void main(String[] args) {
		Tree tree = new Tree(12);

		System.out.println(tree.addNode(24));
		System.out.println(tree.addNode(15));
		System.out.println(tree.addNode(19));
		System.out.println(tree.addNode(2));
		System.out.println(tree.addNode(28));
		System.out.println(tree.addNode(27));
		System.out.println(tree.addNode(30));
		
		System.out.println(tree.searchNode(tree.getRoot(), 15));
		System.out.println(tree.searchNode(tree.getRoot(), 20));
		System.out.println(tree.searchNode(tree.getRoot(), 3));
		System.out.println(tree.searchNode(tree.getRoot(), 28));
		System.out.println(tree.searchNode(tree.getRoot(), 7));
	}

}
