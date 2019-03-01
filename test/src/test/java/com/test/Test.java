package com.test;

/**
 *
 */
public class Test {

    public static void main(String[] args) throws Exception {
        while(true){
            Class<?> forName = Class.forName("com.test.TestOne");
            TestOne testOne = (TestOne) forName.newInstance();
            testOne.test();
            Thread.sleep(1000);
            forName.getClassLoader();
        }
    }

}