
package com.java.annotations;

public class Fibanoci {

	public static void main(String[] args) {

		int n = 12;

		int n0 = 0;
		int n1 = 1;
		int next;

		System.out.println(n0 +" "+n1);

		for (int i=0; i<=n-2 ; i++)
		{
			next = n0+n1;
			n0 = n1;
			n1 = next;
			System.out.println(next);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Fibanoci fibanoci = new Fibanoci();
		System.out.println(fibanoci.findN(12));

	}

	private int findN(int i) {
		// TODO Auto-generated method stub
		

	if(i == 0)
		return 0;
	if(i == 1)
		return 1;
	
			
	return findN(i-1) + findN(i-2);
	}

}
