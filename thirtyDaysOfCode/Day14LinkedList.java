package thirtyDaysOfCode;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day14LinkedList {
    public static Node insert(Node head, int data) {
        // if Node has no elements, return a new node
        if (head == null) {
            head = new Node(data);
            return head;
        }

        // else iterate through Node, add node to tail, and return head
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);

        }
        display(head);
        sc.close();
    }
}
