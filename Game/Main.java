package Game;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> charRoster = new ArrayList<>();
        Map<String, Object> args = new HashMap<>();
        args.put("name", input.next());
        args.put("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())});
        Character example = new Character(args);
        charRoster.add(example);
        example.print_data();
        Map<String, Object> args2 = new HashMap<>();
        args2.put("name", input.next());
        args2.put("height", new Integer[] {Integer.valueOf(input.next()), Integer.valueOf(input.next())});
        example.update(args2);
        example.print_data();
        input.close();
    }

}