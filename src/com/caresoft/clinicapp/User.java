package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected Integer pin;
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
	
    //Constructor
    public User(Integer id) {
    	this.id = id;
    }
    
    //Getters and Setters
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
    
    public int findPinLength(Integer pin) {
    	String pinString = Integer.toString(pin);
    	return pinString.length();
    }
}

