import laba3.human.Human;
import laba3.human.Item;
import laba3.location.Location;
import laba3.location.LocationType;

public class Main {

    public static void main(String[] args) {
        Human malysh = new Human("Малыш", "Ребёнок");
        Human carlson = new Human("Карлсон", "Взрослый");
        System.out.println();

        Location table = new Location("Письменный стол", LocationType.TABLE);
        Location crate = new Location("Верхний ящик", LocationType.CRATE);
        Location box = new Location("Спичечный коробок", LocationType.BOX);
        System.out.println();

        table.addSubLocation(crate);
        crate.addSubLocation(box);
        System.out.println();

        Item car = Item.CAR;
        Item pistol = Item.PISTOL;
        Item bag = Item.BAG;
        Item game = Item.GAME;
        Item constr = Item.CONSTRUCTOR;

        box.addItem(pistol, box);
        System.out.println();

        malysh.show(car);
        Item.describe(car, carlson);
        malysh.show(bag);
        Item.describe(bag, carlson);
        malysh.show(game);
        Item.describe(game, carlson);
        malysh.show(constr);
        Item.describe(constr, carlson);

        malysh.comeUp(carlson, pistol);
        //box.getDestination();
        Item.describe(pistol, malysh);
        malysh.show(pistol);

    }
}
