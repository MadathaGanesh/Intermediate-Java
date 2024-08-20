package AbstarctDemo2;

import java.util.Scanner;

public class MathOperation extends AbstractClass{
    Scanner sc=new Scanner(System.in);

    int num1=sc.nextInt();
    int num2=sc.nextInt();
    public void addition(){
        int sum=num1+num2;
        System.out.println("addition is :: "+sum);
    }

    public void subtraction(){
        int diff=num1-num2;
        System.out.println("difference is :: "+diff);
    }

    public void multiplication(){
        int mul=num1*num2;
        System.out.println("product is :"+mul);
    }

    public void division(){
        int div=num1/num2;
        System.out.println("quotient is : "+div);
    }


    public void modulo(){
        int mod=num1%num2;
        System.out.println("modulus is : "+mod);
    }

}
