package com.java8.fp;

import java.util.function.Function;

public class TestLamda {
	
	
	static Function<Integer, Integer>	add = x -> x + 1 ;
	
	public static void main(String[] args) {
		
	
	
	System.out.println(add.apply(1));
		
	}
	
	

}
