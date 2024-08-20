import java.util.Scanner;

public abstract class SecondAbstractClass extends FirstAbstarctClass{
    public void studentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name ::");
        String name=sc.next();
        System.out.println("enter student roll no :");
        String rollno=sc.next();
        System.out.println("enter student phonenumber :");
        long number=sc.nextLong();

        System.out.println();
        System.out.println("student name  is :: "+name);
        System.out.println("student roll no is ::"+rollno);
        System.out.println("student number is ::"+number);
    }
}
