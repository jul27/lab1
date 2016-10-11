package ru.bstu.iitus.kb51.jac;

import java.util.Scanner;

import static ru.bstu.iitus.kb51.jac.Constans.*;
import static ru.bstu.iitus.kb51.jac.Reader.getInt;
import static ru.bstu.iitus.kb51.jac.Reader.getString;

public abstract class Construction implements Comparable<Construction> {
    private static final int SUPERMARKET = 0;
    private static final int PRIVATE_HOME = 1;
    private static final int APARTAMENT_HOUSE = 2;
    private static final int BRIDGE = 3;
    private static final int TUNNEL = 4;

    private static final Scanner SCANNER = new Scanner(System.in);

    private String material;
    private int exploitationPeriod;
    private String name;

    public void init() throws InputTypeException {
        setName(getString(NAME));
        setExploitationPeriod(getInt(EXPLOTATION_PERIOD));
        setMaterial(getString(MATERIAL));
    }

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
        return (NAME + getName() + "\n" +
                EXPLOTATION_PERIOD + getExploitationPeriod() + "\n" +
                MATERIAL + getMaterial() + "\n");
    }

    @Override
    public int compareTo(Construction person) {
        return getExploitationPeriod() - person.getExploitationPeriod();
    }

    public static Construction create(int typePerson) throws IllegalAccessException, InstantiationException {
        TypeConstruction type = TypeConstruction.getConstructionType(typePerson);
        return type.getConstructionClass().newInstance();
    }

}