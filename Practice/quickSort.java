package Practice;

public class quickSort {
     public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void QuickSort(int arr[],int si,int ei){
        //base
        if(si>=ei){
            return;
        }
        //kaam
        int pIdx=partition(arr,si,ei);
        QuickSort(arr, si, pIdx-1);
        QuickSort(arr,pIdx+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        
        
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
             }
    }
             i++;
             int temp=pivot;
             arr[ei]=arr[i];
             arr[i]=temp;
             return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        QuickSort(arr,0,arr.length-1);
        printArr(arr);
        
    }
    
}
