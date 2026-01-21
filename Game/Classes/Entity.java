package Game.Classes;

public class Entity<contentType> implements GameObject<contentType> {
    public final Integer id;
    public contentType contents;
    public Entity(contentType contents, Integer id) {
        this.contents = contents;
        this.id = id;
    }
    public contentType getContents() {
        return contents;
    }
    public void printContents() {
        System.out.println(contents.toString());
    }
}
