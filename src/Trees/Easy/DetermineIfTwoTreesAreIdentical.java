package Trees.Easy;

// Determine if Two Trees are Identical
// https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
// Nov 21, 2023

public class DetermineIfTwoTreesAreIdentical {
    // Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2) {
        return f(root1, root2);
    }

    boolean f(Node n1, Node n2) {
        if (n1 == null) {
            if (n2 == null) {
                return true;
            }
            return false;
        } else if (n2 == null) {
            return false;
        }

        if (n1.data != n2.data) {
            return false;
        }

        if (!f(n1.left, n2.left)) {
            return false;
        }
        if (!f(n1.right, n2.right)) {
            return false;
        }

        return true;
    }

}