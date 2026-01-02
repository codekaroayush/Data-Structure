public class Day10{
    public static void main(String [] args){
       Fish f1=new Fish();
       f1.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eat..");
    }
    void breath(){
        System.out.println("Breaths..");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming");
    }
}
class Student{
    String name;
    int rollno;
    Student(){
        System.out.println("Constructure is initialized...");
    }
    Student(String name){
        this.name=name;
    }
}