package Game;

import java.util.ArrayList;

public class CharRoster {
    public ArrayList<Character> charRoster = new ArrayList<>();

    public void addChar(Character chr) {
        charRoster.add(chr);
    }

    public void removeChar(Integer id) {
        for (int i = id + 1; i < charRoster.size(); ++i) {
            charRoster.get(i).idDown();
        }
        charRoster.remove(charRoster.get(id));
    }

    public Character getChar(Integer id) {
        return charRoster.get(id);
    }
}
