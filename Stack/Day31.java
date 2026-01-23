package Stack;

import java.util.*;

public class Day31 {
    // static class node{
    //     int data;
    //     node next;
    //     public node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }

    // }
     public static class StackB{
        // static ArrayList<Integer> list=new ArrayList<>();
        // public static boolean isEmpty(){
        //     return list.size()==0;
        // }
        // //push
        // public static void push(int data){
        //     list.add(data);
        // }
        // //pop
        // public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top=list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return top;
        // }
        // //Peek
        // public static int peek(){
        //      if(isEmpty()){
        //         return -1;
        //     }
        //     return list.get(list.size()-1);
        // }

        //Stack using Linked List
        // public static node head=null;

        // public static boolean isEmpty(){
        //     return head==null;
        // }
        // //push
        // public static void push(int data){
        //     node newNode=new node(data);
        //     if(isEmpty()){
        //         head=newNode;
        //         return;
        //     }
        //     newNode.next=head;
        //     head=newNode;
        // }
        // //pop
        // public static int pop(){
        //     if(isEmpty()){
        //         System.out.println("Stack is empty");
        //         return -1;
        //     }
        //     int top=head.data;
        //     head=head.next;
        //     return top;
        // }
        // //peek
        // public static int peek(){
        //     if(isEmpty()){
        //         System.out.println("Stack is empty");
        //         return -1;
        //     }
        //     return head.data;
        // }

        
        

    }
    
    //Push at botom of the stack
    public static void pushAtBotom(Stack<Integer> s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtBotom(s, data);
            s.push(top);

        }

        //Reverse a string using Stack
        public static String reverseString(String str){
            Stack<Character> s=new Stack<>();
            int idx=0;
            while(idx<str.length()){
                s.push(str.charAt(idx));
                idx++;
            }

            StringBuilder result=new StringBuilder("");
            while(!s.isEmpty()){
                char ch=s.pop();
                result.append(ch);
            }

            return result.toString();

        }

        //Reverse a Stack
        public static void reverseStack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            reverseStack(s);
            pushAtBotom(s, top);
        }
        public static void printStack(Stack<Integer> s){
            while(!s.isEmpty()){
                System.out.println( s.pop());
               
            }
        }
    public static void main(String[] args) {
        //Stack s=new Stack();
    
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        // Stack<Integer> s=new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBotom(s,4);
        //  while (!s.isEmpty()) {
        //     System.out.println(s.pop()); // Output: 3, 2, 1, 4 (4 is at bottom)
        // }
        // String str="Ayush Srivastava";
        // System.out.println(reverseString(str));
         Stack<Integer> s=new Stack<>();
    
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);
    }
}
