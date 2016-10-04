package ru.bstu.iitus.kb51.jac;

abstract class WayConstructions extends Construction {
    private int length;

    void setLength(int length) {
        this.length = length;
    }

    private int getLength() {
        return length;
    }

    public abstract void init();

    public String toString() {
        return super.toString() + "длина путепроводного сооружения - " + getLength() + "\n";
    }
}
