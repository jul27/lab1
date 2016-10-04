package ru.bstu.iitus.kb51.jac;

class ApartmentHouse extends Building {

    private int countHouse;

    private void setCountHouse(int countHouse) {
        this.countHouse = countHouse;
    }

    private int getCountHouse() {
        return countHouse;
    }

    public void init() {
        setName(getString("Введите название: "));
        setExploitationPeriod(getInt("Введите срок эксплуатации: "));
        setCountHouse(getInt("Введите количество квартир: "));
        setCountFloor(getInt("Количество этажей: "));
        setMaterial(getString("Материал: "));
    }

    ApartmentHouse() {
        init();
    }

    public String toString() {
        return super.toString() + "количество квартир - " + getCountHouse() + "\n";
    }
}
