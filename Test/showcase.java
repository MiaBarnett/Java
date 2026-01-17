import module java.base;

public class showcase {
    static List<Integer> example = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    static List<Integer> result1 = example.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    static List<Integer> result2 = example.stream().forEach();
    public static void main(String[] args) {
        System.out.println(result1);
    }
}
