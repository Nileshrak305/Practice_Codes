package com.psl.OPP_HirarchicalInheritance;
class Bank//Super-class
{
	public void welcome() {
		System.out.println("Welcome to our Bank");
	}
}
class ICICI extends Bank
{
	public float rateofinterest(float i) {
		return i;
	}
}
class StateBank extends Bank
{
	public float interest(float i) {
		return i;
	}
}
class CityBank extends Bank
{
	public float citybankinterest(float i) {
		return i;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI obj1=new ICICI();
		System.out.println(obj1.rateofinterest(9.0f));
		StateBank obj2=new StateBank();
		System.out.println(obj2.interest(8.0f));
		CityBank obj3=new CityBank();
		System.out.println(obj3.citybankinterest(7.6f));

	}

}
