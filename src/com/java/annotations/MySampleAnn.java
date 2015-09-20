package com.java.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface MySampleAnn {
	 
    String name();
    String desc();
}

class MyAnnTest{
    
    @MySampleAnn(name = "test1", desc = "testing annotations")
    public void myTestMethod(){
        //method implementation
    }
}
