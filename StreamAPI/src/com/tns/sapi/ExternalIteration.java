package com.tns.sapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExternalIteration {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		  //External Iterations 
		//for Loop
		  for(int i=0;i<6;i++) 
		    { 
			System.out.println(list.get(i));
		    } 
		
		 //Iterator
		Iterator itr = list.iterator(); 
		while(itr.hasNext())
		  {
		  System.out.println(itr.next()); 
		  }
		
		//Enhanced for Loop
		for(int i :list ) 
		{ 
			System.out.println(i);
		  }
		 
		//Internal Iteration
		//forEach Method
		list.forEach(temp -> System.out.println(temp));

	}

}
