package AbstractClassDemo;

import java.util.Scanner;

public class EmployeeDetails extends Abstract{

    @Override
    public void employeeDetails() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.next();

        System.out.println("enter age :");
        int age=sc.nextInt();

        System.out.println("enter address :");
        String address=sc.next();

        System.out.println("employee name is :: "+name);
        System.out.println("employee age is : "+age);
        System.out.println("employee address is :: "+address);
    }
}
