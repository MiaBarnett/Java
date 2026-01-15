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
    public Map<String, Object> retrieve_char_dat() {
        Map<String, Object> dataset = new HashMap<>();
        dataset.put("id", this.id);
        dataset.put("name", this.name);
        dataset.put("height", this.height);
        return dataset;
    }
    public void print_data() {
        System.out.println(this.height[0]);
        for (Map.Entry<String, Object> data : this.retrieve_char_dat().entrySet()) {
            switch (data.getValue()) {
                case Integer i -> {
                    System.out.println(i);
                }
                case String s -> {
                    System.out.println(s);
                }
                case Object[] Oa -> {

                }
                case int[] ia -> {

                }
                default ->
                    System.out.println(data);
            }
            System.out.println(data);
        }
    }
}
