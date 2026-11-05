package org.example;

import java.util.Scanner;

public class Main {

    public static String check(int n) {

        if (n % 400 == 0)
            return "Leap year";

        else if (n % 100 == 0)
            return "Century year";

        else if (n % 4 == 0)
            return "Leap year";

        else
            return "Non-Leap year";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(check(n));

    }
}
