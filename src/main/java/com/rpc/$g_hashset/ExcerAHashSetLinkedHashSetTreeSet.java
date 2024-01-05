package com.rpc.$g_hashset;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/**
 * Set property is being followed in all three classes - HashSet, TreeSet and LinkedHashSet
 */
public class ExcerAHashSetLinkedHashSetTreeSet {



    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(11);
        set.add(52);
        set.add(25);
        set.add(2);

        System.out.println(set);
        /**
         * [2, 52, 23, 25, 11]
         *
         * see order is not maintained
         */

        /**
         * lets run again
         *
         * it might happen that order is different in further runs.
         *
         * think this is like a bag - magical one - we can add any number of items in it
         * when we put our hands in to take out any element, we are unsure of the item that will come out.
         * and same ele can not be added
         *
         * hash is generating for every ele
         * hash is a unique thing specific to ele - using which ele can be identified
         */
        System.out.println(set);

        /**
         * lets add 52 one more time
         */

        set.add(52);
        System.out.println(set);

        set.remove(52);
        System.out.println(set);

        boolean isPresent = set.contains(11);
        System.out.println(isPresent);

        System.out.println(set.isEmpty());
        System.out.println("size "+set.size());
        System.out.println("clear "); set.clear();

        set = new LinkedHashSet<>();

        /**
         * now order is maintained
         */
        set.add(23);
        set.add(11);
        set.add(52);
        set.add(25);
        set.add(2);

        System.out.println("linked hash set");
        System.out.println(set);

        /**
         * order is maintained
         * [23, 11, 52, 25, 2]
         */


        set = new TreeSet<>();

        /**
         * TreeSearch is implementing Set properties
         *
         * behind the scene - doing operations on data which is in sorted form
         *
         * internally uses binary search tree to perform its operations
         * and having Set properties as well
         *
         * data in sorted form (+) unique element
         */
        set.add(23);
        set.add(11);
        set.add(52);
        set.add(25);
        set.add(2);

        System.out.println("tree set");
        System.out.println(set);
        /**
         * [2, 11, 23, 25, 52]
         *
         * data in sorted form
         */

        /**
         * HashSet
         * any operation you could think of in HashSet be it
         * clear, find, add done in O(1) constant time - very optimized
         *
         * TreeSet
         * operation - O(log n)
         *
         */

/**
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html#%3Cinit%3E()
 */
        Set<Student> students = new HashSet<>();

        Student s1 = Student.builder()
                .name("Prakash")
                .rollNo(1)
                .build();

        students.add(s1);

        System.out.println("size of set "+students.size());

        Student s2 = Student.builder()
                .name("prakash")
                .rollNo(2)
                .build();

        System.out.println("adding student");
        students.add(s2);

        System.out.println("size of set "+students.size());

        System.out.println("adding student having roll no already exists in set but having case difference in name");
        Student s3 = Student.builder()
                .name("prakash")
                .rollNo(1)
                .build();

        students.add(s3);

        System.out.println("size of set "+students.size());

        System.out.println("adding student having roll no and name (same letter case) already exists in set");
        Student s4 = Student.builder()
                .name("prakash")
                .rollNo(1)
                .build();

        students.add(s4);

        System.out.println("size of set "+students.size());

        /**
         *  public HashSet() {
         *         this.map = new HashMap();
         *     }
         *
         */


    }

}
