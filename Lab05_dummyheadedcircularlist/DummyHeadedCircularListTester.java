/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab05_dummyheadedcircularlist;

public class DummyHeadedCircularListTester {

    public static void printList(Node h) {
        //TO DO
        System.out.println(h.element);
        for (Node i = h.next; i != h; i = i.next) {
            System.out.println(i.element);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n/////  Test 01  /////");
        int[] a1 = {10, 20, 30, 40};
        DummyHeadedCircularList h1 = new DummyHeadedCircularList(); // Creates a linked list using the values from the array
        // head will refer to the Node that contains the element from a[0]
        h1.buildFromArray(a1, 1, 4);
        printList(h1.head);// 20,30,40,10

        System.out.println("\n/////  Test 02  /////");
        DummyHeadedCircularList h2 = new DummyHeadedCircularList();
        DummyHeadedCircularList lLin = new DummyHeadedCircularList(a1);
        h2.buildFromList(lLin.head);
        printList(h2.head); //10,20,30,40

        System.out.println("\n/////  Test 03  /////");
        h2.buildReverse();
        printList(h2.head);//40,30,20,10

        System.out.println("\n/////  Test 04  /////");
        h2.addElement(60, 2);
        printList(h2.head);//40,30,60,20,10
        h2.addElement(70, 5);
        printList(h2.head);//40,30,60,20,10,70
        h2.addElement(70, -3);
        printList(h2.head);//40,30,60,20,10,70

        System.out.println("\n/////  Test 05  /////");
        h2.deleteElement(2);
        printList(h2.head);//40,30,20,10,70
        h2.deleteElement(4);
        printList(h2.head);//40,30,20,10
        h2.deleteElement(-3);
        printList(h2.head);//40,30,20,10
    }
}
