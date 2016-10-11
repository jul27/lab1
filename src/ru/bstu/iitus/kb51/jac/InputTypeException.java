package ru.bstu.iitus.kb51.jac;

class InputTypeException extends NullPointerException {
    InputTypeException(int errorCode) {
        super("Введен не правильный тип!\n Было введено  - " + errorCode);
    }
}