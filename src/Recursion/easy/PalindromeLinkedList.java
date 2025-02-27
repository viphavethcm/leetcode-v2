package Recursion.easy;

public class PalindromeLinkedList {

    //      Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
        System.out.println(isPalindrome(l1));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        // tao 2 node , 1 node di toi cuoi, 1 node di toi 1/2
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // reverse node di toi 1/2 de chuan bi so sanh -->
        ListNode reverseSlow = reverse(slow);
        while (reverseSlow != null) {
            if (reverseSlow.val != head.val) {
                return false;
            }
            reverseSlow = reverseSlow.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode slow) {
        if (slow == null || slow.next == null) {
            return slow;
        }
        ListNode reverse = reverse(slow.next);
        slow.next.next = slow;
        slow.next = null;
        return reverse;
    }
}
