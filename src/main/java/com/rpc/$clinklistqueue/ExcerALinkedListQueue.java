package com.rpc.$clinklistqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ExcerALinkedListQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        System.out.println(q);

        var el = q.poll();
        System.out.println("polled: "+el);

        System.out.println("after polled");
        System.out.println(q);
        /**
         * [1, 2, 3, 4]
         * polled: 1
         * after polled
         * [2, 3, 4]
         */

        el = q.peek();
        System.out.println("peeked "+el);

        System.out.println(q);
        /**
         * [1, 2, 3, 4]
         * polled: 1
         * after polled
         * [2, 3, 4]
         * peeked 2
         * [2, 3, 4]
         */

        q.add(-1);
        // dangerous when not able to add - it will throw exception

        el = q.element(); //will throw exception - used to get element like peek()



    }
}
