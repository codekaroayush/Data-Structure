package Practice;
import java.util.*;

public class Array {

    public static void pairInArr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("["+ arr[i] +","+ arr[j] +"]");
            }
            System.out.println();
        }
    }

    //print subarray
    public static void printsubarray(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int count;
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               count=0;
               if(i==0){
                count=prefix[j];
               }else{
                count=prefix[j]-prefix[i-1];
               }
               
              
                System.out.println("Sum of this sub array"+count);
                Largest=Math.max(Largest, count);             
                 
            }
            System.out.println();
        }
        System.out.println("Largest Subarray sum is:- "+Largest);
    }
    //Check palindrome
    public static boolean isPalindrome(String str){
        int si=0;
        int li=str.length()-1;
        int mid=si +(li-si)/2;
        for(int i=0,j=str.length()-1;i<=mid;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //int arr[]={2,4,6,8,10};
        // int prefix[]=new int[arr.length];
        // prefix[0]=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     prefix[i]=prefix[i-1]+arr[i];
        // }
        
        //pairInArr(arr);
        //printsubarray(arr);
        String str="racecare";
        System.out.println(isPalindrome(str));

    }
}
