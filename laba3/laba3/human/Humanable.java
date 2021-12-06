package laba3.human;

import laba3.location.Location;

public interface Humanable {
    void show(Item item);
    void comeUp(Human human, Item item);
    void shakeHead();
    void search(Location location);
    void find(Item item);
}


