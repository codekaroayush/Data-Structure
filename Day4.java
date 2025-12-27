import java.util.*;
public class Day4{
    //Search in 2D Array
    public static boolean Search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(key==arr[i][j]){
                    System.out.println("Key found at ("+i+","+j+")");
                    return true;
                    
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
        
    }
    //Spiral Array
    public static void spiralArray(int arr[][]){
        int n=arr.length; int m=arr[0].length;
        int  startRow=0; int startCol=0; int endRow=n-1;int endCol=m-1;
         while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            //Right
       for(int i=startRow+1;i<=endRow;i++){
        System.out.print(arr[i][endCol]+" ");
    }
    //Bottom
    for(int j=endCol-1;j>=startCol;j--){
        if(startRow==endRow){
            break;
        }
        System.out.print(arr[endRow][j]+" ");
    }
    //Left
    for(int i=endRow-1;i>startRow;i--)
    {
        if(startCol==endCol){
            break;
        }
        System.out.print(arr[i][startCol]+" ");
    }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    //Diagonal Sum
    public static int diagonalSum(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum+=arr[i][j];
                }else if(i+j==n-1){
                    sum+=arr[i][j];
                }
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i][i];
        //     if(i!=n-1-i){
        //     sum+=arr[i][n-1-i];
        //     }
        // }
        return sum;
    }

    //Stair Case Search in 2D Array
    public static boolean stairSearch(int arr[][],int key){
        int row=0, col=arr[0].length-1;
        
        while(row<arr.length && col>=0){
            if(arr[row][col]==key)
            {
                System.out.println("Element Found! at index ("+row+","+col+")");
                return true;
            }else if(key>arr[row][col]){
                row++;
            }else{
                col--;
            }
        }
        System.out.println("Element not found!");
        return false;
    }

    
    public static void main(String [] args){
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key =33;
        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }
        // Search(arr,key);
        //spiralArray(arr);
        //System.out.println(diagonalSum(arr));  
        stairSearch(arr,key);      
    }
}