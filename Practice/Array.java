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

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        //arr[0]=nums[0];
        int j=1;
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
             
            if(nums[i]!=arr.get(j-1)){
                arr.add(nums[i]);
                j++;
            }
        }
         int x=arr.size();
        for(int i=0;i<x;i++){
            nums[i]=arr.get(i);
        }
        for(int i=x;i<nums.length;i++){
            nums[i]=0;
        }
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }
        return j;
    }

    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }

        int x=arr.size();
        for(int i=0;i<x;i++){
            nums[i]=arr.get(i);
        }
        for(int i=x;i<nums.length;i++){
            nums[i]=0;
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        //int arr[]={2,4,6,8,10};
        // int prefix[]=new int[arr.length];
        // prefix[0]=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     prefix[i]=prefix[i-1]+arr[i];
        // }
        int nums[]={ 2, 4, 4, 4, 4, 5, 5};
        
        //pairInArr(arr);
        //printsubarray(arr);
        // String str="racecare";
        // System.out.println(isPalindrome(str));
        System.out.println(removeDuplicates(nums));
        //System.out.println();
        //moveZeroes(nums);
    }
}
