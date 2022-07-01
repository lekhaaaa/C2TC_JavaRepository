package com.tns.polymorphism;

class Student{
	int uid;
	String name;
	
	Student(){
		System.out.println("I am a student");
	}
	Student(int uid,String name){
		this.uid=uid;
		this.name=name;
		System.out.println(uid + " " + name);
	}
	Student(int uid,String name,float CGPA){
		System.out.println(uid + " " + name+ " " + CGPA);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(123,"Lekha");
		Student s3 = new Student(123,"Lekha",5.0f);
	}

}
