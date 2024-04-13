package Blind75;

public class ReverseSinglyLinkedList {
    public static void main(String[]args){
        Node heady = new Node(1);
        heady.next= new Node(2);
        heady.next.next= new Node(3);
        heady.next.next.next=new Node(4);

       //print(heady);
      /* Node nd = reverseRecursive(heady);
       print(nd);*/
       print(reverseIterative(heady));

    }
    static Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }

        Node last=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }

    static Node reverseIterative(Node head){
            Node prev = null;
            Node current = head;
            Node after = null;
            while (current != null) {
                after = current.next;
                current.next = prev;
                prev = current;
                current = after;
            }
            return prev;
        }


    static void print(Node head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
}
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
    public Node() {
    }
}
