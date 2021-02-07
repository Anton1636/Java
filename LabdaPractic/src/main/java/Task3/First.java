package Task3;

import java.util.Scanner;

public class First {
    public void Max(){
        System.out.println("Enter first number ->");
        int num1;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();

        System.out.println("Enter second number ->");
        int num2;
        Scanner in1 = new Scanner(System.in);
        num2 = in1.nextInt();

        System.out.println("Enter third number ->");
        int num3;
        Scanner in2 = new Scanner(System.in);
        num3 = in2.nextInt();

        System.out.println("Enter fourth number ->");
        int num4;
        Scanner in3 = new Scanner(System.in);
        num4 = in3.nextInt();

        int maxNub = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        System.out.println(maxNub);
    }

    public  void Min(){
        System.out.println("Enter first number ->");
        int num1;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();

        System.out.println("Enter second number ->");
        int num2;
        Scanner in1 = new Scanner(System.in);
        num2 = in1.nextInt();

        System.out.println("Enter third number ->");
        int num3;
        Scanner in2 = new Scanner(System.in);
        num3 = in2.nextInt();

        System.out.println("Enter fourth number ->");
        int num4;
        Scanner in3 = new Scanner(System.in);
        num4 = in3.nextInt();

        int minNub = Math.min(Math.min(num1, num2), Math.min(num3, num4));
        System.out.println(minNub);
    }
}
