/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab05_circularlinkedlist;
public class CircularList {

    Node head;

    /* Build a Circular List from the given circular array
     */
    public void buildFromArray(int[] cir, int st, int size) {
        // TO DO
        int k = (st + 1) % cir.length;
        head = new Node(cir[st], null);
        Node n = new Node(cir[k], null);
        head.next = n;
        for (int i = 2; i < size; i++) {
            k = (k + 1) % cir.length;
            Node j = new Node(cir[k], null);
            n.next = j;
            n = j;
        }
        n.next = head;
    }

    /* Build a Circular List from the given Non Circular List 
     */
    public void buildFromList(Node h) {
        // TO DO

        head = new Node(h.element, null);
        Node n = new Node(h.next.element, null);
        head.next = n;
        Node m = h.next.next;
        while (m != h) {
            Node j = new Node(m.element, null);
            n.next = j;
            n = n.next;
            m = m.next;
        }
        n.next = head;

    }

    /* Build a Circular List from the given Non Circular List
   * The elements of the new list must in reverse order
     */
    public void buildReverse() {
        // TO DO
        int count = 0;
        for (Node n = head; n.next != head; n = n.next) {
            count++;
        }
        int a[] = new int[count];
        Node n = head;
        for (int j = 0; j < count; j++) {
            a[j] = n.element;
            n = n.next;
        }
        int s = 0;
        int d = 0;
        for (int i = count - 1; i > a.length; i--) {
            s = a[i];
            a[i] = a[d];
            a[d] = s;
            d++;
        }
        buildFromArray(a, 0, count);
    }


    /* Insert the element in the given index.
   * Index 0 is the index after the dummy head
     */
    public void addElement(int element, int index) {
        // TO DO
        if (index == 0) {
        Node n = head;
        Node t = new Node(element, null);

        }
        

    }

    /* Delete the element from the given index.
   * Index 0 is the index after the dummy head
     */
    public void deleteElement(int index) {
        // TO DO
    }
}
