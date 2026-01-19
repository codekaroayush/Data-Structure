// package linkedList;

// public class Day27 {
//   public  static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
            
//         }
//     }
//     public static  Node head;
//     public static  Node tail;
//     public int size;
//     //AddFirst
//     public void addFirst(int data){
//         //create a data
//         Node newNode=new Node(data);
        
//         if(head==null){
//             head=tail=newNode;
//             size++;
//             return;
//         }
//         newNode.next=head;
//         size++;
//         head=newNode;
//     }
//     //addLast
//      public void addLast(int data){
//         //create a data
//         Node newNode=new Node(data);
        
//         if(head==null){
//             head=tail=newNode;
//             size++;
//             return;
//         }
//         tail.next=newNode;
//         size++;
//         tail=newNode;
//     }

//     //Add an element at a particular Index
//     public void add(int data,int idx){
       
//           Node newNode=new Node(data);
//           if(idx==0){
//              addFirst(data);
//              return;
//        }
//         Node temp=head;
//          int i=0;
//          while(i<idx-1){
//             temp=temp.next;
//             i++;
//          }
//          newNode.next=temp.next;
//          size++;
//          temp.next=newNode;
//     }
//     //Remove from first
//     public int removeFirst(){
//         if(size==0){
//             System.out.println("LinkedList is Empty");
//             return -1;
//         }if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//         int val=head.data;
//         size--;
//         head=head.next;
//         return val;
//     }
// //remove From last
// public int  removeLast(){
//     if(size==0){
//             System.out.println("LinkedList is Empty");
//             return -1;
//         }if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//        Node temp=head;
//        int i=0;
//        while(i<size-2){
//         temp=temp.next;
//         i++;
//        }
//        int val=temp.next.data;
//        temp.next=null;
//        tail=temp;
//        size--;
//        return val;

// }

//     //Print a Linked List
//     public void printLL(){
//         if(head==null){
//             System.out.println("Linked List is Empty.");
//             return ;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }

//     //Reverse a linked List
//     public void reverseLL(){
//         Node prev=null;
//         Node curr=head;
//         Node next;
//         while (curr!=null) {
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
// //Remove Nth from the end
// public int removeNth(int idx){
//     Node temp=head;
//     int i=0;
//     if(idx==size){
//         int val=head.data;
//         head=head.next;
//         size--;
//         return val;
//     }
//     while(i<size-idx-1){
//         temp=temp.next;
//         i++;
//     }
//     int val=temp.next.data;
//     temp.next=temp.next.next;
//     size--;
//     return val;
// }
// //Find the mid
// public Node getMid(){
//     Node slow=head;
//     Node fast=head;
//     while(fast!=null && fast.next!=null){
//         slow=slow.next;
//         fast=fast.next.next;
//     }
//     return slow;
// }
// //check palindrome
// public boolean isPalindrome(){
//     if(head==null || head.next==null){
//         return true;
//     }
//     Node mid=getMid();
//     //reverse a half
//      Node prev=null;
//      Node curr=mid;
//      Node next;
//         while (curr!=null) {
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         Node right=prev;
//         Node left=head;

//         //check left half and right half
//         while(right!=null){
//             if(left.data!=right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         }
//         return true;

// }

// //Detect Loop
//     public boolean detectLoop(){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public void removeLoop(){
//         //detect cycle
//          Node slow=head;
//         Node fast=head;
//         boolean cycle=false;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                cycle=true;
//                 break;
//             }
//         }
//         if(cycle==false){
//             return;
//         }
//         //find meeting point
//          slow=head;
//         Node prev=null;
//         while(slow!=fast){
//             slow=slow.next;
//             prev=fast;
//             fast=fast.next;
//         }
//         prev.next=null;
//     }
//     public static void main(String[] args) {
//         Day27 ll=new Day27();
//     //    ll.addLast(1);
//     //    ll.addLast(2);
//     //    ll.addLast(1);
//     //    //ll.addLast(1);
//     // //    ll.addLast(5);
//     // //    ll.addLast(6);
//     // //    ll.addLast(7);
//     // //    ll.printLL();
//     // //    System.out.println(ll.size);
//     // //    ll.removeNth(6);
//     // //    ll.printLL();
//     // //    System.out.println(ll.size);
//     // ll.printLL();
//     // System.out.println(ll.isPalindrome());
//     // ll.head=new Node(4);
       
//         head=new Node(1);
//         Node temp=new Node(5);
//         head.next=temp;
//         head.next.next=new Node(7);
//         head.next.next.next=temp;
//         System.out.println(ll.detectLoop());

//         ll.removeLoop();
//         System.out.println(ll.detectLoop());
//         ll.printLL();

        
//     }
// }


package linkedList;

public class Day27 {
  public  static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static  Node head;
    public static  Node tail;
    public static int size;


        public void addFirst(int data){
        //create a data
        Node newNode=new Node(data);
        
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        size++;
        head=newNode;
    }

      //Print a Doubly Linked List
    public void printDLL(){
        if(head==null){
            System.out.println("Doubly Linked List is Empty.");
            return ;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

        //Remove from first
    public int removeFirst(){
        if(size==0){
            System.out.println("DoublyLinkedList is Empty");
            return -1;
        }if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        size--;
        // head.next.prev=null;
        head=head.next;
        head.prev=null;
        return val;
    }
        //Reverse a Doubly linked List
    public void reverseDLL(){
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        Day27 dll=new Day27();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.printDLL();
        dll.reverseDLL();
        dll.printDLL();         
    }
}