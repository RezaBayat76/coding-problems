
public class Main {

    public static void main(String[] args) {
        // Take two trees
        // Call getIntersectionNode(headA, headB)
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int numA = 0;
        ListNode currA = headA;
        while (currA != null) {
            currA = currA.next;
            numA++;
        }

        int numB = 0;
        ListNode currB = headB;
        while (currB != null) {
            currB = currB.next;
            numB++;
        }

        int extraSteps = Math.abs(numA - numB);
        boolean extraForA = numA >= numB;

        int count = 0;
        currA = headA;
        currB = headB;
        if (extraForA) {
            while (count != extraSteps) {
                currA = currA.next;
                count++;
            }
        } else {
            while (count != extraSteps) {
                currB = currB.next;
                count++;
            }
        }

        while (currA != null && currB != null) {
            if (currA == currB) {
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }

        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
