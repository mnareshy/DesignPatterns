package com.allstate.designpattern.singleton;

public class SingleTonMT {

	
	private static  SingleTonMT instance = null;
    
    private SingleTonMT() { }
   
    public static synchronized SingleTonMT getInstance() {
           if (instance == null) {

                  instance = new SingleTonMT();
           }


           return instance;
    }
    
}
