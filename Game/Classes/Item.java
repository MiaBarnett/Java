package Game.Classes;

public class Item<contentType> implements GameObject<contentType> {
    public final Integer id;
    public contentType contents;
    public Item(contentType contents, Integer id) {
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
