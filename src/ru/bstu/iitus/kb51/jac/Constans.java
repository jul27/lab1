package ru.bstu.iitus.kb51.jac;

/**
 * Created by Julia on 11.10.2016.
 */
public enum Constans {
    NAME("Название конструкции: "),
    EXPLOTATION_PERIOD("Период эксплуатации: "),
    MATERIAL("Материал конструкции: "),
    COUNT_FLOOR("Количество этажей: "),
    COUNT_KASS("Количество касс: "),
    COUNT_HOUSE("Количество квартир: "),
    LENGTH("Длина путепроводного сооружения: "),
    TYPE("Тип сооружения: "),
    SQUARE("Площадь сооружения: "),
    SELECTABLE_CONSTRUCTION("Сооружение для выбора: \n"),
    COUNT_OF_CONSTRUCTION("Количество конструкций: ");


    private String s;

    Constans(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}

