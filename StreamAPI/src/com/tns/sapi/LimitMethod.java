package com.tns.sapi;

import java.util.Arrays;
import java.util.List;

public class LimitMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,20,17,35,55,68,75);
		list.stream().limit(5).forEach(System.out::println);

	}

}
