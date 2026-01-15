import java.util.*;

public class Cockney extends English {
public Cockney() {
String message = "Hello world!";
}
public Cockney(String msg) {
    String message = msg;
}
public boolean checkAlNum(String msg) {
    for (char c : msg.toCharArray()) {
        if (!(Character.isLetterOrDigit(c))) {
            return false;
        }
    }
    return true;
}
}