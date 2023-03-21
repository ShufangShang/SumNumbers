import java.util.Scanner;
import java.util.*;
public class App {

    static List <Integer> numList = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner (System.in);



        for (int i = 0; i < 5; i++)
        {
            System.out.println("Please enter an integer:");
            int num = input.nextInt();
            numList.add(num);
        }

        int sum = 0;
        int prod = 1;
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;

        for (int i = 0; i < numList.size(); i++)
        {
             sum += numList.get(i);
             prod *= numList.get(i);
             if(largest < numList.get(i))
             {
                largest = numList.get(i);                
             }

             if (smallest > numList.get(i))
             {
                smallest = numList.get(i);
             }
        }

        System.out.printf("Sum = %d. product = %d, Lagest = %d, Smallest = %d", sum, prod, largest, smallest );
    }
}
