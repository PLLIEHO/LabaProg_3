package laba3.location;

import java.util.Objects;

public abstract class AbstractLocation {
    private String name;

    public AbstractLocation() {
        this("Тестовая локация");
    }

    public AbstractLocation(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Локация " + name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


