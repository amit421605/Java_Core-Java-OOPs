import java.util.Scanner;

 class HoteLMenu{

Scanner sc=new Scanner(System.in);

public String DishName;
public String Ingredients;
public int price ;

 void HoteL(){

    System.out.println("Enter Dish Name");
    String food =sc.nextLine();
    this.DishName=food;

    System.out.println("Enter Ingredients");
     String Indg=sc.nextLine();
    this.Ingredients=Indg;

    System.out.println("Enter Price");
   int prc =sc.nextInt();
    this.price= prc ;

}
void Display(){

 System.out.println(" Dish"+this.DishName);
 System.out.println("Ingredients : "+this.Ingredients);
 System.out.println("price:"+this.price);

}

}
public class Main {
    public static void main(String[] args){

       HoteLMenu obj1=new HoteLMenu();
       obj1.HoteL();
       

       HoteLMenu obj2=new HoteLMenu();
       obj2.HoteL();

       obj1.Display();
       obj2.Display();



    }
}
