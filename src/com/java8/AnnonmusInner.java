package com.java8;

public class AnnonmusInner {
	
	
	
	
	public static void main(String[] args) {
		
		
		AnnonmusInner aI =  new AnnonmusInner(){
			
			public String getMessage(){
				
				return "some messgae";
			}
		};
		
	
		System.out.println(aI.getMessage());
	}


public String getMessage(){
		
		return "some messgae1";
	}




}
