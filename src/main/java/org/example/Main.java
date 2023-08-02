package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=Wb5RcDvZpCM&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=24
 * @author Farida Fatali
 */

// SMS size calculation program: each message consists of 160 characters. The program finds how many sms the entered message is divided into.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the message:");
        String message = scanner.nextLine();

        double smsLength = Math.ceil(message.length() / 160.0);
        //   System.out.println(Math.ceil(smsLength));

        if (message.length() <= 160) {
            System.out.println("Your message consists of " + message.length() + " character. It's 1 sms.");
        } else {
            System.out.println("Your message is " + message.length() + " character. It can be split into " + (int) smsLength + " sms.");
        }
    }
}