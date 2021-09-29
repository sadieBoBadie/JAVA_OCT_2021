package com.john.helloninja;

public class Ninja {
// 	  Member variables -----------------
    private String name;
    private int health;
    
    
//    Constructor ----------
    public Ninja(String name){
        this.name = name;
        this.health = 100;
    }

// methods ---------------------------
    public void displayStats(){
        System.out.println("Name: " + this.getName());
        System.out.println("Health:" + this.getHealth());
    }

    public void eatStrawberry(){
        this.setHealth(10);
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
    
    
}
