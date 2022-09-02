package com.psl.practice2;

import java.util.LinkedList;
import java.util.Queue;

public class Stackusingque {
    Queue<Integer> que1 = new LinkedList<>();
    Queue<Integer> que2 = new LinkedList<>();
    
    public Stackusingque() {
        
    }
    
    public void push(int a) {
        que1.add(a);
    }
    
    public int pop() {
        while(que1.size()!=1) {
            que2.add(que1.remove());
        }
        int res = que1.remove();
        while (!que2.isEmpty()) que1.add(que2.remove());
        return res;
    }
    
    public int top() {
        while(que1.size()!=1) {
            que2.add(que1.remove());
        }
        int res = que1.peek();
        que2.add(que1.remove());
        while (!que2.isEmpty()) que1.add(que2.remove());
        return res;
    }
    
    public boolean empty() {
        return que1.isEmpty() && que2.isEmpty();
    }
    public static void main(String[] args) {
    	Stackusingque s = new Stackusingque();
    	  s.push(1);
    	  s.push(2);
    	  s.push(3);
    	  int element1 = s.pop();
    	  System.out.println(element1);
    	  int element2 = s.top();
    	  System.out.println(element2);
    	  boolean value = s.empty();
    	  System.out.println(value);
	}
}