public class Day7{
    public static void main(String [] args){
        Pen p1=new Pen();
        p1.setColor("Yellow");
        p1.setTip(5);
        //p1.tip=5;
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        BankAccount myAcc=new BankAccount();
        myAcc.username="Ayush";
        //myAcc.Password=12345;
        System.out.println(myAcc.username);
        myAcc.setPassword(12345);
        System.out.println(myAcc.getPassword());
    }  

}
class Pen{
    private String color;
    private int tip;
    void setColor(String newCol){
        this.color=newCol;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
       return this.tip;
    }
}

class BankAccount{
    public String username;
    private int Password;
    int getPassword(){
        return this.Password;
    }

    void setPassword(int newPass){
        this.Password=newPass;
    }

}