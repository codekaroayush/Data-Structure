public class Day18 {
    public static int gridWays(int row,int col,int n,int m){
        if(row==n-1 && col==m-1){
            return 1;
        }else if(row==n || col==m){
            return 0;
        }
       int  w1=gridWays(row+1,col,n,m);
       int  w2=gridWays(row,col+1,n,m);
       return w1+w2;
    }
    //safe function
    public static boolean isSafe(int suduko[][],int row,int col,int digit){
        //col
        for(int i=0;i<=8;i++){
          if(suduko[i][col]==digit){
            return false;
          }
        }
        //row
        for(int j=0;j<=8;j++){
          if(suduko[row][j]==digit){
            return false;
          }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(suduko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    //suduko
    public static boolean sudukoSolver(int suduko[][],int row,int col){
        //Base Case
        if(row==9){
            return true;
        }
        //recursion
        int newrow=row;
        int newcol=col+1;
        if(col+1==9){
            newrow++;
            newcol=0;
        }

        if(suduko[row][col]!=0){
          return   sudukoSolver(suduko,newrow,newcol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(suduko,row,col,digit)){
                suduko[row][col]=digit;
                if(sudukoSolver(suduko,newrow,newcol)){
                    return true;
                }
                suduko[row][col]=0;
            }
        }
        return false;
    } 
    public static void printSuduko(int sudoku[][]){
        for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        // int n=3;
        // int m=3;
        // System.out.println(gridWays(0,0,n,m));

        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
{4, 9, 0, 1, 5, 7, 0, 0, 2},
{0, 0, 3, 0, 0, 4, 1, 9, 0},
{1, 8, 5, 0, 6, 0, 0, 2, 0},
{0, 0, 0, 0, 2, 0, 0, 6, 0},
{9, 6, 0, 4, 0, 5, 3, 0, 0},
{0, 3, 0, 0, 7, 2, 0, 0, 4},
{0, 4, 9, 0, 3, 0, 0, 5, 7},
{8, 2, 7, 0, 0, 9, 0, 1, 3}
};

if(sudukoSolver(sudoku, 0, 0)){
    System.out.println("Solution exist");
    printSuduko(sudoku);
}else{
    System.out.println("Solution does not exist");
}

    }
    
}
