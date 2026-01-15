package Game;

import java.util.*;

public class Main {
    public static void main() {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Character> charRoster = new ArrayList<>();
            Map<String, Object> args1 = new HashMap<>(Map.ofEntries(Map.entry("name", input.next()), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())})));
            Character example = new Character(args1);
            charRoster.add(example);
            example.print_data();
            Map<String, Object> args2 = new HashMap<>(Map.ofEntries(Map.entry("name", input.next()), Map.entry("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())})));
            example.update(args2);
            example.print_data();
        }
        
    }

}