package Game;

import java.util.*;

public class Character implements CharacterTemplate {
    private final int id;
    public String name;
    public int[] height;

    public Character(Object[] params) {
        this.id = 0;
        this.name = (String)params[0];
        this.height = new int[] {(Integer)params[1], (Integer)params[2]};
    }
    public void update(Object[] params) {
        this.name = (String)params[0];
        this.height = new int[] {(int)params[1], (int)params[2]};
    }
    public void save() {

    }
    public List<Object> retrieve_char_dat() {
        List<Object> dataset = new ArrayList<>();
        dataset.add(this.id);
        dataset.add(this.name);
        dataset.add(this.height);
        return dataset;
    }
    public void print_data() {
        System.out.println(this.height[0]);
        for (Object data : this.retrieve_char_dat()) {
            switch (data.getClass().getName()) {
                case "int":
                    System.out.println(data);
                case data | data.
                default:
                    System.out.println(data);
            }
            System.out.println(data);
        }
    }
}
