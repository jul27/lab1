package ru.bstu.iitus.kb51.jac;

import static ru.bstu.iitus.kb51.jac.Constans.COUNT_HOUSE;
import static ru.bstu.iitus.kb51.jac.Reader.getInt;

class ApartmentHouse extends Building {

    private int countHouse;

    private void setCountHouse(int countHouse) {
        this.countHouse = countHouse;
    }

    private int getCountHouse() {
        return countHouse;
    }

    public void init() throws InputTypeException {
        super.init();
        setCountHouse(getInt(COUNT_HOUSE));
    }

    public String toString() {
        return super.toString() + COUNT_HOUSE + getCountHouse() + "\n";
    }
}
