package Game;

import java.util.*;
import Game.Character.charRoster;

public class Character {
    private Integer id;
    public String[] name; //variable size
    public Integer[] height; //2 fields, feet and inches
    public Integer[] stats; //10 fields, stat block

    public Character(Map<String, Object> params) {
        this.id = charRoster.length; //used for indexing characters in character selection screen and char-editing methods
        this.name = (String[]) params.get("name");
        this.height = (Integer[]) params.get("height");
        this.stats = (Integer[]) params.get("stats");
    }
    public void update(Map<String, Object> params) {
        this.name = (String[]) params.get("name");
        this.height = (Integer[]) params.get("height");
        this.stats = (Integer[]) params.get("stats");
    }
    public void save() {

    }
    public Map<String, Object> retrieve_char_dat() {
        LinkedHashMap<String, Object> dataset = new LinkedHashMap<>(Map.ofEntries(Map.entry("id", this.id), Map.entry("name", this.name), Map.entry("height", this.height), Map.entry("stats", this.stats)));
        return dataset;
    }
    public void print_data() {
        System.out.println(this.stats.length);
        for (Map.Entry<String, Object> data : this.retrieve_char_dat().entrySet()) {
            switch (data.getValue()) {
                case Object[] Oa -> {
                    System.out.print(data.getKey() + "=");
                    for (Object object : Oa) {
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
                    System.out.println();
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
