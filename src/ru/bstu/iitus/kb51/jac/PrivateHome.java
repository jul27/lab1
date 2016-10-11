package ru.bstu.iitus.kb51.jac;

import static ru.bstu.iitus.kb51.jac.Constans.SQUARE;
import static ru.bstu.iitus.kb51.jac.Reader.getInt;

class PrivateHome extends Building {
    private int square;

    private void setSquare(int square) {
        this.square = square;
    }

    private int getSquare() {
        return square;
    }

    public void init() throws InputTypeException {
        super.init();
        setSquare(getInt(SQUARE));
    }

    public String toString() {
        return super.toString() + SQUARE + getSquare() + "\n";
    }
}
