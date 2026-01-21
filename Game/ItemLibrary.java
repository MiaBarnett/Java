package Game;
import Game.Classes.*;
import java.util.*;
public class ItemLibrary {
    public static LinkedHashMap<String, Item<Weapon>> weaponsLibrary = new LinkedHashMap<>(); 
    public static void main(String[] args) {
        weaponsLibrary.put("Copper Shortsword", new Item<Weapon>(new Weapon(0, "shortsword", "1D4"), 0));
        weaponsLibrary.put("Copper Broadsword", new Item<Weapon>(new Weapon(0, "broadsword", "1D6"), 1));
        weaponsLibrary.put("Scoped Knife", new Item<Weapon>(new Weapon(0, "dagger", "1D4"), 2));
    }
    
}
