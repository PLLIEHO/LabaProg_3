package laba3.human;

import java.util.Objects;

public abstract class AbstractHuman {
    private String name;
    private String age;

    public AbstractHuman(){
        this("Неизвестный", "Возраст неясен");
    }
    public AbstractHuman(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Человек " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Math.random());
    }
}

