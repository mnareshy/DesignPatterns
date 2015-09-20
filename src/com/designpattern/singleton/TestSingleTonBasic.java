package com.designpattern.singleton;

public class TestSingleTonBasic {

	public static void main(String[] args) {

		SingleTonBasic singleTonBasic = SingleTonBasic.getInstance();

		System.out.println(singleTonBasic);


		SingleTonBasic singleTonBasic2 = SingleTonBasic.getInstance();

		System.out.println(singleTonBasic2);
	}

}
