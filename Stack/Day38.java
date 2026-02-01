package Stack;

import java.util.Stack;

public class Day38 {

    //Max Rectangular area in Histogram
    public static void maxArea(int arr[]){
        int maxAr=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        //nxt smaller right
         Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            //WhileLoop
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            //IfElse
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }

            //push
            s.push(i);
        }


        //nxt smaller left
         s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            //WhileLoop
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            //IfElse
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }

            //push
            s.push(i);

        }
        //curr Area :width= nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currAr=height*width;
            maxAr=Math.max(maxAr, currAr);

        }

        System.out.println("Maximum area in Histogram is: "+maxAr);
    }
    
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}
