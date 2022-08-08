package com.psl.OOP_Inheritance;

class Vehicle//superclass
{
	protected int speed=70;//if Private it won't access so being Protected data member subclass can access
	public void get() {
		System.out.println("Details");
	}
}
class Car extends Vehicle//Subclass
{
	private String color="Black";
	public void print() {
		System.out.println("Speed:"+speed);
		System.out.println("Color:"+color);
	}
}
//Driver Class or Main Class
public class SingleInheritance {// We can use main class as subclass also

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.get();
		obj.print();
		

	}

}
