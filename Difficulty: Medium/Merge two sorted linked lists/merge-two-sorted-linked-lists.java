/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node rh=new Node(0);
        Node res=rh;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                rh.next=head1;
                head1=head1.next;
                rh=rh.next;
            }
            else{
                rh.next=head2;
                head2=head2.next;
                rh=rh.next;
            }
        }
        if(head1!=null){
            rh.next=head1;
        }
        if(head2!=null){
            rh.next=head2;
        }
        return res.next;
        
    }
}