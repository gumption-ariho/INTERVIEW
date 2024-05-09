package Meta;

public class ReverseLinkedListEvens {
    public static void main(String... args) {
        //System.out.println("I am happy");
        //1268371012
        Node11 head = new Node11(1);
        head.next = new Node11(2);
        head.next.next = new Node11(6);
        head.next.next.next = new Node11(8);
        head.next.next.next.next = new Node11(3);
        head.next.next.next.next.next = new Node11(7);
        head.next.next.next.next.next.next = new Node11(10);
        head.next.next.next.next.next.next.next = new Node11(12);
        display(head);
        display(reverse(head));
    }

    static void display(Node11 n) {
        while (n != null) {
            //System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }

    static Node11 reverse(Node11 head) {
    return null;
    }
}

class Node1 {
    Node11 next;
    int value;
    Node1(int value){
        this.value=value;
    }
}
