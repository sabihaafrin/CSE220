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
public class priority_Queue {
    int size;
    int idx;

    Data[] pq= new Data[size];
    public boolean add(int number, int priority) {
        if (idx<size){
            pq[idx].number=number;
            pq[idx].priority=priority;
            idx++;
            return true;
        }else {
            return false;
        }
    }
 
    public int remove() {
        int removed_num=0;
        int lowest_priority=pq[0].priority;
        for (int i=0; i<idx; i++){
            if (pq[i].priority<lowest_priority){
                lowest_priority=pq[i].priority;
            }
        }
        for (int i=0; i<idx; i++){
            if (pq[i].priority==lowest_priority){
                removed_num=pq[i].number;
                for (int j=i; j<=idx; j++){
                    pq[j]=pq[j+1];
                }
                idx--;
                break;
            }
        }

        return removed_num;
    }

    public void changePriority(int number, int newPriority) {
        for (int i=0; i<idx; i++){
            if (pq[i].number==number){
                pq[i].priority=newPriority;
            }
        }
    }
}
