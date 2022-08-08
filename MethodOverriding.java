package com.psl.OOP_Polymorphism;
class Bank//Super-class
{
	protected void getrateofinterrest(int interest) 
	{
		System.out.println("Bank");
	}
}
class ICICI extends Bank
{ 	//overiden
	protected void getrateofinterrest(int interest) 
	{
		System.out.println("rate of interest of ICICIBank "+interest);
	}}
class StateBank extends Bank
{
	protected void getrateofinterrest(int interest) 
	{
		System.out.println("rate of Interest of StateBank "+interest);
	}
}
class CityBank extends Bank
{
	protected void getrateofinterrest(int interest) 
	{
		System.out.println("rate of Interest of CityBank  "+interest);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ICICI obj1=new ICICI();
//		obj1.getrateofinterrest(9);
//		StateBank obj2=new StateBank();
//		obj2.getrateofinterrest(8);
//		CityBank obj3=new CityBank();
//		obj3.getrateofinterrest(7);
		
		Bank b;//Reference variable of super class
		b=new ICICI();
		b.getrateofinterrest(9);
		Bank b1;
		b1=new StateBank();
		b1.getrateofinterrest(8);		
		Bank b2;
		b2=new CityBank();
		b2.getrateofinterrest(7);
	}

}
