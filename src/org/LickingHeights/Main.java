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
        System.out.print(answer);

        do {
            Scanner keyboard;
            keyboard = new Scanner(System.in);
            System.out.print("Geuss an number");
            if (geuss> answer){
                System.out.println("You geuss the right answer ");
            }
             else if (geuss<answer){


        } while ()


    }
}
