package ru.bstu.iitus.kb51.jac;

class PrivateHome extends Building {
    private int square;

    private void setSquare(int square) {
        this.square = square;
    }

    private int getSquare() {
        return square;
    }

    public void init() {
        setName(getString("Введите название: "));
        setExploitationPeriod(getInt("Введите срок эксплуатации "));
        setCountFloor(getInt("Количество этажей: "));
        setMaterial(getString("Материал: "));
        setSquare(getInt("Площадь: "));
    }

    PrivateHome() {
        init();
    }

    public String toString() {
        return super.toString() + "Площадь частного дома - " + getSquare() + "\n";
    }
}
