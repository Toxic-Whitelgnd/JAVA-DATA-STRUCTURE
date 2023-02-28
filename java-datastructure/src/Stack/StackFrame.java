package Stack;

import java.util.*;

public class StackFrame {

    // answer for the quetion push the top at the bottom of the stack
    public static void pushAtBottom(int data,Stack<Integer> l){
        if(l.isEmpty()){
            l.push(data);
            return;
        }

        int top = l.pop();
        pushAtBottom(data, l);
        l.push(top);

    }

    // answer for the reversing the stack
    public static void reverse(Stack<Integer> l){
        if(l.isEmpty()){
            return;
        }
        int top = l.pop();
        reverse(l);
        pushAtBottom(top, l);
    }

    public static void main(String[] args) {
        Stack<Integer> l = new Stack<>();

        l.add(1);
        l.add(2);
        l.add(3);
        // pushAtBottom(4,l);
        reverse(l);
        
        while(!l.isEmpty()){
            System.out.println(l.peek());
            l.pop();
        }
    }
}
