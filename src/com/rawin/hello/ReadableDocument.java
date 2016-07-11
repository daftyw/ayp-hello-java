package com.rawin.hello;

public class ReadableDocument extends Document {

    protected int number;
    protected static int runningNumber;

    public static void down() {
        runningNumber--;
    }

    public void count() {
        runningNumber++;
        number++;

        System.out.println("running Number:" + runningNumber
                + ",number:" + number);
    }
}