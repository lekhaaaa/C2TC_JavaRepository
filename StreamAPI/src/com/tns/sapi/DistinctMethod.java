package com.tns.sapi;

import java.util.Arrays;
import java.util.List;

public class DistinctMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,20,12,35,55,68,68,55,75);
		list.stream().distinct().forEach(System.out::println);

	}

}
