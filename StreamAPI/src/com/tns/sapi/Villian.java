package com.tns.sapi;

public class Villian implements Actor{

	@Override
	public void act() {
		System.out.println("I know to act");
		
	}

	@Override
	public void speak() {
		System.out.println("I can speak");
		
	}

	public void rude() {
		System.out.println("I know to behave rude");
		
	}
	
}
