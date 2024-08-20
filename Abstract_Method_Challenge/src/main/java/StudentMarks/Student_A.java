package StudentMarks;

import java.util.Scanner;

public class Student_A extends AbstractMethod{
    Scanner sc=new Scanner(System.in);
    @Override
    public void getpercentage() {
        System.out.println("enter 3 subject marks :");
        int telugu = sc.nextInt();
        int hindi = sc.nextInt();
        int english = sc.nextInt();
        int total_marks=telugu+hindi+english;
        double percentage=(total_marks/300.0)*100;
        System.out.println("Total marks of student A is :"+total_marks);
        System.out.println("percentage of studnet A is :"+percentage);
    }
}
