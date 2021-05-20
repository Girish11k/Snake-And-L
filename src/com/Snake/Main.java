package com.Snake;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int IS_START = 0;

        double empCheck = Math.floor(Math.random() * 6 ) % 2;

        if (empCheck == IS_START)
            System.out.println("Start the Game");
        else
            System.out.println("Not Start the game");
    }
}
