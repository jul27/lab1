package ru.bstu.iitus.kb51.jac;

import static ru.bstu.iitus.kb51.jac.Constans.TYPE;
import static ru.bstu.iitus.kb51.jac.Reader.getString;

class Bridge extends WayConstructions {
    private String type;

    private void setType(String type) {
        this.type = type;
    }

    private String getType() {
        return type;
    }

    public void init() throws InputTypeException {
        super.init();
        setType(getString(TYPE));
    }

    public String toString() {
        return super.toString() + TYPE + getType() + "\n";
    }
}
