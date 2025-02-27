package Recursion.easy;

public class Merge2SortedList {

//      Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode rs = merge(l1, l2);
        System.out.println(rs);
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2); // Merge the rest of l1 with l2
            return l1;  // l1's head is the smallest, so we return l1
        } else {
            l2.next = merge(l1, l2.next); // Merge l1 with the rest of l2
            return l2;  // l2's head is the smallest, so we return l2
        }
    }
}
