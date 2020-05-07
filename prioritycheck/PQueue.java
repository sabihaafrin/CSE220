/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioritycheck;
public class PQueue implements  priorityQueue{
    Data pq[];
    int capacity;
    int index;

    public PQueue(int capacity) {
        pq= new Data[capacity];
    }

    @Override
    public boolean add(int number, int priority) {
        if (index<capacity){
            pq[index].number=number;
            pq[index].priority=priority;
            index++;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int remove() {
        int removed_num=0;
        int lowest_priority=pq[0].priority;
        for (int i=0; i<index; i++){
            if (pq[i].priority<lowest_priority){
                lowest_priority=pq[i].priority;
            }
        }
        for (int i=0; i<index; i++){
            if (pq[i].priority==lowest_priority){
                removed_num=pq[i].number;
                for (int j=i; j<=index; j++){
                    pq[j]=pq[j+1];
                }
                index--;
                break;
            }
        }

        return removed_num;
    }

    @Override
    public void changePriority(int number, int newPriority) {
        for (int i=0; i<index; i++){
            if (pq[i].number==number){
                pq[i].priority=newPriority;
            }
        }
    }
}
