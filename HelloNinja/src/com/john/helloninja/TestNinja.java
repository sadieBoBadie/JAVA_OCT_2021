package com.john.helloninja;

import com.john.sensei.Sensei;

public class TestNinja {

	public static void main(String[] args) {
//		System.out.println("hello"); 
		
		Ninja ninja = new Ninja("Donatello");
		ninja.displayStats();
		System.out.println(ninja.getClass());
		
		SuperNinja kenshiro = new SuperNinja("Kenshiro");
		kenshiro.attack(ninja);
		
		ninja.displayStats();
		
		Sensei masterSplinter = new Sensei("Master Splinter");
		System.out.println(masterSplinter.sayWisdom());
	}

}
