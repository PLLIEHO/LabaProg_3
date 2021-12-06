package laba3.location;

public enum LocationType{
    TABLE("Письменный стол"),
    CRATE("Верхний ящик"),
    BOX("Спичечный коробок");

    private final String name;
    LocationType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}