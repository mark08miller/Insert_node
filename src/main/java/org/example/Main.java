package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListNode value1 = new ListNode(1);
        ListNode value3 = new ListNode(3);
        value1.next = value3;
        value3.prev = value1;
        ListNode value2 = new ListNode(2);
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.insertNode(value1,value2);
    }
}