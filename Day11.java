public class Day11{
    public static void main(String[]args){
        // Calculator calc=new Calculator();
        
        // System.out.println(calc.sum(4,6));
        //  System.out.println(calc.sum(4.9,6.1));
        //   System.out.println(calc.sum(4,6,11));
        // cow c1=new cow();
        // c1.eat();
        // Horse h1=new Horse();
        // h1.eat();
        // h1.color();
        Queen q1=new Queen();
        q1.move();
    }
}
//Interfaces
interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right,Diagonal(One Step)");
    }
}
//Abstract Class
// abstract class Animal{
//     void eat(){
//         System.out.println("eats..");
//     }
//     abstract void color();
// }
// class Horse extends Animal{
//     void color(){
//         System.out.println("Brown");
//     }

// }
// class Fish extends Animal{
//     void color(){
//         System.out.println("Blue");
//     }
// }

// //Method overriding
// class Animal{
//     void eat(){
//         System.out.println("Eat Anything..");
//     }
// }
// class cow extends Animal{
//     void eat(){
//         System.out.println("Eat Grass..");
//     }
// }
// //Method overloading
// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }
//     double sum(double a,double b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }