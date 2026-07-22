/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void reorderList(Node head) {
        // code here
        if (head == null || head.next == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        Node rh = null;
        while (head2 != null) {
            Node t = head2;
            head2 = head2.next;
            t.next=rh;
            rh=t;
        }
        head2 = rh;
        while (head2 != null) {
            Node next1 = head.next;
            Node next2 = head2.next;

            head.next = head2;
            head2.next = next1;

            head = next1;
            head2 = next2;
        }
    }
}