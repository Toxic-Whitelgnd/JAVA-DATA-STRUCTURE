package LinkedLIstLearn;

public class LL {
    
    private int size;

    LL(){
        this.size = 0;
    }

    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            next = null;
        }
    }

    // add at first,last
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            size++;
            return;
        }

        newnode.next = head;
        head = newnode;
        size++;
        
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            size++;
            return;
        }

        Node curnode = head;
        // this curnode will be traversing the linkedlist
        // here we refernced that we made a copy of that 
        while(curnode.next != null){
            curnode = curnode.next;
        }

        curnode.next = newnode;
        size++;
    }

    // need to add elete functionality
    public void deleteFirst(){
        size--;
        if(head == null){
            System.out.println("empty");
            return;
        } 

        head = head.next;
    }

    public void deleteSecond(){
        // for single node

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        if(head == null){
            System.out.println("Empty list");
            return;
        }

        Node SecondLast = head;
        Node Last = head.next;

        while(Last.next != null){
            Last = Last.next;
            SecondLast = SecondLast.next;
        }

        SecondLast.next = null;
    }

    public void printlist(){
        Node curnode = head;
        while(curnode != null){
            System.out.print(curnode.data+"->");
            curnode = curnode.next;
        }
        System.out.println("NUll");
    }

    public void getsize(){
        System.out.println(size);
    }

    // ans for the questions
    public void reverseIterative(){
        Node prevnode = head;
        Node curNode = head.next;

        if(head == null || head.next == null){
                return;
        }

        while(curNode != null){
            Node nextnode = curNode.next;
            curNode.next = prevnode;

            // update
            prevnode = curNode;
            curNode = nextnode;


        }

        // this is for making the head to make point the reversed element

        head.next = null;
        head = prevnode;
    }
    public Node reverseRecursive(Node  head){

        if(head == null || head.next == null){
            return head;
    }

        

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }

    public static void main(String[] args) {
        LL l = new LL();
        l.addFirst(1);
        l.addLast(2);
        l.addFirst(6);
        l.addLast(9);

        l.printlist();
        // l.getsize();

        // l.deleteFirst();
        // l.deleteSecond();

        // l.printlist();
        // l.getsize();

        // l.reverseIterative();
        // l.printlist();

        l.head = l.reverseRecursive(l.head);
        l.printlist();
    }
}
