public class Main {

    public static void main(String[] args) {
        // Take the linked list
        // Call reverseListIter(head) or reverseListRec(head)
    }

    public ListNode reverseListIter(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;
        while (currentNode != null) {
            ListNode tmp = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tmp;
        }

        return previousNode;
    }

    public ListNode reverseListRec(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverse = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
