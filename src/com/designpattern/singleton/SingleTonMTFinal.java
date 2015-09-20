package com.designpattern.singleton;

public class SingleTonMTFinal {

	// Step 5: make the instance volatile for the reason mentioned in Step 4.
	private static  volatile SingleTonMTFinal instance = null;

	private SingleTonMTFinal() { }


	public static  SingleTonMTFinal getInstance() {

		//  Step 1: Verify if the instance is null before creating a instance.
		//  Step 6: Only one thread at a time will be get an opportunity to cross the           synchronized block , Once the object is created instantly all the reference     of instance be updated as not null since it is volatile.  And the following condition fails for the rest of the threads and return the already created object.


		if (instance == null) {

			//         Step 2: Synchronize the object creation part alone; Acquire the Lock on the Class since the accessible methods are static.   

			synchronized (SingleTonMT.class) {

				//      Step 3: Before creating the object verify if the instance is still null, This is known as Double-Checked Locking.
				//      Step 7: Double-Checked Locking is to ensure an even if a new thread enters into Synchronized block which the old thread leaving, it should return with //                 out creating a second object.


				if (instance == null) {

					//     Step 4: create the object and assign it to instance, this ensure that the threads waiting there with in synchronized block  for null check, will                           return as it fails. To ensure this to happen make the instance variable as volatile.

					instance = new SingleTonMTFinal();
				}

			}

		}
		return instance;
	}


}
