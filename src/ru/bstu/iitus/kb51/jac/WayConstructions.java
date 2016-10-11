package ru.bstu.iitus.kb51.jac;

import static ru.bstu.iitus.kb51.jac.Constans.LENGTH;
import static ru.bstu.iitus.kb51.jac.Reader.getInt;

abstract class WayConstructions extends Construction {
    private int length;

    void setLength(int length) {
        this.length = length;
    }

    private int getLength() {
        return length;
    }

    public void init() throws InputTypeException {
        super.init();
        setLength(getInt(LENGTH));
    }

    public String toString() {
        return super.toString() + LENGTH + getLength() + "\n";
    }
}
