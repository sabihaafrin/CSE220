/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab08_queue_final_hw;
public class Node{
    Object val;
    Node next;
    Node prev;
    
    public Node(Object v, Node n){
        val = v;
        next = n;
    }
    public Node(Object v, Node n, Node p)
    {
        val = v;
        next = n;
        prev = p;
    }
}