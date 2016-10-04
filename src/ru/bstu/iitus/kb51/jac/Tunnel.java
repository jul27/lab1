package ru.bstu.iitus.kb51.jac;

class Tunnel extends WayConstructions {
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
        setType(getString("Тип туннеля: "));
        setMaterial(getString("Материал: "));
        setLength(getInt("Длина туннеля: "));
    }

    Tunnel() {
        init();
    }

    public String toString() {
        return super.toString() + "тип туннеля - " + getType() + "\n";
    }
}
