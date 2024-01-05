package com.rpc.$f_arraydequeue;

import java.util.ArrayDeque;

/**
 * queue in which you can add or remove elements from both the sides.
 *
 * used in multiple scenarios - in sliding window
 */
public class ExcerAArrayDequeue {

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(12);
        /**
         * offer method comes from queue interface
         * but it has its own methods
         *
         * below are those
         */

        queue.offerFirst(23);
        queue.offerLast(14);

        System.out.println(queue);
        /**
         * [23, 12, 14]
         */

        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println("after peek operations");
        System.out.println(queue);
        /**
         * 23
         * 23
         * 14
         * after peek operations
         * [23, 12, 14]
         *
         * you see peek doesn't remove elements
         * peek() methods are from ArrayDequeue class
         */

        System.out.println("poll() "+queue.poll());
        System.out.println("after polling one ele");
        System.out.println(queue);
        /**
         * [12, 14]
         *
         * poll() removes ele
         */

        System.out.println("pollFirst "+queue.pollFirst());
        System.out.println(queue);
        System.out.println("pollLast "+queue.pollLast());
        System.out.println(queue);
        /**
         * pollFirst 12
         * [14]
         * pollLast 14
         * []
         */


    }
}
