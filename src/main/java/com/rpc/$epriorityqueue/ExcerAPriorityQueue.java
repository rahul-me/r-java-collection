package com.rpc.$epriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExcerAPriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        /**
         * [12, 36, 24, 40]
         *
         * here if you see order has been changed.
         * why order has been changed because min heap has been used under the hood.
         * heap datastructure - min element is at top on the tree.
         */

        pq.poll();

        System.out.println("after polled one element");
        System.out.println(pq);

        /**
         * after polled one element
         * [24, 36, 40]
         *
         * order has changed again.
         * 24 which was after 36, is not before 36
         */

        pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
    }
}
