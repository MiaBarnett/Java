package Game;

import java.util.*;

public interface CharacterTemplate {
    public void update(Object[] params);
    public void save();
    public List<Object> retrieve_char_dat();
}
