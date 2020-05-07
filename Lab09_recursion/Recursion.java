package pkg220_lab09_recursion;

public class Recursion {

//task 1
    int Factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }

    }
// task 2

    int Fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return Fibonacci(num - 1) + Fibonacci(num - 2);
        }

    }
// task 3
    
    

// task 4

    static int Binary(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 2 + 10 * Binary(num / 2));
        }
    }
//task 5

    static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            return power(x, y / 2) * power(x, y / 2);
        } else {
            return x * power(x, y / 2) * power(x, y / 2);
        }
    }
//task 6
//
//    int sum(Node head) {
//        if (head == null) {
//            return 0;
//        } else {
//            return head.elements + sum(head.next);
//        }
//    }
//task 7

    public static Node PrintReverse(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }
}
