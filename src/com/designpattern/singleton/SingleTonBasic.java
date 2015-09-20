package com.designpattern.singleton;

public class SingleTonBasic {

	 private static  SingleTonBasic instance = null;
     
     private SingleTonBasic() { }
    
     public static SingleTonBasic getInstance() {
            if (instance == null) {

                   instance = new SingleTonBasic();
            }


            return instance;
     }
}
