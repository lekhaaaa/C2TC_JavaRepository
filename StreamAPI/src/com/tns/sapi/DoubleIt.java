package com.tns.sapi;

import java.util.Arrays;
import java.util.List;

public class DoubleIt {

	public static void doubleIt(int i) {
		System.out.println(i*2);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		list.forEach(i -> doubleIt(i));
		
		list.forEach(DoubleIt::doubleIt);

	}

}
