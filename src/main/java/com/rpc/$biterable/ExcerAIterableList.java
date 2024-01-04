package com.rpc.$biterable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ExcerAIterableList {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(1); values.add(2); values.add(3); values.add(4); values.add(5);

        values.remove(4);

        Iterator<Integer> iterator = values.iterator();

        while(iterator.hasNext()) {
            var val = iterator.next();
            System.out.println("iterating values: "+val);
        }

// Below code will run in infinite loop
        // as every while condition is getting new iterator object
        System.out.println("BAD CODE");
//        while(values.iterator().hasNext()){
//            System.out.println("to see what happens after iterator has done iterating");
//            var val = values.iterator().next();
//            System.out.println("iterating values: "+val);
//        }

        // using enhanced for loop
        System.out.println(" Iterating using enhanced for loop");
        for(int a: values){
            System.out.println(a);
        }


        System.out.println(" Iterating using forEach method of java 8");
        Consumer<Integer> intConsumer = System.out::println;

        values.forEach(intConsumer);

        /**
         * There is a difference between Collections and Collection
         *
         * Collections is a utility class present in java.util package
         */

        int max = Collections.max(values);
        int min = Collections.min(values);

        System.out.println("Max: "+max+"  Min: "+min);
        Collections.reverse(values);
    }
}
