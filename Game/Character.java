package Game;

import module java.base;

public class Character {
    public Integer id;
    public String[] name; //variable size
    public Integer[] height; //2 fields, feet and inches
    public Integer[] stats; //10 fields, stat block
    public String[] inventory; //30 fields, inventory slots

    public Character(Map<String, Object> params) {
        this.id = Main.roster.charRoster.size(); //used for indexing characters in character selection screen and char-editing methods
        this.name = (String[]) params.get("name");
        this.height = (Integer[]) params.get("height");
        this.stats = (Integer[]) params.get("stats");
    }

    public void update(Map<String, Object> params) {
        this.name = (String[]) params.get("name");
        this.height = (Integer[]) params.get("height");
        this.stats = (Integer[]) params.get("stats");
    }

    public void idDown() {
        this.id -= 1;
    }

    public void idUp() {
        this.id += 1;
    }
    
    public Map<String, Object> retrieveCharDat() {
        LinkedHashMap<String, Object> dataset = new LinkedHashMap<>(Map.ofEntries(Map.entry("id", this.id), Map.entry("name", this.name), Map.entry("height", this.height), Map.entry("stats", this.stats)));
        return dataset;
    }

    public void printData() {
        System.out.println("Id: " + this.id);
        System.out.print("Name:");
        for (String s : this.name) {
            System.out.print(" " + s);
        }
        System.out.println();
        System.out.print("Height:");
        for (Integer s : this.height) {
            System.out.print(" " + s);
        }
        System.out.println();
        System.out.print("Stats:");
        for (Integer s : this.stats) {
            System.out.print(" " + s);
        }
        System.out.println();
    }
}
