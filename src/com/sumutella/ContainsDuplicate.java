package com.sumutella;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        return IntStream.of(nums).boxed().collect(Collectors.toList()).stream()
                .collect(Collectors.groupingBy( Function.identity(), Collectors.counting()))
                .values().stream().anyMatch(i->i>1);

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        containsDuplicate(nums);

    }
}
