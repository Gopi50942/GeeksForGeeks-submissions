/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        Node rh=null;
        if(head==null){
            return head;
        }
        while(head!=null){
            Node t=head;
            head=head.next;
            t.next=rh;
            rh=t;
        }return rh;
        
    }
}