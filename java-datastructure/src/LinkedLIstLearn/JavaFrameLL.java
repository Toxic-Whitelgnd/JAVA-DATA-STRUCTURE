package LinkedLIstLearn;

import java.util.*;

public class JavaFrameLL {
    public static void main(String[] args) {
        LinkedList <Integer> l = new LinkedList<Integer>();

        l.addFirst(1);
        l.addFirst(3);
        l.addLast(2);

        System.out.println(l);

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));

        }

        l.removeLast();
        l.removeFirst();

        System.out.println(l);


    }
}
