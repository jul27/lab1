package ru.bstu.iitus.kb51.jac;

import java.util.Scanner;

public abstract class Construction {
    private static final int SUPERMARKET = 0;
    private static final int PRIVATE_HOME = 1;
    private static final int APARTAMENT_HOUSE = 2;
    private static final int BRIDGE = 3;
    private static final int TUNNEL = 4;

    private static final Scanner SCANNER = new Scanner(System.in);

    private String material;
    private int exploitationPeriod;
    private String name;

    public abstract void init();

    public int getExploitationPeriod() {
        return exploitationPeriod;
    }

    void setExploitationPeriod(int exploitationPeriod) {
        this.exploitationPeriod = exploitationPeriod;
    }

    private String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    private String getMaterial() {
        return material;
    }

    public String toString() {
        return ("название конструкции - " + getName() + "\nпериод эксплуатации - " + getExploitationPeriod() + "\n" + "материал" +
                " конструкции - " + getMaterial() + "\n");
    }

    String getString(String informMessage) {
        System.out.print(informMessage);
        return SCANNER.next();
    }

    int getInt(String informMessage) {
        System.out.print(informMessage);
        return SCANNER.nextInt();
    }

    public static Construction create(int type) {
        switch (type) {
            case (SUPERMARKET):
                return new Supermarket();
            case (PRIVATE_HOME):
                return new PrivateHome();
            case (APARTAMENT_HOUSE):
                return new ApartmentHouse();
            case (BRIDGE):
                return new Bridge();
            case (TUNNEL):
                return new Tunnel();
            default:
                return null;
        }
    }
}