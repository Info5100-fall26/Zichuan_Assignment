package edu.neu.mgen;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        int num1 = 10;
        int num2 = 20;
        long longNum1 = 1000L;
        long longNum2 = 2000L;
        double doubleNum1 = 10.1;
        double doubleNum2 = 20.1;
        boolean bool1 = true;
        boolean bool2 = false;
        char char1 = 'A';
        char char2 = 'B';
        long myLong1 = num1;
        long myLong2 = num2;
        int myInt1 = (int) longNum1;
        int myInt2 = (int) longNum2;
        System.out.print("Enter number:");
        int myNumber = myObj.nextInt();
        System.out.println("Number is: "+myNumber);
        System.out.print("Enter long number: ");
        long mylongNumber = myObj.nextLong();
        System.out.print("Enter double number: ");
        double myDoubleNumber = myObj.nextDouble();
        System.out.print("Enter boolean value: ");
        boolean myBoolean = myObj.nextBoolean();
        int sum;
        sum = num1 + num2;
        System.out.println("The sum: " + sum);
        int difference;
        difference = num1 - num2;
        System.out.println("The difference: " + difference);
        System.out.println("Logical AND: " + (bool1 && bool2));


        /*
        * This program prints a message.
        * It is my first Java program
        */
        // Print a message to the console
        System.out.println( "It is my first Java program" );
    }
}
