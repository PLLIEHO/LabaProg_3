package laba3.human;

import laba3.location.Location;

public class Human extends AbstractHuman implements Humanable{
    public Human(String name, String age){
        super(name, age);
        System.out.println("Создан человек: " + name + ", " + age);
    }
    @Override
    public void show(Item item) {
        if(item.equals(Item.PISTOL)){
            System.out.println(getName() + " думает: " + item + " показывать нельзя!");
        } else {
        System.out.println(getName() + " показывает " + item);
        }
    }
    @Override
    public void comeUp(Human human, Item item) {
        System.out.println(getName() + " догадывается, что " + human.getName() + " хочет увидеть " + item);
    }
    @Override
    public void shakeHead() {
        System.out.println(getName() + " качает головой...");
    }
    @Override
    public void search(Location location) {
        System.out.println(getName() + " роется в " + location);
    }
    @Override
    public void find(Item item) {
        System.out.println(getName() + " находит " + item);
    }
}

