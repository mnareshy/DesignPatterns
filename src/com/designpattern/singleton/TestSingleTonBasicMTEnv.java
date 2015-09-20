package com.designpattern.singleton;

public class TestSingleTonBasicMTEnv {

	   public static void main(String[] args) {
           
           MultiThreadedEnv multiThreadedEnv = new MultiThreadedEnv();
          
           Thread thread1 = new Thread(multiThreadedEnv);
           Thread thread2 = new Thread(multiThreadedEnv);
          
          
           thread1.start();
           thread2.start();
    }
}
