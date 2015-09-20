package com.designpattern.singleton;

public class SingleTonStaticInner {
	// Step 1: Private constructor prevents instantiation from other classes

	private SingleTonStaticInner() { }


	//  Step 2:  Inner is loaded on the first execution of SingleTonStaticInner.getInstance().

	private static class Inner {
		private static final SingleTonStaticInner instance = new SingleTonStaticInner();
	}

	public static SingleTonStaticInner getInstance() {
		return Inner.instance;
	}
}
