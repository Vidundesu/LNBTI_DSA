// Node class represents each node in the binary tree
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// BinaryTree class containing the root node and methods to manipulate the tree
class BinaryTree {
    Node root;

    // Constructor to initialize the binary tree with a null root
    BinaryTree() {
        root = null;
    }

    // Insert a new node in the binary tree
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive function to insert a new key into the binary tree
    Node insertRec(Node root, int key) {
        // If the tree is empty, create a new node as the root
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recursively insert the node in the left or right subtree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Inorder traversal of the binary tree
    void inorder() {
        inorderRec(root);
    }

    // Recursive function for inorder traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Preorder traversal of the binary tree
    void preorder() {
        preorderRec(root);
    }

    // Recursive function for preorder traversal
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder traversal of the binary tree
    void postorder() {
        postorderRec(root);
    }

    // Recursive function for postorder traversal
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Main method to test the binary tree implementation
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Inorder traversal of the tree
        System.out.println("Inorder traversal:");
        tree.inorder();

        // Preorder traversal of the tree
        System.out.println("\nPreorder traversal:");
        tree.preorder();

        // Postorder traversal of the tree
        System.out.println("\nPostorder traversal:");
        tree.postorder();
    }
}
