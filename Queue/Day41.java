package Queue;

public class Day41 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;



        // static int arr[];
        // static int size;
        // static int rear;
        // static int front;
        // Queue(int n){
        //     arr=new int[n];
        //     size=n;
        //     rear=-1;
        //     front=-1;
        // }

        //isEmpty
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
    //isFull
    // public static boolean isFull(){
    //     return (rear+1)%size==front;
    // }

        //add
        public static void add(int data){
           Node newNode=new Node(data);
           if(head==null){
            head=tail=newNode;
           }
           tail.next=newNode;
           tail=newNode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            
          int front=head.data;
          if(tail==head){
            tail=head=null;
          }else{
            head=head.next;
          }
          return front;


        }
        //peek
        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(5);
        q.add(9);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
