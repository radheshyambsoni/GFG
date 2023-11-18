package LinkedList.Easy;

// Reverse a Doubly Linked List
// https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
// Nov 18, 2023

public class ReverseADoublyLinkedList {
    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null)
            return head;

        Node temp = null, curr = head;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        return temp.prev;
    }
}