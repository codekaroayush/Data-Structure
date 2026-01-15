package linkedList;


public class Day23 {
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
    //Iterative Search
    public int searchItr(int key){
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            idx++;
            temp=temp.next;
        } 
        return -1;
    }
    //Recursive Search
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int  recSearch(int key){
         return helper(head, key);
    }

    //Reverse a linkedlist
    public void reverseLL(){
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
           
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    //Find & Remove Nth node from end
    public void deleteNthFromEnd(int n){
        //calc size
        Node temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        System.out.println(sz);
        return;
    }

    //Slow Fast Approach or two pointer approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1:find Mid
        Node midNode=findMid(head);
        //reverse 2nd Half
         Node prev=null;
        Node curr=midNode;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
           
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //check
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String [] args){
        Day23 ll=new Day23();
        // ll.addFirst(2);
        // ll.addFirst(1);
       
        ll.addLast(4);
        ll.addLast(5);
         
        ll.addLast(5);
        //ll.addLast(4);
        // ll.add(2,3);
        //ll.printLL();
        // System.out.println(ll.removeFirst());
        // ll.printLL();
        // System.out.println(ll.removeLast());
        // ll.printLL();
        
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(14));
        ll.printLL();
        // ll.deleteNthFromEnd(3);
        // ll.printLL();
        System.out.println(ll.checkPalindrome());

    }
    
}
