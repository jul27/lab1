package ru.bstu.iitus.kb51.jac;

import java.util.Scanner;

public class Reader {
    private static final Scanner SCANNER = new Scanner(System.in);

    static String getString(Enum infoMessage) {
        System.out.print(infoMessage.toString());
        return SCANNER.next();
    }

    public static int getInt(Enum infoMessage) {
        System.out.print(infoMessage.toString());
        return SCANNER.nextInt();
    }
}
