package Task2;

import java.util.Scanner;

public class First {
    public void SumOfFractions(){

        System.out.println("Enter first number ->");
        String number1;
        Scanner in = new Scanner(System.in);
        number1 = in.nextLine();

        System.out.println("Enter second number ->");
        String number2;
        Scanner in1 = new Scanner(System.in);
        number2 = in1.nextLine();

        SumFractions sf = () ->{
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int temp1 = n1;
                int temp2 = n2;

                while (n1 != n2){
                   if(n1 > n2)
                      n1 = n1 - n2;
                  else
                     n2 = n2 - n1;
                }

                int n3 = temp1 / n1 ;
                int n4 = temp2 / n1 ;

                System.out.print("\n Output :\n");
                System.out.print(n3 + "/" + n4 + "\n\n" );
                System.exit(0);
            return n3 + n4;
        };
    }

    public void DifOfFractions()
    {
        System.out.println("Enter first dig ->");
        String number3;
        Scanner in = new Scanner(System.in);
        number3 = in.nextLine();

        System.out.println("Enter second dig ->");
        String number4;
        Scanner in1 = new Scanner(System.in);
        number4 = in1.nextLine();

        DifFractions df = () ->
        {
            int n1 = Integer.parseInt(number3);
            int n2 = Integer.parseInt(number4);
            n2 = n2 * n2;
            n1 = n1 * n2 - n1 * n2;
            return n1 + n2;
        };

    }

    public void СompOfFractions()
    {
        System.out.println("Enter firsdt dig ->");
        String number3;
        Scanner in = new Scanner(System.in);
        number3 = in.nextLine();

        System.out.println("Enter second dig ->");
        String number4;
        Scanner in1 = new Scanner(System.in);
        number4 = in1.nextLine();

        СompFractions cf = () ->
        {
            int n1 = Integer.parseInt(number3);
            int n2 = Integer.parseInt(number4);

            n2 = n2 * n2;
            n1 = n1 * n1;

            return n1 + n2;
        };
    }

    public void DivOfFractions()
    {
        System.out.println("Enter firsdt dig ->");
        String number3;
        Scanner in = new Scanner(System.in);
        number3 = in.nextLine();

        System.out.println("Enter second dig ->");
        String number4;
        Scanner in1 = new Scanner(System.in);
        number4 = in1.nextLine();

        DivFractions df = () ->{
            int n1 = Integer.parseInt(number3);
            int n2 = Integer.parseInt(number4);

            n2 = n2 * n1;
            n1 = n1 * n2;

            return n1 + n2;
        };
    }
}

interface DivFractions{
    int division();
}

interface СompFractions{
    int composition();
}

interface DifFractions{
    int different();
}

interface SumFractions
{
    int calculate();
}
