package com.psl.OOP_Inheritance;

class Animal//Super class
{
	public void walk() {
		System.out.println("Animal is Walking");
		
	}
}

class Dog extends Animal{
	String Breed = "Husky";
	int legs=4;
	
}
class BabyDog extends Dog{
	public void display() {
		System.out.println("Babydog of Breed: "+Breed+" with legs "+legs);
	}
	
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b = new BabyDog();
		b.display();
		b.walk();
		

	}

}
