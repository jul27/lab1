package ru.bstu.iitus.kb51.jac;

public enum TypeConstruction {
    BRIDGE("Мост", 1, Bridge.class),
    APARTMENT_HOUSE("Многоквартирный дом", 2, ApartmentHouse.class),
    PRIVATE_HOME("Частный дом", 3, PrivateHome.class),
    TUNNEL("Туннель", 4, Tunnel.class);

    private String name;
    private int type;
    private Class<? extends Construction> constructionClass;

    TypeConstruction(String name, int type, Class<? extends Construction> constructionClass) {
        this.name = name;
        this.type = type;
        this.constructionClass = constructionClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setConstructionClass(Class<? extends Construction> constructionClass) {
        this.constructionClass = constructionClass;
    }

    static TypeConstruction getConstructionType(int type) {
        for (TypeConstruction typePerson : TypeConstruction.values()) {
            if (typePerson.type == type) {
                return typePerson;
            }
        }
        throw new InputTypeException(type);
    }

    public static String getAllTypes() {
        String s = "";
        for (TypeConstruction typePerson : TypeConstruction.values()) {
            s += typePerson.getType() + " - " + typePerson.getName() + "\n";
        }
        return Constans.SELECTABLE_CONSTRUCTION + s;
    }

    public Class<? extends Construction> getConstructionClass() {
        return constructionClass;
    }
}