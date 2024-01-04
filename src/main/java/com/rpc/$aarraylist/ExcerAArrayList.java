package com.rpc.$aarraylist;

import java.util.ArrayList;

public class ExcerAArrayList {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.add(1, 11);
        // This will add 11 at second position (index 1)
        // Time complexity: O(n)
        System.out.println(list);

        list.set(3, 13);
        // Value present at index 3 will be removed
        System.out.println(list);


        boolean contains = list.contains(4);
//        contains = list.contains(Integer.valueOf(3));
        // Time complexity: O(n)
        System.out.println(contains);

    }
}
