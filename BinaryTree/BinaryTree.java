public class BinaryTree<T> {
    Node root;

    public static void main(String[] args) {
        BinaryTree<String> myTree = new BinaryTree<>();

        myTree.root = new Node<String>("Hello");
        myTree.root.left = new Node<String>("World");
        myTree.root.right = new Node<String>("How");
        myTree.root.left.left = new Node<String>( "You");
        myTree.root.right.left =  new Node<String>("Doing");

        myTree.inorder();
        // should print "You World Hello Doing How"
    }

    void inorder() {
        recursiveInorder(root);
    }

    void recursiveInorder(Node currentRoot) {

        // include some stuff that will recurse down left subtree, right subtree, and/or "visit"
        // keep in mind, general recursive problem solving
        // you'll need a base case (or cases) >>> "node is a leaf...."
        // you'll need a recursive case (or cases)

    }


}

class Node<T> {
    Node right;
    Node left;

    T data;

    Node(T data) {
        this.data = data;
    }
}
