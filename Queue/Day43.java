package Queue;
import java.util.*;
public class Day43 {
    public static void printNonRepeat(String str){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
        }
        if(q.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(q.peek());
        }
    }
    public static void main(String[] args) {
        String str="aabmccxb";
        printNonRepeat(str);
    }
}
