package ru.bstu.iitus.kb51.jac;

class Supermarket extends Building {
    private int countKass;

    public void init() {
        setName(getString("Введите название: "));
        setExploitationPeriod(getInt("Введите срок эксплуатации "));
        setCountFloor(getInt("Количество этаже: "));
        setMaterial(getString("Материал: "));
        setCountKass(getInt("Количество касс: "));

    }

    Supermarket() {
        init();
    }

    public String toString() {
        return super.toString() + "Количество касс - " + getCountKass() + "\n";
    }

    private void setCountKass(int countKass) {
        this.countKass = countKass;
    }

    private int getCountKass() {

        return countKass;
    }
}
