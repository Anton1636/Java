package Utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static Utils.Helper.compare;

public class TestMyArray extends MyArray {

    Integer TestArray[] = new Integer[]{};
    int item;

    protected void FillArray()
    {
        int EnterElement;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements you will enter");
        EnterElement = sc.nextInt();
        TestArray = new Integer[EnterElement];
        for(int i = 0; i < EnterElement; i++){
            TestArray[i] = sc.nextInt();
        }
    }

    protected void FillArrayRandomDiget()
    {
        int arraySize;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array ->");

        arraySize = in.nextInt();
        TestArray = new Integer [arraySize];

        for ( int i : TestArray)
        {
            i = (int) (Math.random() * arraySize);
        }
    }

    protected void ShowArray()
    {
        for (int i = 0; i < TestArray.length; i++)
        {
            System.out.println(TestArray[i]);
        }
    }

    protected int MaxValue()
    {
        int max = TestArray[0];
        int maxIndex = 0;

        for (int index = 0; index < TestArray.length; index++)
        {
            if (TestArray[index] > max) {
                max = TestArray[index];
                maxIndex = index;
            }
        }

        for (int index = maxIndex; index < TestArray.length; index++)
        {
            System.out.println(TestArray[index]);
        }
        return max;
    }

    protected int MinValue()
    {
        int min = TestArray[0];
        for(int i = 0; i != TestArray.length; i ++)
        {
            if (min > TestArray[i])
            {
                min = TestArray[i];
            }
        }
        System.out.println(min + " ");
        return min;
    }

    protected void ArithmeticMean()
    {
        double result = 0;

        for (int i=0; i<5; i++)
        {
            result = result + TestArray[i];
        }
            System.out.println("Среднее значение равно " + result / TestArray.length);
    }

    protected void SortArrayAscending()
    {
        for(int i = 0; i <  TestArray.length; i++)
        {
            TestArray[i] = (int)(Math.random() * 100);
            System.out.print(TestArray[i] + "  ");
        }

        System.out.print("Sorted: \n");
        Arrays.sort(TestArray);
        ShowArray();
    }

    protected void SortArrayDescending()
    {
        for(int i = 0; i <  TestArray.length; i++) {
            TestArray[i] =  (int)(Math.random() * 100);
            System.out.print(TestArray[i] + "  ");
        }

        System.out.print("Sorted: \n");
        Arrays.sort(TestArray, Collections.reverseOrder());
        ShowArray();
    }

    protected void BinarySearch()
    {
        int MaxValue = MaxValue();
        int MinValue = MinValue();
        int position;
        int comparisonCount = 1;

        position = (MinValue + MaxValue) / 2;

        while ((TestArray[position] != item) && (MinValue <= MaxValue))
        {
            comparisonCount++;

            if (TestArray[position] > item)
            {
                MaxValue = position - 1;
            }
            else {
                MinValue = position + 1;
            }
            position = (MinValue + MaxValue) / 2;
        }
        if (MinValue <= MaxValue)
        {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount + " сравнений");
        }
        else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после " + comparisonCount + " сравнений");
        }
    }

    protected void ReplacingValueInNewValue()
    {
        Integer[] newArr = new Integer[TestArray.length];
        Integer sum = 0;

        for (int i = 0; i < TestArray.length; i++)
        {
            sum += TestArray[i];
        }

        Integer average = sum / TestArray.length;
        System.out.println("average = " + average);
        int n = 0;

        for(int i = 0; i < TestArray.length; i++)
        {
            boolean check = compare(TestArray[i],average);
            if(check)
            {
                newArr[n] = TestArray[i];
                n++;
            }
        }

        for (int i = 0; i < TestArray.length; i++)
        {
            System.out.print(newArr[i] + " ");
        }
    }
}
