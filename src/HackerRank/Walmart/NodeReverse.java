package HackerRank.Walmart;

class NodeReverse {
    int val;
    NodeReverse next;
    NodeReverse(){}
    NodeReverse(int val){
        this.val=val;
    }
//1 2 4 6 5 10 12 15
    public static void main(String[] args) {
        NodeReverse y = new NodeReverse(1);
        y.next=new NodeReverse(2);
        y.next.next=new NodeReverse(4);
        y.next.next.next=new NodeReverse(6);
        y.next.next.next.next=new NodeReverse(5);
        y.next.next.next.next.next=new NodeReverse(10);
        y.next.next.next.next.next.next=new NodeReverse(13);
        y.next.next.next.next.next.next.next=new NodeReverse(15);

        NodeReverse q= reverse2(y);
        while(q!=null){
            System.out.println(q.val);
            q=q.next;
        }
    }
    static NodeReverse reverse(NodeReverse head) {
        NodeReverse prev = null;
        while (head != null) {
            NodeReverse nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }

    static NodeReverse reverse2(NodeReverse head) {
        // Write your code here
        NodeReverse prev = null;
        NodeReverse h=head;
        while(h!=null){
//123
            if(h.val%2==0){
                NodeReverse prev2=prev;
                NodeReverse hh=h;
                while(hh.val%2==0){
                    NodeReverse temp =hh.next;
                    hh.next=prev2;
                    prev2=hh;
                    hh=temp;
                }
                prev.next=prev2;
                h.next=hh;
                h=h.next;
            }else{
                prev=h;
                h=h.next;
            }
        }
        return head;

    }

}
