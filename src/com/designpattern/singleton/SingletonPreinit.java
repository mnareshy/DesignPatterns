package com.designpattern.singleton;

public class SingletonPreinit {
	private static final SingletonPreinit instance = new SingletonPreinit();

	private SingletonPreinit() {}

	public static SingletonPreinit getInstance() {
		return instance;
	}

}
