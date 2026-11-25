// variables initialsised using static keyWord shared among all object 
// same for methods , there calling/ representing is little different 
class Student {
    static String college = "SAKEC";
    String name;

    static int add(int a, int b) {
        return a + b;
    }

    // static methods cannot direct access object because they do not have this
    // reference
    // static void Show(){
    // System.out.println("Name"+name);
    // }

}

 class Outer {
    static class Inner {
        void SayHello() {
            System.out.println("hello");
        }
    }
}

public class Static {
    public static void main() {
        Student std = new Student();
        System.out.println(Student.college);
        int result = Student.add(10, 20);
        System.out.println(result);

        Outer.Inner obj = new Outer.Inner();
        obj.SayHello();
    }
}
