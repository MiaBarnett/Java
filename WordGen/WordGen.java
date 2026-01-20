package WordGen;
public class WordGen {
    public static String readString(String str) {
        String result = "";
        if (")".equals(str)) {

        }
        for (int i = 0; i < str.length(); ++i) {
            if ("(".equals(str.substring(i, i + 1))) {
                
                result.concat(readString(str.substring()))
            }
        }
        return result;
    }
    public static void main(String[] args) {
        WordGen.readString("(t/r)a/(b/h)[(h)(c)r!hcr]i");
    }
}
