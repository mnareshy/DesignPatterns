package com.allstate.designpattern.singleton;

public class SingleTonStaticBlock {

	private SingleTonStaticBlock() {
	}

	private static final SingleTonStaticBlock instance;

	static {

		instance = new SingleTonStaticBlock();

	}

	public static SingleTonStaticBlock getInstance() {
		return instance;
	}

}
