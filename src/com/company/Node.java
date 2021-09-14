package com.company;

public class Node {
    Object value;
    Node next;

    Node(Object v, Node n) {
        this.value = v;
        this.next = n;
    }

    public Node(Object value) {
        this.value = value;
    }
}
