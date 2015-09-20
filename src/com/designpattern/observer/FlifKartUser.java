package com.designpattern.observer;

public class FlifKartUser implements Observer {
	
	private String userName = null;
	
	public FlifKartUser(String userName)
	{
		this.userName = userName;
	}


	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub
		
		Redmi redmi = (Redmi)observable;
		
		System.out.println("Redmi avilability status for the User : " +userName +" is :" +redmi.isInStock());

		if(redmi.isInStock())
		{
			buyIt();
		}
	}
	
	
	public void buyIt()
	{
		System.out.println("Bought Redmi 4g Note");
		
	}
	
	


}
