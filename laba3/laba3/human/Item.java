package laba3.human;

public enum Item {
    CAR("Машинка"),
    GAME("Головоломка"),
    CONSTRUCTOR("Конструктор"),
    BAG("Мешочек с камнями"),
    PISTOL("Пистолет");

    private final String name;

    Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    public static void describe(Item item, Human human){
        if(item.equals(Item.PISTOL)){
            System.out.println("Это самый прекрасный, самый маленький в мире " + item + ", а стреляет так же громко, как большой!");
        } else {
            human.shakeHead();
            System.out.println("Нет, это совсем не то");
            System.out.println();
        }
    }
}