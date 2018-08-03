package com.itkevin.wallow.parallelStream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelStreamTest {

    @Test
    public void demo1() {
        try {
            Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14};
            List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
            List<Integer> parallelStorage = Collections.synchronizedList(new ArrayList<>()); //new ArrayList<>();//
            listOfIntegers
                    .parallelStream()
                    .map(e -> {
                        parallelStorage.add(e);
                        return e;
                    })
                    .forEachOrdered(e -> System.out.print(e + " "));
            System.out.println();
            System.out.println("更改后的集合" + parallelStorage);
            parallelStorage
                    .stream()
                    .forEachOrdered(e -> System.out.print(e + " "));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
