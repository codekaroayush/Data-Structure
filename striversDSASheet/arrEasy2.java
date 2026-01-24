package striversDSASheet;
import java.util.*;

//Second Largest in an Array

public class arrEasy2 {

    public static int secLargestArr(int arr[], int n){
        //Brute Force
        // int largest=Integer.MIN_VALUE;
        // int secLargest=Integer.MIN_VALUE;
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     largest=Math.max(arr[i],largest);
        // }
        // for(int i=n-2;i>=0;i--){
        //     if(arr[i]!=largest){
        //         secLargest=arr[i];
        //         break;
        //     }else{
            //secLargest=-1;
           // }
        // }
        // return secLargest;

        //Optimal Solution
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secLargest && arr[i]!=largest){
                secLargest=arr[i];
            }
        }
        return secLargest;

    }    
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int n=arr.length;
        System.out.println(secLargestArr(arr, n));
        
    }
}
