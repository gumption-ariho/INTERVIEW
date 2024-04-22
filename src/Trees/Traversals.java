package Trees;
import java.util.*;


public class Traversals {
public static void main(String...args) {
    Node one = new Node(4);
    one.left = new Node(2);
    one.right = new Node(6);
    one.left.left = new Node(1);
    one.left.right = new Node(3);
    one.right.left = new Node(5);
    one.right.right = new Node(7);

    System.out.println(height(one));
    levelOrder(one);

    /*
    n
     */
}

    static void levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node x = queue.poll();
            System.out.print(x.value + " ");
            if (x.left != null) {
                queue.add(x.left);
            }
            if (x.right != null) {
                queue.add(x.right);
            }
        }
    }

static int height(Node node){
    if(node==null){
        return 0;
    }
    int left = height(node.left);
    int right = height (node.right);
    left =left+1;
    right=right+1;
    return Math.max(left,right);
}


}

class Node{
    int value;
    Node right;
    Node left;
    Node(int value){
        this.value=value;
    }
}
