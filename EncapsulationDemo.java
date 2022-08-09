package com.psl.ALPtraining;
class Encapsulate {

 private String demoName;
 private int demoRoll;
//we need to implement getter and setter to access Private data members
 public String getName() {
	 return demoName; 
	 }

 public int getRoll() { 
	 return demoRoll; 
	 }

 public void setName(String newName)
 {
     demoName = newName;
 }


 public void setRoll(int newRoll) {
	 demoRoll = newRoll; 
	 }
}

public class EncapsulationDemo {
	 public static void main(String[] args)
	 {
	     Encapsulate e = new Encapsulate();
	     e.setName("Nilesh");
	     e.setRoll(44916);

	     System.out.println("Name: " + e.getName());
	     System.out.println("Roll: " + e.getRoll());

	    
	 }
	}


