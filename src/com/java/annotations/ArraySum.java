package com.java.annotations;

public class ArraySum {
	
	public static void main(String[] args) {
		
		
		int[] intArray = {1,2,3,4};
		ArraySum arraySum = new ArraySum();
		System.out.println(arraySum.recSum(intArray,intArray.length-1));
		
	}

	private int recSum(int[] intArray, int index) {
		// TODO Auto-generated method stub
		if(index == 0)
			return intArray[index];
		
				
		return intArray[index] + recSum(intArray, index-1);
				
	}


}
