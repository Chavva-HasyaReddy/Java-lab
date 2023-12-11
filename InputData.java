//Program to read input and show the value
import java.util.Scanner;
public class InputData
{
   public static void main(String args[])
   {
      System.out.print("Enter the number = ");
      Scanner reader = new Scanner(System.in);
      int num = reader.nextInt();
      System.out.print("\n Entered number is "+num);
   }
}