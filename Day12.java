public class Day12{
    //Recursion
    //Print N to 1 using recursion
    public static void printDec(int n){
        if(n==1){
            System.out.print("1");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
    //Print 1 to n using recursion
    public static void printInc(int n){
        if(n==1){
           System.out.print("1 ");
            return;  
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    //Print sum of n natural number
    public static int sumOfN(int n){
            if(n==1)
            {
                
                return 1;
            }
           return n+sumOfN(n-1);
    }

    //Print nth Fibonacci Number
    public static int fib(int n){
        if(n==0 || n==1)
        {
            return n;
        }
        int fibNM1=fib(n-1);
        int fibNM2=fib(n-2);
        return fibNM1+fibNM2;
    }
    //Check whether an array is sorted or not
    public static boolean sorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return sorted(arr,i+1);

    }

    //First Occurence of an Element
    public static int firstOccur(int arr[],int key,int i)
    {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,key,i+1);
    }
     //Last Occurence of an Element
    public static int lastOccur(int arr[],int key,int i)
    {
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccur(arr,key,i-1);
    }
    public static void main(String []args){
        int n=4;
        int arr[]={1,2,3,7,5,4,5,4,24};
       // printDec(n);
       // printInc(n);
       //System.out.println(sumOfN(10));
        //System.out.println(sorted(arr,0));
       //System.out.println(firstOccur(arr,n,0));
       System.out.println(lastOccur(arr,n,arr.length-1));
    }
}