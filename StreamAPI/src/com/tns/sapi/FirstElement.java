package com.tns.sapi;

import java.util.Arrays;
import java.util.List;

public class FirstElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,20,12,35,55,68,68,55,75);
		 System.out.println(list.stream().filter(i ->i%5==0).map(i->i*2).findFirst());
		 System.out.println(list.stream().filter(i ->i%5==0).map(i->i*2).findFirst().orElse(0));

	}

}
