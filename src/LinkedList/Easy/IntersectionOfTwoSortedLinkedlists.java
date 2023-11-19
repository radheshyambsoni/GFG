package LinkedList.Easy;

// Intersection of two sorted Linked lists
// https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
// Nov 19, 2023

public class IntersectionOfTwoSortedLinkedlists {
    public static Node findIntersection(Node head1, Node head2) {
        int[] map = new int[10001];
        Node temp = head1;
        while (temp != null) {
            map[temp.data]++;
            temp = temp.next;
        }

        Node head = new Node(0);
        Node temp2 = head;
        temp = head2;
        while (temp != null) {
            if (map[temp.data] > 0) {
                map[temp.data]--;
                Node n = new Node(temp.data);
                temp2.next = n;
                temp2 = n;
            }
            temp = temp.next;
        }

        return head.next;
    }
}