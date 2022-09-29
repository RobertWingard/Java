package com.robert.zookeeper;

public class Mammal {
	protected int displayEnergy;
	protected String eatBananas;
	protected String climb;
	protected String fly;
	protected String eatHuman;
	protected String attackTown;
	
	
	
	
	
	// Method
	public double displayEnergy() {
		System.out.println("This is the Energy of Mammal: " +  this.displayEnergy);
		return this.displayEnergy;		
	}
	
	public String throwSomething(String throwSomething) {
		this.displayEnergy -=5;
		System.out.println("you just threw an " + throwSomething + " and your energy decreased by 5. remaining energy: " + this.displayEnergy);
		return throwSomething;
	}
	
	public void fly(String fly) {
		this.displayEnergy -=50;
		System.out.println("whoosh whoooosh. remaining energy: " + this.displayEnergy);
	}	
	
	public void eatHuman(String eatHumans) {
		this.displayEnergy +=25;
		System.out.println("so...well nevermind. Energy Increses by 25. Total Energy: " + this.displayEnergy);
	}
	
	public void attackTown(String attackTown) {
		this.displayEnergy -=100;
		System.out.println("burn burn....burn...crispy... Energy decreases by 100. New Energy:" + this.displayEnergy);
	}
	
	
	public void eatBananas(String eatBanana) {
		this.displayEnergy +=10;
		System.out.println("Gorilla has eaten and his energy increased by 10, remaining energy: " + this.displayEnergy);
		
	}
	
	public void climb(String climb) {
		this.displayEnergy -=10;
		System.out.println("Gorilla has climbed a " + climb + " and its energy decreased by 10, remaining energy: " + this.displayEnergy);
		
	}
	// constructor
	
	public  Mammal() {}
		
	public Mammal(int energy) {
		this.displayEnergy = energy;
	}
	
	
	

	

	//Getters and Setters
	public double DisplayEnergy() {
		return getDisplayEnergy();
		
	}
	
	public String getEatBananas() {
		return eatBananas;
	}
	public void setEatBananas(String eatBananas) {
		this.eatBananas = eatBananas;
	}
	public String getClimb() {
		return climb;
	}
	public void setClimb(String climb) {
		this.climb = climb;
	}


	public int getDisplayEnergy() {
		return displayEnergy;
	}
}
