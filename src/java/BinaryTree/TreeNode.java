
public class TreeNode {

    Node root;

    public TreeNode() {
        root = null;
    }

    public void add(int value){
        Node node = new Node(value);
        if (root ==null) {
            root = node;
        }
        else { 
            Node counter = root;
            Node prev = counter;
            while (counter!= null)  {
                if (node.value < counter.value) {
                    prev = counter;
                    counter = counter.left;
                }
                else {
                    prev = counter;
                    counter = counter.right;
                }
            }

            if ( node.value < prev.value) {
                prev.left = node;
            }
            else {
                prev.right = node;
            }
        }
    }

    public void printTree(Node root){
        if( root.left == null && root.right == null) {
            System.out.print(root.value + " ");
            return;
        }
        else {
            System.out.print(root.value + " ");
            if (root.left != null) {
                printTree(root.left);
            }
            if (root.right!=null) {
                printTree(root.right);
            }
        }
    }

    public boolean binarySearch(Node node,int value){
        boolean found = false;
        if (node.value == value){
            found = true;;
        }
        if (!found && node.left != null){
            found = binarySearch(node.left, value);
        }
        if (!found && node.right != null){
            found = binarySearch(node.right, value);
        }

        return found;
    }

}
