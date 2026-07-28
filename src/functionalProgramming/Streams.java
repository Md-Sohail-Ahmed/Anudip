package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6, 3, 8, 2, 10};

        // 1. Print all elements
        Arrays.stream(arr)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 2. Sum of elements
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum = " + sum);

        System.out.println("--------------------------");

        // 3. Average
        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println("Average = " + avg);

        System.out.println("--------------------------");

        // 4. Maximum element
        int max = Arrays.stream(arr).max().orElse(0);
        System.out.println("Max = " + max);

        System.out.println("--------------------------");

        // 5. Minimum element
        int min = Arrays.stream(arr).min().orElse(0);
        System.out.println("Min = " + min);

        System.out.println("--------------------------");

        // 6. Count elements
        long count = Arrays.stream(arr).count();
        System.out.println("Count = " + count);

        System.out.println("--------------------------");

        // 7. Even numbers
        Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 8. Odd numbers
        Arrays.stream(arr)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 9. Numbers greater than 5
        Arrays.stream(arr)
                .filter(n -> n > 5)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 10. Square of each element
        Arrays.stream(arr)
                .map(n -> n * n)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 11. Remove duplicates
        Arrays.stream(arr)
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 12. Sort ascending
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 13. Sort descending
        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 14. First element
        int first = Arrays.stream(arr).findFirst().orElse(-1);
        System.out.println(first);

        System.out.println("--------------------------");

        // 15. Skip first 3 elements
        Arrays.stream(arr)
                .skip(3)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 16. First 5 elements
        Arrays.stream(arr)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("--------------------------");

        // 17. Count even numbers
        long evenCount = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(evenCount);

        System.out.println("--------------------------");

        // 18. Any number greater than 8?
        boolean result = Arrays.stream(arr)
                .anyMatch(n -> n > 8);
        System.out.println(result);

        System.out.println("--------------------------");

        // 19. All numbers positive?
        boolean positive = Arrays.stream(arr)
                .allMatch(n -> n > 0);
        System.out.println(positive);


        System.out.println("--------------------------");

        // 20. Collect into List<Integer>
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
