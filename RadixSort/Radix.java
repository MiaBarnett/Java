package RadixSort;

import module java.base;

public class Radix {
    public static String[] radix(String[] arr, int depth, int longest, int size) {
        if (depth == -1 && longest != -1) return arr;
        if (size == -1) size = arr.length;
        if (longest == -1) {
            for (String s : arr) {
                if (s.length() > longest) longest = s.length();
            }
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i].length() < longest) arr[i] = ("0".repeat(longest - arr[i].length())).concat(arr[i]);
            }
        }
        if (depth == -1) depth = longest - 1;
        LinkedHashMap<Integer, String[]> buckets = new LinkedHashMap<>();
        int n = 1;
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == null) continue;
            ++count;
            if (buckets.keySet().contains((Integer) (int) arr[i].charAt(depth))) {
                buckets.get((Integer) (int) arr[i].charAt(depth))[n++] = arr[i];
            } else {
                buckets.put((Integer) (int) arr[i].charAt(depth), new String[size]);
            }
        }
        n = 0;
        String[] result = new String[count];
        for (Map.Entry<Integer, String[]> item : buckets.entrySet()) {
            for (String element : item.getValue()) {
                result[n++] = element;
            }
        }
        return radix(result, --depth, longest, size);
    }
    public static void main(String[] args) {
        String[] result = Radix.radix(new String[] {"3", "10", "2", "1", "100"}, -1, -1, -1);
        for (String s : result) {
            if (s == null) continue;
            System.out.println(s);
        }
    }
}
