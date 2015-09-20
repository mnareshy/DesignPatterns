package com.designpattern.singleton;

public class TestEnmSingleton {
	
	public static void main(String[] args) {
		
		SingleTonUsingEnum singleton = SingleTonUsingEnum.INSTANCE;
		
		singleton.operation();
		
	}

}
