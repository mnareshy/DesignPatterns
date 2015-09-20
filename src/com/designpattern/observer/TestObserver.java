package com.designpattern.observer;

public class TestObserver {
	
	public static void main(String[] args) {
		
		Redmi redmi = new Redmi();
		
		FlifKartUser fUser1  = new FlifKartUser("Naresh M");
		FlifKartUser fUser2  = new FlifKartUser("Hari Nair");
		FlifKartUser fUser3  = new FlifKartUser("Ranga L");
		FlifKartUser fUser4  = new FlifKartUser("Sachin Jain");
		
		redmi.addObserver(fUser1);
		redmi.addObserver(fUser2);
		redmi.addObserver(fUser3);
		redmi.addObserver(fUser4);
		
		redmi.setInStock(false);
		
		redmi.removeObserver(fUser4);
		
		redmi.setInStock(true);
		
		redmi.setInStock(false);
		
		redmi.addObserver(fUser4);
		
		redmi.setInStock(true);
		
	}

}
