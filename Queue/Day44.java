package Queue;
import java.util.*;
public class Day44 {

    public static void interleaveQueue(Queue<Integer> q1){
        int size=q1.size();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<size/2;i++){
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }

    public static void main(String[] args) {
       Queue<Integer> q1=new LinkedList<>(); 
       q1.add(1);
       q1.add(2);
       q1.add(3);
       q1.add(4);
       q1.add(5);
       q1.add(6);
       q1.add(7);
       q1.add(8);
       interleaveQueue(q1);
       while(!q1.isEmpty()){
        System.out.print(q1.remove()+" ");
       }
       System.out.println();
    }
}
