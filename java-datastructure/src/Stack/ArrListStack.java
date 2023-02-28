package Stack;

import java.util.*;

public class ArrListStack {
    static class ALstack{
        public static ArrayList<Integer> a = new ArrayList<>();

        public static boolean isEmpty(){
            return (a.isEmpty());
        }

        public static void add(int data){
            a.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = a.get(a.size()-1);
            a.remove(a.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return a.get(a.size()-1);
        }
    }
    public static void main(String[] args) {
        ALstack a = new ALstack();
        a.add(1);
        a.add(2);
        a.add(3);

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.pop();
        }
    }
}
