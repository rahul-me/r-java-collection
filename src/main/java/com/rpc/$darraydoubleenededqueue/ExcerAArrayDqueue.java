package com.rpc.$darraydoubleenededqueue;

import java.util.ArrayDeque;

public class ExcerAArrayDqueue {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(22);
        adq.offer(23);

        System.out.println("After two additions");
        System.out.println(adq);
        System.out.println();

        adq.offerFirst(11);

        System.out.println("offer first");
        System.out.println(adq);
        System.out.println();

        adq.offerLast(29);

        System.out.println("offer last");
        System.out.println(adq);

        System.out.println("poll");
        System.out.println(adq.poll());
        System.out.println(adq);

        System.out.println();

        System.out.println("poll first");
        System.out.println(adq.pollFirst());

        System.out.println("after poll first");
        System.out.println(adq);

        System.out.println("poll last");
        System.out.println(adq.pollLast());

        System.out.println("after poll last");
        System.out.println(adq);

        System.out.println("poll empty queue");
        adq.poll(); var e = adq.poll();
        System.out.println(e);



    }
}
