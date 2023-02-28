package Queue;

public class circuqueuearr {

    static class QueueCA{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        QueueCA(int n){
            arr = new int[n];
            this.size = n;
        }

        // to check for empty
        public static boolean isEmpty(){
            return (rear == -1 && front == -1);
        }

        // to check for full
        public static boolean isFull(){
            return ((rear+1)%size == front);
            
        }

        // to add 
        public static void add(int data){
            if(isFull()){
                System.out.println("Can't add");
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear+1)% size;
            arr[rear] = data;


        }

        // to remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Can't remove");
                return -1;
            }
            int res = arr[front];

            if(front == rear){
                front = rear = -1;
            }
            else{
                // System.out.println(front);
                front = (front+1)%size;
                
            }
            
         
            return res;

            
        }
        // to pees the queue's first elemt
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queuq");
                return -1;
            }

            return arr[front];
        }

    }



    public static void main(String[] args) {
        QueueCA q = new QueueCA(5);

        q.add(1);
        q.add(3);
        q.add(9);

        int r = q.remove();
        int e = q.peek();
        System.out.println(r);
        System.out.println(e);
    }
}
