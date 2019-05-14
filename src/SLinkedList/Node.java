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
public class Node {
        public String element;
        public Node next;
    /*  Constructor  */
        
    public Node(String a){ element=a;}    
    public Node() {
                this(null,null);
    //         link = null;
    //         element = " ";
     }    
    /*  Constructor  */
        public Node(String s,Node n)
       {
            element = s;
            next = n;
        }   
        /*  Function to set link to next Node  */
      public void setNext(Node n){next = n;}    
        /*  Function to set data to current Node  */
        public void setData(String s){element = s;}    
        /*  Function to get link to next node  */
       public Node getNext(){return next;}    
       /*  Function to get data from current Node  */
       public String getElement(){return element;}

}
