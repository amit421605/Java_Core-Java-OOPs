// Abstarction means Incomplete by design 
 // the function and methods are defined/initialised can be completed/overriden in child class 
 abstract class Animal{
  abstract void Sound();
 }
 class dog extends  Animal{
    @Override
    void Sound(){
        System.out.println("Dog Is Barking...  ");
    }
 }


 abstract class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
  abstract  void EmployeeWork();
    
 }
 class developer extends Employee{
       // using constructor of employee to imitailizr name 
    public developer(String name){
         super(name);
     }

    @Override 
    void EmployeeWork() {
         System.out.println("Is coding "+name);
    }

 }
public class Abstract {
  public static void main(){
    // dog DOG = new dog(); 
    // DOG.Sound();

     developer coder=new developer("Amit");
     coder.EmployeeWork();
  }  
}
