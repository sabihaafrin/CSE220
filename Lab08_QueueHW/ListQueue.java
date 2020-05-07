/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab08_queue_final_hw;

public class ListQueue implements Queue {

    int size;
    Node front;
    Node rear;

    
    public ListQueue()
    {
        size = 0;
        front = null;
        rear = null;
    }
     public int size()
     {
         return size;
     }
     public boolean isEmpty()
     {
         if ( size == 0 )
         {
             return true;
         }
         return false;
     }
     public void enqueue(Object o) 
     {
         Node newNode = new Node (o,null);
         if ( isEmpty() )
         {
             front = newNode;
             rear = newNode;
         }
         else
         {
             rear.next = newNode;  
             rear = rear.next;
         }
         size++;
     }
     public Object dequeue() throws QueueUnderflowException
     {
         Node removedNode = front;
         Object temp = null;
         if ( !isEmpty() )
         {
            front = removedNode.next;
            temp = removedNode.val;
            size--;
            removedNode.next = null;
            removedNode.val = null;
            return temp;
         }
         else
         {
             throw new QueueUnderflowException();
         }
     }
     public Object peek() throws QueueUnderflowException
     {
         if ( !isEmpty() )
         {
             return front.val;
         }
         else
         {
             throw new QueueUnderflowException();
         }
     }
    public String toString() //Handle null list
    {
        String s = " ";
        if (front != null) {
            for (Node n = front.next; n != front; n = n.next) {
                s = s + " " + n.val;

            }
        }
        return s;
    }
public Object[] toArray()
     {
         Object [] a = new Object [size]; 
         if ( !isEmpty() )
         {
             Node v = front;
             for ( int j = 0; j <= size - 1; j++ )
             {
                 a[j] = v.val;
                 v = v.next;
             }
         }
         return a;
     }
     public int search(Object o)
     {
         int pos = 0;
         for ( Node  v = front; v != null; v = v.next )
         {
             if ( v.val == o )
             {
                 return pos;
             }
             pos++;
         }
         return -1;
     }

    public void clear() {
        front = null;
//        top.next=null;
//        top.prev=null;
        size = 0;
    }
}
