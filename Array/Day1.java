//import java.util.*;
public class Day1{
    //Linear Search
    public static int linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    //Largest Number
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    //Smallest Number
    public static int getSmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        return smallest;
    }
    //Binary search
    public static int binarySearh(int arr[],int key)
    {
        int start=0;int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    
    //Print SubArray & find Max and Min subArray
    public static void subArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int count=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    count=count+arr[k];
                }
                if(largest<count)
                {
                    largest=count;
                }
                if(smallest>count)
                    {
                        smallest=count;
                    }
                System.out.println();
            }
        }
        System.out.println("largest Sub array is: "+largest);
        System.out.println("smallgest Sub array is: "+smallest);
    }
    //ReverseArray
    public static void reverseArray(int arr[])
    {
        int i=0;int j=arr.length-1; int temp;
        while(i<j)
        {
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
    //pairs in an array
    public static void pairArr(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,10,12,14,16,18};
        


    //int key=2;
    //    int result=linearSearch(arr,key);
    //    if(result==-1)
    //    {
    //     System.out.println("Not Found");
    //    }
    //    else{
    //     System.out.println("Number found at index: "+result);
    //    }
    // System.out.println("Largest Number is: "+getLargest(arr));
    // System.out.println("Smallest Number is: "+getSmallest(arr));
    //      int result=binarySearh(arr,key);
    //     if(result==-1)
    //    {
    //     System.out.println("Not Found");
    //    }
    //    else{
    //     System.out.println("Number found at index: "+result);
    //    }

    // reverseArray(arr);
    // for(int i=0;i<arr.length;i++)
    // {
    //     System.out.println(arr[i]);
    // }
    //pairArr(arr);
    subArray(arr);
    }
}