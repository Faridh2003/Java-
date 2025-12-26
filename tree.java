class Node2 {
    int data;
    Node2 left, right;
    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

class SumTree {

    static boolean isSumTree(Node2 root) {
        if (root == null ||
                (root.left == null && root.right == null)) {
            return true;
        }

        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        return (root.data == leftData + rightData)
                && isSumTree(root.left)
                && isSumTree(root.right);
    }
}

public class tree {
    static void main(String[] args) {

        Node2 root = new Node2(26);
        root.left = new Node2(10);
        root.right = new Node2(16);

        root.left.left = new Node2(4);
        root.left.right = new Node2(6);

        root.right.left = new Node2(10);
        root.right.right = new Node2(6);

        System.out.println(SumTree.isSumTree(root) ? "Yes" : "No");
    }
}
