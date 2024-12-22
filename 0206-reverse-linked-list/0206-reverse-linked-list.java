public class Reverse_Linked_List {

    
    class Solution_oj_iterative {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }
    }
    class Solution_oj_recursively {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }

    class Solution_recursively {
        public ListNode reverseList(ListNode head) {

            ListNode dummy = new ListNode(0);
            // dummy.next = head;

            ListNode current = head;

            reverse(dummy, current);

            return dummy.next;
        }

        private void reverse(ListNode dummy, ListNode current) {

            if (current == null) {
                return;
            }

            ListNode newHead = current.next;
            ListNode oldDummyNext = dummy.next;

            dummy.next = current;
            current.next = oldDummyNext;

            current = newHead;

            this.reverse(dummy, current);
        }
    }


    class Solution_iteratively {
        public ListNode reverseList(ListNode head) {

            ListNode dummy = new ListNode(0);
            // dummy.next = head;

            ListNode current = head;
            while (current != null) {

                ListNode newHead = current.next;
                ListNode oldDummyNext = dummy.next;

                dummy.next = current;
                current.next = oldDummyNext; 

                current = newHead;
            }

            return dummy.next;
        }
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = dummy.next;
            dummy.next = curr;
            curr = next;
        }
        return dummy.next;
    }
}