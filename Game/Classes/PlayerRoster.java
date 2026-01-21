package Game.Classes;

import java.util.ArrayList;

public class PlayerRoster {
    public ArrayList<Player> playerRoster = new ArrayList<>();

    public void addChar(Player chr) {
        playerRoster.add(chr);
    }

    public void removeChar(Integer id) {
        playerRoster.remove(playerRoster.get(id));
        for (int i = id + 1; i < playerRoster.size(); ++i) {
            playerRoster.get(i).idDown();
        }
    }

    public Player getChar(Integer id) {
        return playerRoster.get(id);
    }
}
