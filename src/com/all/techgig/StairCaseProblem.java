package com.all.techgig;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;

public class StairCaseProblem {

	public static int stairCostProblem(int[] input1)
	{

		LinkedList stairsList = new LinkedList();
		for (int currentInt : input1) {
			stairsList.add(currentInt);
		}

		return 0;
	}

	public static void main(String[] args) {

		int []stairs = {1,3,5,8,9,2,6,7,6,8,9};

		System.out.println(stairCostProblem(stairs));

	}

}
