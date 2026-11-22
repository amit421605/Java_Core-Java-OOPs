import java.util.Scanner;

public class electricity {
    public static void main(String[] args){

   Scanner sc =new Scanner(System.in);
   int units,bill =0;

   System.out.print("Enter electricity units : ");
   units=sc.nextInt();
   if(units<=100){
    bill+=units*2;
   } 
   else if(units>100 && units <=200){
     bill+=2*100;
     units=units-100 ;
     bill += 3 * units ; 
   }
   else {
     bill+=2*100;
     bill += 3*100;
     units = units - 200 ; 
     bill += 5*units ; 

   }
 bill+=50 ; 
   System.out.println("Electricity Bill: "+bill);

    }
}
