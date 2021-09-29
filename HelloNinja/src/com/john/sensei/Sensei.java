package com.john.sensei;

import com.john.helloninja.SuperNinja;

public class Sensei extends SuperNinja implements Knowledgeable {
	
	public Sensei(String name) {
		super(name);
	}

	@Override
	public String sayWisdom() {
		return "you are awesome!";
	}

}
