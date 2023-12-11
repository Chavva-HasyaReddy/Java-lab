//Program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.Scanner;
import java.lang.Math;
public class FloatingDigit
{
   public static void main(String args[])
   {
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter 1st number: ");
      double n1 = reader.nextDouble();
      System.out.print("Enter 2nd number: ");
      double n2 = reader.nextDouble();
      reader.close();
      if (Math.abs(n1 - n2) <= 0.001) 
      {
	  System.out.print("Entered both numbers are same upto three decimal places.");
      }
      else 
      {
	  System.out.print("Entered numbers are different upto three decimal places.");
      }
   }
}
