/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SLinkedList;

/**
 *
 * @author DUANE BOUGARD 3566258
 */
public class SLinkedList {
    public Node head;//start
    public Node tail ;//end
    public int size ;
    public Node currP,prevP;
  /*  Constructor  */
    public SLinkedList(Node a, Node b){head=a; tail=b;}
    
    public SLinkedList()
    {
        head = null;
        //tail = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty(){return head == null;}
    /*  Function to get size of list  */
    public int getSize(){return size;}    
    /*  Function to insert an element at begining  */
    public void insertInFront(String item)
    {
        Node first = new Node(item, null);    
        size++ ;    
        if(head == null) 
        {
            head = first;
            tail = head;
        }
        else 
        {
           first.setNext(head);
            head = first;
        }
    }
   /*  Function to insert an element at end  */
    public void insertAtTail(String item)
    {
        tail = new Node(item,null);  
        Node temp=head; //storing head
        size++ ;    
        
        while (temp.getNext() != null){ //moves from the first item to the last
            temp=temp.getNext();
            }
        temp.setNext(tail);
    }
   /*  Function to insert an element at position  */
   public void replaceAtIndex(int index, String element)//int val-str, int pos-int
    {
        boolean f=false; 
        int a=1;
        Node newElement = new Node(element, null);             
        Node second = new Node (element, null);
        Node first=head;
        while ((first != null)&& !f){ //while list is not empty and f is true
           if (a==index){
               f=true;
               second=first.getNext();
               first.setNext(newElement);
               newElement.setNext(second.getNext());
           }else{
               first=first.getNext();
               a++;
           }
       }
        
    }
   
   public void insertAtIndex(int indx, String item){
       boolean f=false; int a=1;
       Node newElement = new Node(item, null);  //a-nptr              
        Node second = new Node (item, null);//b-ptr
        Node first=head;
       while ((first != null)&& !f){
           if (a==indx){
               f=true;
               second=first.getNext();
               first.setNext(newElement);
               newElement.setNext(second);
           }else{
               first=first.getNext();
               a++;
           }
       } 
   }
    /*  Function to delete an element at position  */
   public void deleteFirstOccurrence(String item){
        prevP = null;
        for (currP = head.next; currP != null;prevP = currP, currP = currP.getNext()) {
          if (currP.getElement() == item) {  /* Found it. */
            if (prevP == null) {
              head.next= currP.getNext();
            } else {

              prevP.setNext(currP.getNext());
            }
              System.out.println("True");;   /* Done searching. */
          }
        }
             System.out.println("False");;  /* Not in the list. */
         }
   
   public void deleteAllOccurrences(String item){
       Node first = head;
       Node prevNode = null;
       boolean deletedANode = false;
        while (first != null) {
            if (first.element== item) {
                if (first == head) {head = head.next;}
                else {prevNode.next = first.next;}
                // fixed indenting
                deletedANode = true;
            }
            else {prevNode = first;}
            first = first.next;
        }

           //System.out.println(deletedANode);
       }
   
   public void deleteLastOccurrence(String item){
       if (tail == null) 
         return; 
            else { 
              if (head == tail) { 
                head = null; 
                tail = null; 
              } 
              else { 
              Node previousToTail = head; 
              while (previousToTail.next != tail) 
               previousToTail = previousToTail.next; 
               tail = previousToTail; 
               tail.next = null; 
                } 
 } 
   }
   
   public void deleteFirstOccurrence1() { 
    if (head == null) 
        return; 
        else { 
         if (head == tail) { 
             head = null; 
             tail = null; 
             } else { 
            head = head.next; 
          } 
  } 
 } 
   
   public boolean containsItem(String item){
       Node current = head;
       Boolean found=false;
      while ((current!= null) && (found == false)) {
    if (current.getElement().equalsIgnoreCase(item)) {
      found= true;
    } else {
      current = current.getNext();
      
    }
  }return found;
  
    }
   
   public int noOfOccurrences(String item){
       
       Node current = head;
       //Node prev=null;
        int count = 0;
        while (current != null)
        {
            if (current.getElement().equalsIgnoreCase(item)){
                current = current.getNext();
                count++;
                
            }else{
              // prev=current;    
            current = current.getNext(); 
            }
            
            
        }
        return count;
   }
   
   public int firstPositionOfItem(String item){
      Node current = head;
        int count = 0;
        while (current != null)
        {
            if (current.getElement().equalsIgnoreCase(item)){
                
            break;}
            else{
                current = current.getNext();}
                count++;}
        return count;
   }
    
   public int[] allPositionsOfItem(String item){
       int[] Array = new int[this.noOfOccurrences(item)];
       Node tmpNode = head;
       Node prevNode = null;
       boolean deletedANode = false;
       int count=0;
       int i =0;
    while (tmpNode != null) {
        if (tmpNode.getElement()== item) {
            Array[i] = count;
            i++;
            count++;
         } else {
             // only advance the prevNode when there's no match.
             prevNode = tmpNode;
             count++;
         }
         tmpNode = tmpNode.next;
    }
       for (int m=0; m<Array.length; m++){
           System.out.println(Array[m]);
       }
    return Array;
   }

    public void deleteAtPos(int indx)
    {        
        if (indx == 1) 
        {
           head.getNext();
            size--; 
            return ;
        }
        if (indx == size) 
        {
            Node s = head;
            Node t = head;
            while (s != tail)
            {
                t = s;
                s= s.getNext();
            }
            tail = t;
            tail.setNext(null);
            size --;
            return;
        }
        Node A = head;
        indx = indx - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == indx) 
            {
                Node tmp = A.getNext();
                tmp =tmp.getNext();
                A.setNext(tmp);
                break;
            }
           A=A.getNext();
        }
        size-- ;
    }    
    /*  Function to display elements  */
    public String toString()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            //return;
        }    
        if (head.getNext() == null) 
       {
            System.out.println(head.getElement() );
            //return;
        }
        Node B = head;
        System.out.print("["+head.getElement()+ ",");
        B = head.getNext();
        while (B.getNext() != null)
        {
            System.out.print(B.getElement()+ ",");
            B = B.getNext();
        }
        System.out.print(B.getElement()+ "]\n");
        return "";
    }


}
