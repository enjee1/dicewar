package com.company;

import java.util.Scanner;

public class CLI {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String question) {

        System.out.print(question);
        return scanner.nextLine();
    }
}
