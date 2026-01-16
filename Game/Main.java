package Game;

import java.util.*;

public class Main {
    public static void main() {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Character> charRoster = new ArrayList<>();
            LinkedHashMap<String, Object> args1 = new LinkedHashMap<>(Map.ofEntries(Map.entry("name", input.nextLine().strip().split(" ")), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())}), Map.entry("stats", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next())})));
            Character example = new Character(args1);
            charRoster.add(example);
            example.print_data();
            LinkedHashMap<String, Object> args2 = new LinkedHashMap<>(Map.ofEntries(Map.entry("name", input.nextLine().strip().split(" ")), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())}), Map.entry("stats", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next()), Integer.valueOf(input.next())})));
            example.update(args2);
            example.print_data();
        }
        
    }

}