package com.java.annotations;

public class RevInt {
	
	public static void main(String[] args) {
		
		
		int i = 1234;
		int lenght = new String(i+"").length();
		int rev = 0;
				
		while(lenght > 0)
		{
			
			rev =rev*10 + i%10;
			i = i/10;
			
			lenght--;
		}
		
		
		System.out.println(rev);
		
	}

}
