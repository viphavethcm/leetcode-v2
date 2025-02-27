package Recursion.easy;

public class ReverseLinkedList {
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
        ListNode rs = reverseList(l1, null);
    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

//    Đệ quy đảo ngược phần còn lại của danh sách
        ListNode newHead = reverseList(head.next);

//     Sau khi đảo ngược xong phần còn lại, ta gắn kết node hiện tại vào cuối
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static ListNode reverseList(ListNode head, ListNode prev) {
        if (head == null)
            return prev;
        ListNode next = head.next;

        head.next = prev;
        return reverseList(next, head);
    }

}
