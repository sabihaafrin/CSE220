/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prioritycheck;
import java.util.*; 
  
public class PriorityQueueDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty PriorityQueue 
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); 
  
        // Use add() method to add elements into the Queue 
        queue.add(31); 
        queue.add(15); 
        queue.add(30); 
        queue.add(16); 
        queue.add(39); 
  
        // Displaying the PriorityQueue 
        System.out.println("PriorityQueue: " + queue); 
    } 
} 