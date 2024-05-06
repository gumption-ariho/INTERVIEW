package Meta;


import java.util.HashMap;

// Definition for a Node11.
class Node11 {
    int val;
    Node11 next;
    Node11 random;

    public Node11(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class Question10 {
    public Node11 copyRandomList(Node11 head) {
        //create a hashmap of original and head
        HashMap<Node11, Node11> map =new HashMap<>();
        Node11 heady = head;
        Node11 newHead= new Node11(0);
        Node11 newHeadPoint=newHead;
        while(head!=null){
            newHead.next= new Node11(head.val);
            map.put(head,newHead.next);
            head=head.next;
            newHead=newHead.next;
        }
       /* for(Map.Entry<Node11,Node11>entryset:map.entrySet()){
            System.out.println(entryset.getKey().val+" "+entryset.getValue().val);
        }
        */

        Node11 headX=heady;
        Node11 returned = newHeadPoint;
        newHeadPoint=newHeadPoint.next;
        while(heady!=null){

            newHeadPoint.random=map.get(heady.random);
            newHeadPoint=newHeadPoint.next;
            heady=heady.next;
        }

        return returned.next;
    }

    public static void main(String[]args){}
}