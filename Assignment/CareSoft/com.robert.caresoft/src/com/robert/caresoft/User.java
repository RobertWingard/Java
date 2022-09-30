package com.robert.caresoft;

public class User {
    protected Integer id;
    protected int pin;
	
 // DONE: Getters and setters
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
    
	// DONE: Implement a constructor that takes an ID
    public User() {}
    
    public User(Integer ID) {
    	this.id = ID;
    }
	
	
	
}
