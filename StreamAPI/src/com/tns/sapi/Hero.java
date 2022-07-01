package com.tns.sapi;

public class Hero implements Actor{

		@Override
		public void act() {
			System.out.println("I know to act");
			
		}

		@Override
		public void speak() {
			System.out.println("I can speak");
			
		}
		public void dance() {
		
			System.out.println("I know to dance ");
		}

}
	
