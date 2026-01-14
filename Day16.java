public class Day16{
    public static void changeArr(int arr[],int i,int val){
        //Base Case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Print Subset of String.
    public static void subset(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                 System.out.println(ans);
            }
           
            return;

        }
        //recursion
        //yes
        subset(str,ans+str.charAt(i),i+1);
        //no
         subset(str,ans,i+1);
    }

    //Find permutations
    public static void permutations(String str,String ans){
        //Base code
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1,str.length());
            permutations(newStr,ans+ch);
        }
    }
    public static void main(String [] args){
        String str="abc";
       //subset(str,"",0);
       permutations(str,"");
       
    }
}