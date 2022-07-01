package com.tns.le;

interface lambda{
	void demo();
}
public class Sayablee {

	public static void main(String[] args) {
		lambda s = ()-> {System.out.println("I have nothing to say");};
		s.demo();

	}

}
