package Queue;
import java.util.*;

// by using javacollection library frame work

public class queueJframe {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        
        // same functions
        q.add(1);
        q.add(3);
        q.add(9);

        int r = q.remove();
        int e = q.peek();
        System.out.println(r);
        System.out.println(e);
    }
}
