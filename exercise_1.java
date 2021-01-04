package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        wakeUpInTheMorning();
        GoToCar();
        driveToWork();
        goToDinner();
        goToMovie();
        goToSleep();
        example_4();

    }

    private static void example_4() {
        int a = 1;
        a++;
        System.out.println("a: " + a);
    }

    private static void goToSleep() {
        System.out.println("Good Night");
    }

    private static void goToMovie() {
        System.out.println("bla bla bla");
    }

    private static void goToDinner() {
        System.out.println("Bon Appetite");
    }

    private static void driveToWork() {
        System.out.println("Beep - Beep");
    }

    private static void GoToCar() {
        System.out.println("Favorite song");
    }

    private static void wakeUpInTheMorning() {
        System.out.println("Good Morning");
    }
}
