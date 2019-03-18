class Node {
  int data;
  Node left, right;

  Node (int data) {
    this.data = data;
    this.left = this.right = null;
  }
}

public class BinaryTree {
  Node root;

  boolean isBST() {
    return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  boolean isBSTUtil(Node node, int min, int max) {
    if(node == null) return true;

    if(node.data > max || node.data < min) {
      return false;
    }

    return (isBSTUtil(node.left, min, node.data-1)&&
    isBSTUtil(node.right, node.data+1, max));
  }
}
