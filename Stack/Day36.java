package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Day36 {
    public static void nxtGreaterElement(int arr[]){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    al.add(arr[j]);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                al.add(-1);
            }
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }

    //Next Greater element using stack
    public static void nxtGreaterElementUsingStack(int arr[]){
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //WhileLoop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //IfElse
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i]=arr[s.peek()];
            }

            //push
            s.push(i);

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
        //NextGreaterLeft for(int i=arr.length-1;i>=0;i--) reverse it
        //NextSmallest   arr[s.peek()]<=arr[i] reverse it
        //nextSmallestLeft for(int i=arr.length-1;i>=0;i--) reverse it &&& arr[s.peek()]<=arr[i] reverse it
    }
    //Valid parenthesis 
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }if(
                    (ch==')' && s.peek()=='(') ||
                    (ch=='}' && s.peek()=='{') ||
                    (ch==']' && s.peek()=='[') 
                ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        // int arr[]={1,5,3,4,2};
        // nxtGreaterElementUsingStack(arr);
        String str="[({})]";
        
        System.out.println(isValid(str));
    }
    
}
