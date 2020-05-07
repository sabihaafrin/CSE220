/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioritycheck;

public class PriorityQueue {

    Data[] Data;
    int size;
    int i;

    public PriorityQueue(int cap) {
        this.Data = new Data[cap];
        size = 0;
    }

    public boolean add(int number, int priority) {
        if (size == Data.length) {
            return false;
        }
        if (size == 0) {
            Data[0] = new Data(number, priority);
            size++;
        }

        for (i = size - 1; i >= 0; i--) {
            if (Data[i].priority > priority) {   //value<priority

                Data[i + 1] = Data[i];
            } else {
                break;
            }
        }
        Data exo = new Data(number, priority);
        Data[i + 1] = exo;
        size++;

        return true;
    }

    public int remove() {
        if (size == 0) {
            return -1;
        }
        Data n = Data[0];
        for (int i = 0; i < size - 1; i++) {
            Data[i] = Data[i + 1];
        }
        size--;
        return n.number;
    }

    public void changePriority(int number, int newPriority) {
        for (int i = 1; i < size; i++) {
            if (Data[i].number == number) {
                Data[i].priority = newPriority;
            }
        }
    }

    public void display() {
        for (int i = 1; i < size; i++) {
            System.out.println("After removing the number " + Data[i].number + " will have Priority: " + Data[i].priority);
        }
    }
}
