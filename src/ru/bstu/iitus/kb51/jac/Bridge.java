package ru.bstu.iitus.kb51.jac;

class Bridge extends WayConstructions {
    private String type;

    private void setType(String type) {
        this.type = type;
    }

    private String getType() {
        return type;
    }

    public void init() {

        setName(getString("Введите название: "));
        setExploitationPeriod(getInt("Введите срок эксплуатации: "));
        setMaterial(getString("Материал: "));
        setType(getString("Тип моста: "));
        setLength(getInt("Длина моста"));
    }

    Bridge() {
        init();
    }

    public String toString() {
        return super.toString() + "тип моста - " + getType() + "\n";
    }
}
