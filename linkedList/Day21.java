package linkedList;

public class Day21 {
    public static class node{
     int data;
    node next; 
    public node(int data){
        this.data=data;
        this.next=null;
    }
    }
    public static node head;
    public static node tail;

    //Add Element in Linked list
    public void addFirst(int data){
        //Create New Node 
        node newNode=new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //Step2:-newNode next=head
        newNode.next=head; //link

        //step:3 head =new node
        head=newNode;
    }

    public void addLast(int data){
        //Create New Node 
        node newNode=new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //Step2:-newNode next=head
        tail.next=newNode; //link

        //step:3 head =new node
        tail=newNode;
    }
    //print a LinkedList
    public void printLL(){
        if(head==null){
           System.out.println("LinkedList is empty.");
           return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Day21 ll=new Day21();
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
    }
}
