import java.util.*;
public class Day6{

    //String Compression
    public static String compress(String str){
        String newStr="";
        
        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }

        }
        return newStr;
    }

    //To check whether the number is even or odd
    public static void oddAndEven(int n){
        int bitMask=1;
        if((n & bitMask)==1){
            System.out.println("Number is ODD");
        }else{
            System.out.println("Number is EVEN");
        }
    }
    //Get ith Bit
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    //Set ith Bit
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
        
    }
     //Clear ith Bit
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n& bitMask;
        
    }
    public static void main(String[]args){
        String str;
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter Your String: ");
        str=sc.nextLine();
        //String str="aaaabbcccdd";
        System.out.println("Your Compressed String: "+compress(str));
        // oddAndEven(9);
        // oddAndEven(14);
        // oddAndEven(13);
        // System.out.println(getIthBit(15,2));
        // System.out.println(getIthBit(10,2));
        //  System.out.println(setIthBit(10,2));
        // System.out.println(clearIthBit(10,1));
    }
}