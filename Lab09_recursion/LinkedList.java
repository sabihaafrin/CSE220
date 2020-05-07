/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab09_recursion;

public class LinkedList {

    public Node head;

    /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        head = new Node(a[0], null);
        Node tail = head;

        for (int i = 1; i < a.length; i++) {
            Node newNode = new Node(a[i], null);
            tail.next = newNode;
            tail = tail.next;
        }

    }

    public LinkedList(Node h) {
        head = h;
    }
}
