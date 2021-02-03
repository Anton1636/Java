import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args)
    {
        //1//
        //System.out.println("''Your time is limited,\n \tso don’t waste it\n \t\tliving someone else’s life''\n \t\t\tSteve Jobs");

        //2//
       /* int firstDiget;
        int secondDiget;
        float result;

        System.out.println("Enter diget:");
        Scanner in = new Scanner(System.in);
        firstDiget = in.nextInt();

        System.out.println("Enter interest:");
        Scanner in2 = new Scanner(System.in);
        secondDiget = in2.nextInt();

        result=firstDiget/secondDiget;

        System.out.println("Your interest:" + secondDiget);
        System.out.println("Your diget:" + firstDiget);
        System.out.println("Result:" + result);*/

        //3//
//        int firstDiget;
//        int secondDiget;
//        int thirdDiget;
//
//
//        System.out.println("Enter first diget:");
//        Scanner in = new Scanner(System.in);
//        firstDiget = in.nextInt();
//
//        System.out.println("Enter second diget:");
//        Scanner in2 = new Scanner(System.in);
//        secondDiget = in.nextInt();
//
//        System.out.println("Enter third diget:");
//        Scanner in3 = new Scanner(System.in);
//        thirdDiget = in.nextInt();
//
//        System.out.println(firstDiget +"" + secondDiget +""+ thirdDiget);

        //4//
//        int a,b,c,d,e,f;
//        int n;
//
//        System.out.println("Enter only six-digit number ->");
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//
//        if(n<100000 || n>999999) {
//            System.out.println("Is not six-digit number");
//        }
//        else {
//            f=n%10;n/=10;
//            e=n%10;n/=10;
//            d=n%10;n/=10;
//            c=n%10;n/=10;
//            b=n%10;n/=10;
//            a=n%10;
//
//            System.out.println(f + "" + e + "" + c + "" + d + "" + b + "" + a);
//        }

        //5//
//        System.out.print("Введите номер месяца: ");
//        int x = Integer.parseInt(new Scanner(System.in).nextLine());
//        if (x == 12 || x <= 2) {
//        System.out.println("Зима");
//        }
//        else if (x >= 3 && x <= 5) {
//            System.out.println("Весна");
//        }
//        else if (x >= 6 && x <= 8)
//        {
//            System.out.println("Лето") ;
//        }
//        else if (x >= 9 && x <= 11)
//        {
//            System.out.println("Осень") ;
//        }

        //6//
//        float miles = (float) 0.000621371192;
//        float inches = (float) 39.3700787;
//        float yards = (float) 1.0936133;
//
//        System.out.println("Enter 1 if you want to convert meters to miles;");
//        System.out.println("Enter 2 if you want to convert meters to inches;");
//        System.out.println("Enter 3 if you want to convert meters to yards;");
//        System.out.println("->");
//
//        int i;
//        Scanner in = new Scanner(System.in);
//        i = in.nextInt();
//
//        System.out.println("Enter number of meters ->");
//        int n;
//        Scanner in1 = new Scanner(System.in);
//        n = in1.nextInt();
//
//        if(i ==1)
//        {
//            System.out.println(n * miles + "=miles.");
//        }
//        if(i ==2)
//        {
//            System.out.println(n * inches + "=inches.");
//        }
//        if(i ==3)
//        {
//            System.out.println(n * inches + "=yards.");
//        }


        //7//
//        int a, b;
//        System.out.println("Enter the start of the range ");
//        Scanner in1 = new Scanner(System.in);
//        a = in1.nextInt();
//
//        System.out.println("Enter the end of the range ");
//        Scanner in = new Scanner(System.in);
//        b = in.nextInt();
//        for (int i = a; i <= b; i++)
//        {
//            if (i % 2 == 0)
//            {
//                System.out.println(i);
//            }
//        }


        //9//
//        int arr[];
//        arr = new int[20];
//
//        for(int i = 0; i < 20; i++)
//        {
//            Scanner in = new Scanner(System.in);
//            arr[i] = in.nextInt();
//        }
//
//        int max = arr[0];
//        int min = arr[0];
//
//        for(int i = 0; i < 20; i++)
//        {
//            if (arr[i] > max)
//            {
//                max = arr[i];
//            }
//            if (arr[i] < min)
//            {
//                min = arr[i];
//            }
//        }
//
//        System.out.println("Max:" + max);
//        System.out.println("Min:" + min);

        //12//
//        System.out.println("Enter 1 if you want descending sorting array;");
//        System.out.println("Enter 2 if you want ascending array sort ;");
//
//        int i;
//        Scanner in = new Scanner(System.in);
//        i = in.nextInt();
//
//        if(i == 1)
//        {
//            int arr[] = new int[10];
//            for(int i = 0; i <  arr.length; i++)
//            {
//                arr[i] =  (int)(Math.random() * 100);
//                System.out.print(arr[i] + "  ");
//            }
//
//            System.out.print("\nSorted: \n");
//            Arrays.sort(arr);
//            for(int i = 0; i <  arr.length; i++)
//            {
//                System.out.print(arr[i] + "  ");
//            }
//        }
//        else if(i == 2)
//        {
//            Integer arr[] = new Integer[10];
//
//            for(int i = 0; i <  arr.length; i++)
//            {
//                arr[i] =  (int)(Math.random() * 100);
//                System.out.print(arr[i] + "  ");
//            }
//
//            System.out.print("\nSorted: \n");
//            Arrays.sort(arr, Collections.reverseOrder());
//
//            for(int i = 0; i <  arr.length; i++)
//            {
//                System.out.print(arr[i] + "  ");
//            }
//        }

    }
}
