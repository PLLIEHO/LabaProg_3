package laba3.location;

import laba3.human.Item;

import java.util.ArrayList;

public class Location extends AbstractLocation implements Locateable {
    private LocationType type;
    private ArrayList<Location> subs = new ArrayList<Location>();
    private ArrayList<Item> items = new ArrayList<Item>();
    //private String destination;

    public Location(String name, LocationType type) {
        super(name);
        this.type = type;
        System.out.println("Создана локация " + name + ".");
    }

    @Override
    public void addSubLocation(Location location) {
        if (subs.contains(location)) {
            System.out.println(location.getName() + " уже добавлена");
        } else {
            System.out.println("Локация " + location.getName() + " добавлена в " + getName());
            subs.add(location);
        }
    }

    @Override
    public void removeSubLocation(Location location) {
        if (subs.contains(location)) {
            subs.remove(location);
            System.out.println("Локация " + location.getName() + " убрана из локации " + getName());
        } else {
            System.out.println("Локация " + location.getName() + " не находится здесь");
        }
    }

    public void addItem(Item item, Location location) {
            System.out.println("Предмет " + item + " добавлен в " + getName());
            items.add(item);
            //String destination = location.getName();
    }

    //public void getDestination(){
    //    System.out.println("Искомый предмет находится в " + destination);
    //}

    public void removeItem(Item item) {
        if(items.contains(item)){
            System.out.println("Предмет убран из " + getName());
            items.remove(item);
        } else {
            System.out.println("Предмет  не содержится в " + getName());
        }
    }

    public LocationType getType() {
        return type;
    }

    public void changeType(LocationType type) {
        System.out.println("Локация " + this.type + " теперь " + type);
        this.setName(type.toString());
        this.type = type;
    }

    //public List<SubLocations> getLocations() {
      //  return subs;
    //}
}
