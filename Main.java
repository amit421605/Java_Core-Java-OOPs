class BankAccount{
private double balance ; 
 double Balance (){
return balance;
}
void Deposit(int amount){
    if(amount>0) {
        balance+=amount;
    }
}
void WithDraw(int amt){
    if(amt > 0 && balance >= amt) balance-=amt;
   }
 }

class StudentMarks{
   private int marks;

   int getMarks(){
    return marks;
   }

   void setMarks(int marks){
        if(marks>0 && marks<=100) this.marks=marks;
   }

}

public class Main {
    public static  void main(String[] args){
    //     BankAccount ba=new BankAccount();
    //     ba.Deposit(1000);
    //    System.out.println(ba.Balance()) ;
    //     ba.WithDraw(300);
    //    System.out.println(ba.Balance()) ;

    StudentMarks std= new StudentMarks();
    std.setMarks(50);
    System.out.println(std.getMarks());
    
    }
}
