package com.tns.sapi;

import java.util.Arrays;
import java.util.List;

public class LazyProof {

	public static boolean isDivisible(int i){
		System.out.println("In Divisible" + i);
		return i%5==0;
		
	}
	public static int mapDouble(int i){
		System.out.println("In MapDouble" + i);
		return i*2;
		
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,20,12,35,55,68,68,55,75);
		System.out.println(list
				           .stream()
				           .filter(LazyProof::isDivisible)
				           .map(LazyProof::mapDouble)
				           .findFirst()
				           .orElse(0));;

	}

}
