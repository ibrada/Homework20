import java.util.*;

public class Main {

    public static void separator() {
        System.out.println("* * * * *");
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("word", "text", "text", "speech", "phrase", "letter", "phrase"));
        task4(List.of("один", "два", "два", "три", "три", "три"));
    }

    private static void task1(List<Integer> list) {
        separator();
        for (Integer number : list) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> list) {
        separator();
        Set<Integer> set = new TreeSet<>(list);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        separator();
        Set<String> text = new HashSet<>(words);
        for (String word : text) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static void task4(List<String> words) {
        separator();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 0);
            }
            map.put(word, map.get(word) + 1);
        }
        System.out.println(map);
        separator();
    }
}