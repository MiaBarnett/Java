package Game.Classes;

public interface GameObject<contentType> {
    contentType getContents();
    void printContents();
}
