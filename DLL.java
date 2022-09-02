//Doubly linked list
package com.psl.practice;
public class DLL {    
	  
    class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) {    
            this.data = data;    
        }    
    }    
  
    Node head = null;  
    Node tail = null;    
  
    public void addNN(String data) {    
  
        Node newNode = new Node(data);    
  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
            head.prev = null;    
            tail.next = null;    
        }  
        else {    
  
            tail.next = newNode;    
            newNode.prev = tail;    
            tail = newNode;    
            tail.next = null;    
        }    
    }    
  
    public void printList() {  
        Node currentNode = head;    
        if(head == null) {  
            System.out.println("List is empty");    
            return;    
        }  
        System.out.println("Doubly linked list: ");    
        while(currentNode != null) {    
            System.out.print(currentNode.data + "->");    
            currentNode = currentNode.next;    
        }   
        System.out.println("Null");
    }    
  
    public static void main(String[] args) {    
  
        DLL l = new DLL();    
  
        l.addNN("Nilesh");    
        l.addNN("Rakhade");    
        l.printList();    
    }    
}