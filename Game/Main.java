package Game;

import java.util.*;
import Game.Classes.*;
import Game.ItemLibrary;

public class Main {
    public static PlayerRoster roster = new PlayerRoster();

    public static void main() {
        ItemLibrary.main(new String[] {});
        try (Scanner input = new Scanner(System.in)) {
            Entity<Player> testEntity = new Entity<>(new Player(new LinkedHashMap<>(Map.ofEntries(Map.entry("name", input.next().strip().split(" ")), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())}), Map.entry("stats", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next())})))), 0);
            Item<Weapon> testItem = ItemLibrary.weaponsLibrary.get("Scoped Knife");
            testEntity.getContents().printData();
            System.out.println(testItem.getContents().type);
        }
    }
}