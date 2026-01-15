package Game;

import java.util.*;

public interface CharacterTemplate {
    public void update(Map<String, Object> params);
    public void save();
    Map<String, Object> retrieve_char_dat();
}
