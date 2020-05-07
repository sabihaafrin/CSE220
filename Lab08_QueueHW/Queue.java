/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab08_queue_final_hw;
public interface Queue
{
    public int size();
        
    public boolean isEmpty();
    
    public void enqueue(Object e) throws QueueOverflowException;
    
    public Object dequeue() throws QueueUnderflowException;
    
    public String toString(); 
    
    public void clear();
}