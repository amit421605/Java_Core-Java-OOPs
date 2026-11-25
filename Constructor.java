class Student{
    String name;
    int age ;
    Student(String name, int age){
        this.name=name;
        this.age= age;
    }
    // copy constructor 
    Student( Student s1){
        this.name= s1.name;
        this.age= s1.age;
    }
}
public class Constructor {
    public static void main(String[] args){
            Student s1 = new Student("Amit", 20);
            Student s2=new Student(s1);
            System.out.println("object2 Name  : "+s2.name);


    }
}
