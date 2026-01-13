import java.util.*;

public class Day20 {
    //Brute Force Approach T.C. O(n*2)
    // public static int mostWater(ArrayList<Integer> waterLevel){
    //         int maxWater=0;
    //         for(int i=0;i<waterLevel.size();i++){
    //             for(int j=i+1;j<waterLevel.size();j++){
    //                 int height=Math.min(waterLevel.get(i),waterLevel.get(j));
    //                 int width=j-i;
    //                 int waterContain=height*width;
    //                 maxWater=Math.max(maxWater, waterContain);
    //             }
    //         }
    //         return maxWater;
    // }

    //2 pointer Approach T.C. O(n)
    public static int mostWater(ArrayList<Integer> waterLevel){
        int maxWater=0;
        int lp=0;
        int rp=waterLevel.size()-1;
        while (lp<rp) {
            //Calc Area
            int height=Math.min(waterLevel.get(lp),waterLevel.get(rp));
            int width=rp-lp;
            int Area=height*width;
            maxWater=Math.max(maxWater, Area);

            if(waterLevel.get(lp)<waterLevel.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    //pairSum (1) Brute Force O(n*2)
    // public static boolean pairSum(ArrayList<Integer> list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    //pairSum (1) 2 pointer Approach
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp<rp) {
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String [] args){
    //     ArrayList<Integer> waterLevel=new ArrayList<>();
    //     waterLevel.add(1);
    //     waterLevel.add(8);
    //     waterLevel.add(6);
    //     waterLevel.add(2);
    //     waterLevel.add(5);
    //      waterLevel.add(4);
    //     waterLevel.add(8);
    //     waterLevel.add(3);
    //    waterLevel.add(7);
    //     System.out.println(mostWater(waterLevel));
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
     list.add(2);
      list.add(3);
       list.add(4);
        list.add(5);
         list.add(6);
         int target=5;
         System.out.println(pairSum(list, target));
    }
    
}
