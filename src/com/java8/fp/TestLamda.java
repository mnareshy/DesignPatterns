package com.java8.fp;

import java.util.function.Function;

public class TestLamda {

	public static void main(String[] args) {

		Function<Integer, Integer>	add = x -> x + 1 ;

		System.out.println(add.apply(1));


		Function<String, String>	concatinate = x -> x + 1 ;

		System.out.println(concatinate.apply("2"));
		
		Function<Integer, Integer> add1 = TestLamda::add1;
		System.out.println(add1.apply(1));
	}
	
	public static Integer add1(Integer x)
	{
		return x+1;
	}



}
