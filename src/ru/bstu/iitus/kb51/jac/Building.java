package ru.bstu.iitus.kb51.jac;

import static ru.bstu.iitus.kb51.jac.Constans.COUNT_FLOOR;
import static ru.bstu.iitus.kb51.jac.Reader.getInt;

abstract class Building extends Construction {

    private int countFloor;

    void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    private int getCountFloor() {
        return countFloor;
    }

    public void init() throws InputTypeException {
        super.init();
        setCountFloor(getInt(COUNT_FLOOR));
    }

    public String toString() {
        return super.toString() + COUNT_FLOOR + getCountFloor() + "\n";
    }
}
