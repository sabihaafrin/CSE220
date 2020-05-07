/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_linkedlist;

public class LinkedList {

    public Node head;

    /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        // TO DO   
        Node n = new Node(a[0], null);
        head = n;
        for (int i = 1; i < a.length; i++) {
            n.next = new Node(a[i], null);
            //i++;
            n = n.next;
        }

    }

    /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
     */
    public LinkedList(Node h) {
        // TO DO
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        // TO DO
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;
        }
        return count; // please remove this line!
    }

    /* prints the elements in the list */
    public void printList() {
        // TO DO   
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element + "  ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        // TO DO
        int count = 0;
        Node h = head;
        for (Node n = head; n != null; n = n.next) {
            if (idx == count) {
                h = n;
                break;
            }
            count++;
        }
        return h; // please remove this line!
    }

// returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        // TO DO
        int count = 0;
        Node h = head;
        for (Node n = head; n != null; n = n.next) {
            if (idx == count) {
                h = n;
                break;
            }
            count++;
        }
        return h.element; // please remove this line!
    }

    /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
        // TO DO
        int count = 0;
        Node h = head;
        Object o = null;
        for (Node n = head; n != null; n = n.next) {
            if (idx == count) {
                o = n.element;
                n.element = elem;
                break;
            }
            count++;
        }
        return o; // please remove this line!
    }

    /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        // TO DO
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            if (n.element == elem) {
                break;
            }
            count++;
        }
        return count; // please remove this line!
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        // TO DO
        int count = 0;
        boolean a = false;
        for (Node n = head; n != null; n = n.next) {
            if (n.element == elem) {
                a = true;
                break;
            }
            count++;
        }
        return a; // please remove this line!
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
        // TO DO
        // Node h = new Node(head.element,null);
        Node Tail = null;
        Node head1 = null;
        for (Node n = head; n != null; n = n.next) {
            Node newNode = new Node(n.element, null);
            if (head1 == null) {
                head1 = newNode;
                Tail = head1;
            }
            Tail.next = newNode;
            Tail = Tail.next;

        }

        return head1; // please remove this line!
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        // TO DO
        Node n = head;
        Object o[] = new Object[countNode()];
        for (int i = o.length - 1; i >= 0; i--) {
            o[i] = n.element;
            n = n.next;
        }
        LinkedList l = new LinkedList(o);

        return l.head; // please remove this line!
    }

    /* inserts Node containing the given element at the given index
   * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        // TO DO
        if (idx >= 0 && idx <= countNode()) {
            Node n = new Node(elem, null);
            if (idx == 0) {
                n.next = head;
                head = n;
            } else if (idx == countNode()) {
                Node h = head;
                while (h.next != null) {
                    h = h.next;
                }
                h.next = n;
            } else {
                Node h = head;
                for (int i = 0; i < idx - 1; i++) {
                    h = h.next;
                }
                Node t = h.next;
                n.next = t;
                h.next = n;
            }
        }
    }

    /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        // TO DO
        Node t = null;
        if (index >= 0 && index < countNode()) {

            if (index == 0) {
                t = head;
                head = head.next;

            } else {
                Node h = head;
                for (int i = 0; i < index - 1; i++) {
                    h = h.next;
                }
                t = h.next;
                h.next = h.next.next;

            }
        }
        return t.element; // please remove this line!
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        // TO DO
        Node n = head;
        Object o[] = new Object[countNode()];
        for (int i = 0; i < o.length; i++) {
            o[i] = n.element;
            n = n.next;
        }
        Object temp = o[0];
        for (int i = 0; i < o.length; i++) {

            if (i == o.length - 1) {
                o[i] = temp;
            } else {
                o[i] = o[(i + 1)];
            }
        }
        LinkedList l = new LinkedList(o);
        head = l.head;

    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        // TO DO
        Node n = head;
        Object o[] = new Object[countNode()];
        for (int i = 0; i < o.length; i++) {
            o[i] = n.element;
            n = n.next;
        }
        Object temp = o[o.length - 1];
        for (int i = o.length - 1; i >= 0; i--) {

            if (i - 1 == -1) {
                o[i] = temp;
            } else {
                o[i] = o[i - 1];
            }
        }
        LinkedList l = new LinkedList(o);
        head = l.head;
    }
}
