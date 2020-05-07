/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab05_dummyheadedcircularlist;
public class DummyHeadedCircularList{
  Node head;
  
  /* Build a Dummy Headed Circular List from the given circular array
   */
  public void buildFromArray(int[]cir,int st,int size){
    head=new Node(null,null);
    Node tail=head;
    int temp=st;
    for(int i=0;i<size;i++){
      Node newNode=new Node(cir[temp],null);
      tail.next=newNode;
      tail=tail.next;
      temp=(temp+1)%cir.length;
    }
    tail.next=head;
    // TO DO
  }
  
  /* Build a Dummy Headed Circular List from the given Non Dummy Headed Non Circular List 
   */
  public void buildFromList(Node h){
    head=new Node(null,null);
    Node tail=head;
    for(Node n=h;n.next!=h;n=n.next){
      Node newNode=new Node(n.element,null);
      tail.next=newNode;
      tail=newNode;
    }
    tail.next=head;
    // TO DO
  }
  
  /* Build a Dummy Headed Circular List from the given Non Dummy Headed Non Circular List
   * The elements of the new Dummy Headed list must in reverse order
   */
  public void buildReverse(){
    Node newHead=new Node(head.element,null);
    Node tail=newHead;
    for(Node n=head.next;n!=head;n=n.next){
      Node newNode=new Node(n.element,tail);
      tail=newNode;
    }
    Node dummyHead=new Node(null,tail);
    newHead.next=dummyHead;
    head=dummyHead;
    
    // TO DO
  }
  
  /* Insert the element in the given index.
   * Index 0 is the index after the dummy head
   */ 
  public void addElement(int element, int index){
    if(index>=0 ){
      Node newNode=new Node(element,null);
      Node temp=head;
      for(int i=-1;i<(index-1);i++){
        temp=temp.next;
      }
      newNode.next=temp.next;
      temp.next=newNode;
    }
    // TO DO
  }
  
  /* Delete the element from the given index.
   * Index 0 is the index after the dummy head
   */ 
  public void deleteElement(int index){
    Node temp=head ;
    for(int i=-1;i<(index-1);i++){
      temp=temp.next;
    }
    temp.next=(temp.next).next;
    // TO DO
  }
}