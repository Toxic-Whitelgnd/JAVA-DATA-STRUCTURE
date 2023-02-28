package Queue;

import java.util.*;

public class usignstack {
    static class Queuestack{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            return s1.pop();


        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queuestack u = new Queuestack();
        u.add(1);
        u.add(2);
        u.add(3);
        u.add(4);

        int a = u.peek();
        int b = u.remove();

        System.out.println(b);

    }
}
