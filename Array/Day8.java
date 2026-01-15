public class Day8 {
    public static void oddAndEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
             System.out.println("Even Number.");
        }else{
            System.out.println("Odd Number.");
        }
           
        
    }
//get Ith Bit
    public static void getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
             System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
//Set Ith bit
public static int setIthBit(int n, int i){
     int bitMask=1<<i;
    return n|bitMask;
}

//Clear Ith bit
public static int clearIthBit(int n, int i){
     int bitMask=~(1<<i);
    return n&bitMask;
}

    public static void main(String[] args) {
        int n=10;
        int i=1;
       // oddAndEven(n);
      // getIthBit(n, i);
       //System.out.println(setIthBit(n, i));
       System.out.println(clearIthBit(n, i));

    }
    
}
