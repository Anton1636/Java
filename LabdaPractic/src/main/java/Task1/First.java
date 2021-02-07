package Task1;

import java.util.Scanner;

public class First {
    public void IsLeepYear()
    {
        System.out.println("Enter year ->");
        int year;
        Scanner in = new Scanner(System.in);

        year = in.nextInt();

        IsLeepYear lp = () -> {

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Year " + year + " is leep year");

            } else {
                System.out.println("Year " + year + " is't leep year");
            }
            return year;
        };

        System.out.println(lp.calculate());
    }
}

interface IsLeepYear
{
    int calculate();
}

