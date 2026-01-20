package Game;

import java.util.*;

public class Main {
    public static CharRoster roster = new CharRoster();
    public static void main() {
        try (Scanner input = new Scanner(System.in)) {
            Character example = new Character(new LinkedHashMap<>(Map.ofEntries(Map.entry("name", input.next().strip().split(" ")), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())}), Map.entry("stats", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next())}))));
            roster.addChar(example);
            example.printData();
            example.update(new LinkedHashMap<>(Map.ofEntries(Map.entry("name", input.next().strip().split(" ")), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())}), Map.entry("stats", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next())}))));
            example.printData();
        }
        
    }

}