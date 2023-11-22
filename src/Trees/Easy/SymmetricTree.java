package Trees.Easy;

// Symmetric Tree
// https://www.geeksforgeeks.org/problems/symmetric-tree/1
// Nov 22, 2023

public class SymmetricTree {
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root) {
        return f(root, root);
    }

    static boolean f(Node n1, Node n2) {
        if (n1 != null) {
            if (n2 != null) {
                if (n1.data == n2.data) {
                    return f(n1.left, n2.right) && f(n1.right, n2.left);
                }
                return false;
            }
            return false;
        }

        return n2 == null;
    }
}