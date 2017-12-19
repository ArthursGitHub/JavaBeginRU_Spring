package com.tutorialspoint;

public class Logging {
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}