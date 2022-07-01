package com.tns.le;

interface addition{
	public int add(int a,int b);
	
}
public class TwoParameter {

	public static void main(String[] args) {
		addition s = (int a,int b) ->(a+b); {
			System.out.println(s.add(10,5));
					
		};

		
	}

}
