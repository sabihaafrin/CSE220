/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioritycheck;

/**
 *
 * @author USER
 */
public class Tester {

    public static void main(String[] args) {

        PriorityQueue kpop = new PriorityQueue(10);

        kpop.add(9, 3);
        kpop.add(7, 4);
        kpop.add(2, 1);
        kpop.add(10, 5);
        System.out.println("number that will be deleted " + kpop.remove());
        kpop.changePriority(7, 2);
        System.out.println("number that will be deleted " + kpop.remove());
        kpop.display();
    }
}
