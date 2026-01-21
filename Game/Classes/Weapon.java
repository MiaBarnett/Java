package Game.Classes;

public class Weapon {
    public final Integer id;
    public String type;
    public String hitdice;
    public Weapon(Integer id, String type, String hitdice) {
        this.id = id;
        this.type = type;
        this.hitdice = hitdice;
    }
}
