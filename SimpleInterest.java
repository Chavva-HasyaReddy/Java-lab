import java.util.Scanner;
public class SimpleInterest 
{
   public static void main(String args[]) 
   {
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter the principal: ");
      double principal = reader.nextDouble();
      System.out.print("Enter the rate: ");
      double rate = reader.nextDouble();
      System.out.print("Enter the time: ");
      double time = reader.nextDouble();
      double interest = (principal * time * rate) / 100;
      System.out.println("Simple Interest: " + interest);
   }
}