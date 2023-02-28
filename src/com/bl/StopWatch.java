package com.bl;

import java.util.Scanner;

public class StopWatch {

    static double Start = 0, Stop = 0;

    static void startTime() {
        Start = System.currentTimeMillis();
        System.out.println("started at " + Start);
    }

    static void stopTime() {
        Stop = System.currentTimeMillis();
        System.out.println("stopped at " + Stop);
    }

    static void elapsedTime() {
        System.out.println("elapsed time is " + (Stop - Start) / 1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to start");
        sc.next();
        startTime();
        System.out.println("enter to stop");
        sc.next();
        stopTime();
        elapsedTime();
    }
}