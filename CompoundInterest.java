import java.util.Scanner;
public class CompoundInterest
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
      System.out.print("Enter number of times interest is compounded: ");
      int number = reader.nextInt();
      double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
      System.out.println("Compound Interest: " + interest);
    }
}