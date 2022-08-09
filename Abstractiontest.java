package com.psl.ALPTraining;

abstract class School {
	public void Display() {
		System.out.println("School Has 6 Floors"+"\n"+"and 5000SQ foot Area  ");
		//Irrelevant info shown on Terminal to avoid we can use 
		//Abstract Keyword to define class Abstract Class.
	}
	abstract void Attendence();
	
}
class Students extends School {
	public void Girl() {
		System.out.println("X no of girls Present");
	}
	public void Boys() {
		System.out.println("Y no of Boys Present ");
	}
	public void Attendence() {
		System.out.println("All Students Present ");
	}
}
class Teachers extends School {
	public void lectures() {
		System.out.println("Z no of Lectures Schedule ");
	}
	public void Attendence() {
		System.out.println("All Teachers Present ");
	}
}
public class Abstractiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students();
		Teachers t = new Teachers();
		s.Girl();
		s.Boys();
		s.Attendence();
		t.lectures();
		t.Attendence();
			
//		School s1 =new School(); --> can't Instantiate Object now
//		s.Display();

	}
 
}
