package com.allstate.designpattern.singleton;

public class MultiThreadedEnv implements Runnable{


	@Override
	public void run() {
		// TODO Auto-generated method stub

//		SingleTonBasic singleTonBasic = SingleTonBasic.getInstance();
//		SingleTonMT singleTonMT = SingleTonMT.getInstance();
		SingleTonMTFinal singleTonMTFinal = SingleTonMTFinal.getInstance();
		
//		System.out.println(singleTonBasic);
//		System.out.println(singleTonMT);
		System.out.println(singleTonMTFinal);

		try {
			Thread.sleep(10000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
