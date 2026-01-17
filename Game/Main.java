package Game;

import java.util.*;

public class Main {
    public static CharRoster roster = new CharRoster();
    public static void main() {
        try (Scanner input = new Scanner(System.in)) {
            
            LinkedHashMap<String, Object> args1 = new LinkedHashMap<>(Map.ofEntries(Map.entry("name", input.nextLine().strip().split(" ")), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())}), Map.entry("stats", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next())})));
            Character example = new Character(args1);
            roster.addChar(example);
            example.print_data();
            example.update(new LinkedHashMap<>(Map.ofEntries(Map.entry("name", input.nextLine().strip().split(" ")), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())}), Map.entry("stats", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next())}))));
            //Does this work? ^^
            example.print_data();
        }
        
    }

}