package Meta;

public class ReverseLinkedListEvens {
    public static void main(String... args) {
        //System.out.println("I am happy");
        //1268371012
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next.next = new Node(12);
        display(head);
        display(reverse(head));
    }

    static void display(Node n) {
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }

    static Node reverse(Node head) {
    return null;
    }
}

class Node{
    Node next;
    int value;
    Node(int value){
        this.value=value;
    }
}
