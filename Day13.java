public class Day13{
    //print X to the power N
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    //print X to the power N(Optimized)
    public static int powerOptimize(int x,int n){
        if(n==0){
            return 1;
        }
        int halfOpt=powerOptimize(x,n/2);
        int halfOptSq=halfOpt*halfOpt;
        if(n%2!=0){
            halfOptSq=x*halfOptSq;
        }

        return halfOptSq;
    }
    //Remove Duplicate in a String
    public static void removeDuplicateString(String str,int idx,StringBuilder newStr,boolean map[]){
        //Base Case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
             removeDuplicateString(str,idx+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            removeDuplicateString(str,idx+1,newStr.append(currChar),map);
        }
    }
    //tiling Problem
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int nm1=tilingProblem(n-1);
        int nm2=tilingProblem(n-2);
        int totalWay=nm1+nm2;
        return totalWay;
    }
    //Friends Pairing Problem
    public static int friendsPairing(int n){
       //Base Case
        if(n==1 || n==2){
            return n;
        }
        //kaam
        //single
        int nm1=friendsPairing(n-1);
        //pair
        int nm2=(n-1)*friendsPairing(n-2);
        int totalPair=nm1+nm2;
        return totalPair;
    }

    public static void main(String [] args){
        //System.out.println(power(2,10));
        // System.out.println(powerOptimize(2,6));
        //System.out.println(tilingProblem(15));
        System.out.println("Before Remove Duplicate String: appnnacoolleege");
        System.out.print("After Remove Duplicate String: ");
        removeDuplicateString("appnnacollege",0,new StringBuilder(""),new boolean[26]);
       //System.out.println(friendsPairing(3));
    }
}
