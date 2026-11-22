class student{
int rollNo;
String name;
student(int rollNo, String name){
    this.rollNo=rollNo;
    this.name=name;
}
}
public class Array {
    public  static void main(String[] args){
        int[] arr={1,2,3,4,5};
        String[] StringArr={"Amit","Aaditya","Sumit"};
        student[] ArrOfObj;

        ArrOfObj=new student[3];

        ArrOfObj[0]=new student(19,"Amit");
         ArrOfObj[1]=new student(20,"Aditya");
          ArrOfObj[2]=new student(21,"Sumit");



for(int i=0;i<3;i++){
    System.out.println("Student Name :"+ArrOfObj[i].name);
      System.out.println("Student Roll :"+ArrOfObj[i].rollNo);
}
        


    }
}
