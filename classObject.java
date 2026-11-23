

public class classObject {
     public static void main(String[] args){

        Car Car1=new Car();
        Car Car2=new Car();
        Car Car3=new Car();

        Car1.brand="Toyota";
        Car1.Color="White";
        Car1.Price=200000;

         Car2.brand="Chevorlet";
        Car2.Color="Gray";
        Car2.Price=500000;

         Car3.brand="Mercedes";
        Car3.Color="Red";
        Car3.Price=900000;
        
        Car1.Drive();
         Car2.Drive();
          Car3.Drive();
    
     }
}
 class Car{
    String brand ;
    String Color;
   int  Price ;

    void Drive(){
        System.out.println("You can drive ");
    }
}
