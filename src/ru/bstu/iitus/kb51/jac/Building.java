package ru.bstu.iitus.kb51.jac;

abstract class Building extends Construction {

    private int countFloor;//  кол-во этажей или этаж??

    void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    private int getCountFloor() {
        return countFloor;
    }

    public abstract void init();

    public String toString() {
        return super.toString() + "Количество этажей - " + getCountFloor() + "\n";
    }
}
