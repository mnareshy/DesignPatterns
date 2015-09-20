package com.java.annotations;

public class RevStr {
	
	public static void main(String[] args) {
		
		String str = "yendukila, panikirani chavatalakichhi";
		
		System.out.println(reverseRecursively(str));
	}
	

	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        
//        System.out.println(str.substring(1)+" : "+str.charAt(0)) ;
        System.out.println("-> "+str);

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }


}
