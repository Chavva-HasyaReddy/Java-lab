// Program to swap two given numbers
import java.util.Scanner;
public class SwapTwoNum
{
    public static void main(String args[])
      {
          Scanner reader = new Scanner(System.in);
          System.out.print("\nEnter the first number: ");
          int a = reader.nextInt();    
          System.out.print("\nEnter the second number: ");
          int b = reader.nextInt();
          reader.close();
	  int temp = a;
          a= b;
          b = temp;
          System.out.print("Swaped numbers are: First number = " + a + " Second number: " + b);    
      }
}