package Meta;


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Question9 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodey = new ListNode();
        ListNode x=nodey;
        int previous=0;
        while(l1!=null&&l2!=null){
            int sum= l1.val+l2.val+previous;
            nodey.next=new ListNode(sum%10);
            previous=sum/10;
            nodey=nodey.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum= l1.val+previous;
            nodey.next=new ListNode(sum%10);
            previous=sum/10;
            nodey=nodey.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum= l2.val+previous;
            nodey.next=new ListNode(sum%10);
            previous=sum/10;
            nodey=nodey.next;
            l2=l2.next;
        }
        while(previous!=0){
            nodey.next=new ListNode(previous);
        }

        return x.next;
    }

    public static void main(String[]args){

    }
}
