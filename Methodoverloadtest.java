package com.psl.ALPtraining;

class Student{
	String name;
	int rollno;
	public void infodisplay(String name) {
		System.out.println("Hello "+name);
	}
	public void infodisplay(int rollno) {
		System.out.println("Roll no is "+rollno);
	}
	public void infodisplay(String name,int rollno) {
		System.out.println("Hello "+name+" your Roll no is "+rollno);
	}
}
public class Methodoverloadtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
//		s.name = "Nilesh";
//		s.rollno = 33;
		s.infodisplay("Nilesh",33);
		s.infodisplay("Nilesh");
		s.infodisplay(33);
	}

}
