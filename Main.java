package com.sksoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner readLine = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl zwischen 0 un 24 ein ( Stunde des Tages) : ");
        String value = readLine.nextLine();

        int value1 = Integer.parseInt(value);

        if ((value1 >= 8 && value1 < 12) || (value1 >= 13 && value1 <= 16)) {
            if ((value1 >= 8 && value1 <= 12)) {
                System.out.println("Arbeitszeit : Vormittag");
            } else {
                System.out.println("Arbeitszeit : Nachmittag");
            }

        } else if ((value1 >= 12 && value1 < 13)) {
            System.out.println("MittagsPause !");

        } else {
            System.out.println("Freizeit !");
        }

    }
}
