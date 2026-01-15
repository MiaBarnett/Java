package Game;

import java.util.*;

public class Character implements CharacterTemplate {
    private final Integer id;
    public String name;
    public Integer[] height = new Integer[2];

    public Character(Map<String, Object> params) {
        this.id = 0;
        this.name = (String)params.get("name");
        this.height = (Integer[]) params.get("height");
    }
    public void update(Map<String, Object> params) {
        this.name = (String)params.get("name");
        this.height = (Integer[])params.get("height");
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
        for (Map.Entry<String, Object> data : this.retrieve_char_dat().entrySet()) {
            switch (data.getValue()) {
                case Object[] Ia -> {
                    System.out.print(data.getKey() + "=");
                    for (Object object : Ia) {
                        switch (object) {
                            case Integer i -> {
                                System.out.print(i + " ");
                            }
                            case String s -> {
                                System.out.print(s + " ");
                            }
                            default ->
                                System.out.print((String)object + " ");
                        }
                    }
                }
                case Integer i -> {
                    System.out.println(i);
                }
                case String s -> {
                    System.out.println(s);
                }
                default ->
                    System.out.println(data);
            }
        }
    }
}
