import java.util.*;
public class Day5{

    //Print Letters
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    
    //Check is Palindrome or not
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }


    //Shortest route
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='n'){
                y++;
            }else if(dir=='s'){
                y--;
            }else if(dir=='e'){
                x++;
            }else{
                x--;
            }
           
         }
          int X2=x*x;
          int Y2=y*y;
          return (float)Math.sqrt(X2+Y2);
    }


    //Print SubString
    public static String subString(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }


    //Return Largest String
    public static String largestString(String strSet[]){
       String largest=strSet[0];
       for(int i=1;i<strSet.length;i++){
        if(largest.compareTo(strSet[i])<0){
            largest=strSet[i];
        }
       }
       return largest;
    }


    //Convert each first letter of each word to upper case
    public static String conInUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            char cha=str.charAt(i);
            if(cha==' '&& i<str.length()-1){
                sb.append(cha);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(cha);
            }
        }
        return  sb.toString();
    }


    public static void main(String [] args){
        // String str;
        // Scanner sc=new Scanner(System.in);
        // str=sc.nextLine();
        // System.out.println(str);
        String fName="Ayush";
        String lName="Srivastava";
        String fullName=fName+" "+lName;
       
     //System.out.println( fName.substring(0,3));
        //System.out.println(fullName);
       // printLetter(fullName);
       //String str="madaM";
       //System.out.println(isPalindrome(str));
       //String path="wneenesennn";
       //System.out.println(getShortestPath(path));
      //    String str="HelloWorld!";
     //    System.out.println(subString(str,0,5));
     // String strSet[]={"appple","mango","banana"};
     //  System.out.println(largestString(strSet));
     // StringBuilder sb=new StringBuilder("");
     // for(char ch='a';ch<='z';ch++){
     //     sb.append(ch);
     // }
     // System.out.println(sb.length());
     // }
      String str="hello world! ";
      System.out.println(conInUpperCase(str));
    }
}