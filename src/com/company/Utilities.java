package com.company;

import java.io.IOException;

public class Utilities {
    private static String os = System.getProperty("os.name").toLowerCase();

    public static void clearScreen() {
        try {
            if (os.indexOf("win") >= 0) {
                Runtime.getRuntime().exec("cls");
            } else {
                System.out.println("should be clear");
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
    }
}
