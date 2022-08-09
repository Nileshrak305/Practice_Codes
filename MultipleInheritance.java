package com.psl.ALPTraining;
interface Language{
	void Display();
}
interface ObjectOrientedLang{
	
}
class Java implements Language, ObjectOrientedLang{

	@Override
	public void Display() {
		System.out.println("Java is Object Oriented Language");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java j = new Java();
		j.Display();
		

	}

}
