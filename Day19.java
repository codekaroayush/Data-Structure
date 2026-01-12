//ArrayList
import java.util.*;

public class Day19 {
    //swap 2 numbers
    public static void swap(ArrayList<Integer> list1,int idx1,int idx2){
        int temp=list1.get(idx1);
        list1.set(idx1,list1.get(idx2));
        list1.set(idx2,temp);
    }
    public static void main(String []args){
        ArrayList<Integer> list1=new ArrayList<>();
        
        //Add operation o(1)
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(7);
        list1.add(3);
     int  idx1=1;
     int idx2=3;
        //get element o(1)
      int element = list1.get(2);
      System.out.println(element);
      //remove and delete o(n)
      list1.remove(2);
      System.out.println(list1);
     // set element o(n)
      list1.set(2,11);
       System.out.println(list1);
       // contain element o(n)
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(21));
         System.out.println(list1.size());
         for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
         }
         System.out.println();
        for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i)+" ");
         }
         System.out.println();
       // find largest in arraylist
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<list1.size();i++){
            if(largest<list1.get(i)){
                largest=list1.get(i);
            }
         }
         System.out.println(largest);
        System.out.println(list1);
        swap(list1, idx1, idx2);
        System.out.println(list1);
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
       
        
        System.out.println(mainList);
        //nested loop
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }


    }
}
