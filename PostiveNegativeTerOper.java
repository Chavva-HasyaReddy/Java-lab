// Program to read a number from the user and print whether it is positive or negative using ternary operator

import java.util.Scanner;
class PositiveNegativeTerOper
{
    public static void main(String args[])
    {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int number = reader.nextInt();
        reader.close();
        String result = ( number > 0 ? "Postive Number" : "Negative Number");
        System.out.println("Entered number " + number + " is "+ result);
    }
}