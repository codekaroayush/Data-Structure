package linkedList;


public class Day22 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;

    //Add Element at first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        size++;
        head=newNode;
    }
    //Add Element at last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        size++;
        tail=newNode;
    }
 //print a LinkedList
    public void printLL(){
        if(head==null){
           System.out.println("LinkedList is empty.");
           return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //add at particular index;
    public void add(int idx,int data){
        Node newNode=new Node(data);
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        size++;
        temp.next=newNode;
        
    } 
   
    //remove element form first
    public int removeFirst(){
        if(size==0){
            System.out.println("Linklist is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
             int temp=head.data;
             head=tail=null;
             size=0;
            return temp;
        }
        int temp=head.data;
        head=head.next;
        size--;
        return temp;
    }


    //remove element from last
    public int removeLast(){
        if(size==0){
            System.out.println("Linklist is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
             int temp=head.data;
             head=tail=null;
             size=0;
            return temp;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int temp=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;
        return temp;

    }
    public static void main(String [] args){
        Day22 ll=new Day22();
        ll.addFirst(2);
        ll.addFirst(1);
       
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.printLL();
        System.out.println(ll.removeFirst());
        ll.printLL();
        System.out.println(ll.removeLast());
        ll.printLL();
    }
    
}
