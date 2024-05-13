package HackerRank.Walmart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.left.right = new Node(12);
        root.left.right.left = new Node(9);
        root.right.right.left = new Node(10);
        root.right.right.right = new Node(11);

        // Declaring the vector function to store
        // in, post, pre-order values
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> post = new ArrayList<Integer>();
        List<Integer> in = new ArrayList<Integer>();

        //preOrder(root);
        //levelOrder(root);
       // postOrder(root);
        inorder(root);

    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);

    }
    public static void levelOrder(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek().left!=null){
                q.add(q.peek().left);
            }
            if(q.peek().right!=null){
                q.add(q.peek().right);
            }

            System.out.println(q.poll().val);
        }
    }

}

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
        this.right=this.left=null;
    }
}