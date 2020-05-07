/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab09_recursion;

import static pkg220_lab09_recursion.Recursion.Binary;
import static pkg220_lab09_recursion.Recursion.power;

public class Recursion_Tester {

    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int no = 15;
        Object[] a1 = {10, 20, 30, 40};
        LinkedList h1 = new LinkedList(a1);
        Recursion r = new Recursion();
        System.out.println("Factorial: " + r.Factorial(5));
        System.out.println("Fibonacci: " + r.Fibonacci(5));
        //System.out.println(r.sum(head));
        System.out.println("Exponential: " + power(m, n));
        // System.out.println("ReverseList: " + h1.PrintReverse(a1));
        System.out.println(no + "'s Binary: " + Binary(no));

    }
}
