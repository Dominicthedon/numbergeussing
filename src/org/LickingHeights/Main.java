package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code her
System.out.println("Hello PLayer");
System.out.println("Welcome to your number geussing Game");
        int geuss;
        geuss = 5;
        int answer;
        answer = (int) (Math.random() * 100);
System.out.println(answer);
        do {
            Scanner keyboard;
            keyboard = new Scanner(System.in);
            System.out.println("Please give me a number");
            geuss = keyboard.nextInt();
            if (geuss> answer){
                System.out.println("That number is too high. Geuss again");
            }
             else if (geuss < answer){
                System.out.println("This number is too low. Try again");
            }
             else if (geuss == answer) {
                System.out.println("Correct you win");
            }
        } while (geuss>answer || geuss < answer);


    }
}
