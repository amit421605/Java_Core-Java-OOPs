// Polymorphis means same methods can behave differnetly according to the object
// poly=>many , morphism => form 
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks .. . ");
    }

}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Mews .. ");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        // Animal dog = new Dog();
        // Animal cat = new Cat();
        // dog.sound();
        // cat.sound();

        Animal[] animal={
            new Dog(),
            new Cat()
        };
         // iterating through array of object and executing the overriden function
         
        for(Animal ani : animal){
            ani.sound();
        }

    }
}
