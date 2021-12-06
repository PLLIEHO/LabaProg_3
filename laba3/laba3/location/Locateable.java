package laba3.location;

import laba3.human.Item;

public interface Locateable {
    void addSubLocation(Location location);
    void removeSubLocation(Location location);
    void addItem(Item item, Location location);
    void removeItem(Item item);
    //void getDestination();
}
