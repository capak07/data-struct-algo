package folder.BinaryTreeJava;

public class Main {
    public static void main(String[] args) {
        int[] array = {23,15,12,11,4,19,49,47,36,42,77,74,86,82,81,85,94};
        TreeNode tree = new TreeNode();

        for (int i=0; i<array.length; i++) {
            tree.add(array[i]);
        }
        tree.printTree(tree.root);
        System.out.println("\n" + tree.binarySearch(tree.root, 94));

    }
}
