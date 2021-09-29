package com.john.helloninja;

public class SuperNinja extends Ninja {
	private int power;
	
	public SuperNinja(String name) {
		super(name);
		this.setPower(50);
	}

	public void attack(Ninja target) {
		target.setHealth(target.getHealth() - this.getPower());
		System.out.println(target.getName() + " lost " + this.getPower() + " hp");
		
	}

//	------- GETTERS AND SETTERS -----
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
