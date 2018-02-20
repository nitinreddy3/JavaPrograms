package com.nitin;

public class Main {

    public static void main(String[] args) {

        // byte variable
        byte myByteVar = 100;

        // short variable
        short myShortVar = 128;

        // int variable
        int myIntVar = 10;

        // long variable
        long myLongVar = 50000L + 10L * (myByteVar + myIntVar + myShortVar);

        System.out.println("Long total is " + myLongVar);
    }
}
