package Task06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelCollectionProcessing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30);

        int min = list.parallelStream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Min value: " + min);

        int max = list.parallelStream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Max value: " + max);

        double average = list.parallelStream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average value: " + average);

        List<Integer> filteredList = list.parallelStream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);
    }
}