package org.example;

public class DoublyLinkedList {
    public void insertNode(ListNode previous, ListNode newNode) {
        ListNode lastElement = previous.next;
        previous.next = newNode;
        newNode.next = lastElement;
        lastElement.prev = newNode;
        newNode.prev = previous;
    }
}
