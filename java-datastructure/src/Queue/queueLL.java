package Queue;

public class queueLL{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class QueueL{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return (head == null && tail == null);
        }

        // for inserting the data
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // for deleting the data
        public static int delete(){
            if(isEmpty()){
                System.out.println("empty queuq");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                tail = null;
            }

            
            head = head.next;

            return front;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("NO ELEMENT");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        QueueL q = new QueueL();
        q.add(1);
        q.add(2);
        q.add(4);

        int r = q.delete();
        int e = q.peek();
        System.out.println(r);
        System.out.println(e);
    }
}