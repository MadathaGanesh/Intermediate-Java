package StudentMarks;


import java.util.Scanner;

public class Student_B extends AbstractMethod{
    Scanner sc=new Scanner(System.in);
    @Override
    public void getpercentage() {
        System.out.println("enter 4 subject marks :");
        int telugu=sc.nextInt();
        int hindi=sc.nextInt();
        int english=sc.nextInt();
        int maths=sc.nextInt();
        int totalmarks=telugu+hindi+english+maths;
        double percentage=(totalmarks/400.0)*100;
        System.out.println("Total marks of student B is : "+totalmarks);
        System.out.println("percentage of student B is ::"+percentage);
    }
}
