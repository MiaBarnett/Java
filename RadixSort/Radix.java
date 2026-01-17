package RadixSort;

import module java.base;

public class Radix {
    public static String[] radix(String[] arr) {
        int longest = 0;
        for (String s : arr) {
            if (s.length() > longest) longest = s.length();
        }
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].length() < longest) arr[i] = ("0".repeat(longest - arr[i].length())).concat(arr[i]);
        }
        String[][] buckets = new String[(int) 'z' - (int) '0'][arr.length];
        List<String> intermediate = new ArrayList<>();
        for (int i = 0; i < longest; ++i) {
            int n = 0;
            for (int j = 0; j < arr.length; ++j) {
                buckets[(int) arr[j].charAt(i) - (int) '0'][n++] = arr[j];
            }
            for (int k = 0; k < buckets.length; ++k) {
                if (buckets[k] != null) {
                    System.out.println(Arrays.asList(buckets[i][k]));
                    intermediate.add(buckets[i][k]);
                }
            }
            arr = (String[]) intermediate.toArray();
        }
        return buckets;
    }

    public static void main(String[] args) {
        String[] result = Radix.radix(new String[] {"3", "10", "2", "1", "100"});
        for (String s : result) {
            System.out.println(s);
        }
    }
}
