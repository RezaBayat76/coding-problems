
public class Main {

    public static void main(String[] args) {
        // Take linked list
        // Call middleNode(head)
    }

    public static ListNode middleNode(ListNode head) {
        int numNodes = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            numNodes++;
        }

        int count = 0;
        int middlePosition = numNodes / 2;
        ListNode middleNode = head;
        while (count != middlePosition) {
            middleNode = middleNode.next;
            count++;
        }

        return middleNode;
    }

    class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
}


