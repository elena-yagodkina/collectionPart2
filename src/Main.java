import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        System.out.println("Задача 1");
        taskOne();
        System.out.println("Задача 2");
        taskTwo();
        System.out.println("Задача 3");
        taskThree();
        System.out.println("Задача 4");
        taskFour();
    }
    public static void taskOne() {
        for (int num: nums) {
            if(num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void taskTwo() {
        Collections.sort(nums);
        int uniqueNum = Integer.MIN_VALUE;
        for (int num: nums) {
            if(num % 2 == 0 && num == uniqueNum) {
                System.out.println(num);
                uniqueNum = num;
            }
        }
    }

    public static void taskThree() {
        Set<String> uniqueWord = new HashSet<>(strings);
        System.out.println(uniqueWord);
    }

    public static void taskFour() {
        Set<String> uniqueWord = new HashSet<>(strings);
        System.out.println(strings.size() - uniqueWord.size());
    }
}