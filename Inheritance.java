class Animal{
    void Eat(){
        System.err.println("Eating...");
    }
    void Sound(){
        System.err.println("Animal sound");
    }
}

class Dog extends Animal{

       @Override 
      void Eat(){
         System.err.println("Eating...by dog ");
       }

    void Eating(){
        // "super" keyword allows to access methods of Parent Class 
        super.Eat();
         System.out.println("Dog is eating...");
    }
    void sound(){
        super.Sound();
        System.err.println("Dog is barking ");

    }
   
}
public class Inheritance {
    public static void main(){
        Dog dog=new Dog();
        // we can override the parent class in child class using @override 
      Animal animal= new Dog();
     animal.Eat();
       
    //    dog.sound();

    //    dog.Eating();

    }
}
