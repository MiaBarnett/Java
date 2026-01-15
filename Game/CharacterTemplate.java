package Game;

import java.util.Map;

public interface CharacterTemplate {
    public void update(Object[] params);
    public void save();
    Map<String, Object> retrieve_char_dat();
}
