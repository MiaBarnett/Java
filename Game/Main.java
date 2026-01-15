package Game;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        ArrayList charRoster = new ArrayList<Character>();
        Object[] args = new Object[] {input.next(), Integer.valueOf(input.next()), Integer.valueOf(input.next())};
        Character example = new Character(args);
        example.print_data();
}

}
