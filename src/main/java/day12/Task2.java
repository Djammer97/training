package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        filling(0, 30, numbers);
        filling(300, 350, numbers);
        System.out.println(numbers);
    }

    private static void filling(int start, int end, List<Integer> numbers) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
    }
}
