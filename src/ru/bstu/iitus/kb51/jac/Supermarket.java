package ru.bstu.iitus.kb51.jac;

import static ru.bstu.iitus.kb51.jac.Constans.COUNT_KASS;
import static ru.bstu.iitus.kb51.jac.Reader.getInt;

class Supermarket extends Building {
    private int countKass;

    public void init() throws InputTypeException {
        super.init();
        setCountKass(getInt(COUNT_KASS));

    }

    public String toString() {
        return super.toString() + COUNT_KASS + getCountKass() + "\n";
    }

    private void setCountKass(int countKass) {
        this.countKass = countKass;
    }

    private int getCountKass() {

        return countKass;
    }
}
