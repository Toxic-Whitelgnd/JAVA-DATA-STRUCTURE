package Stack;

public class StackLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class LLstack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            

        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int popd = head.data;
            head = head.next;

            return popd;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        LLstack l = new LLstack();
        l.add(1);
        l.add(2);
        l.add(3);

        while(!l.isEmpty()){
            System.out.println(l.peek());
            l.pop();
        }
    }
}
