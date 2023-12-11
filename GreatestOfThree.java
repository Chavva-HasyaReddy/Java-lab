//Program to take three numbers from user and print the greatest number
import java.util.Scanner;
public class GreatestOfThree
{
   public static void main(String args[])
   {
      Scanner reader=new Scanner(System.in);
      System.out.println("Enter three numbers ");
      System.out.print("1st number : ");
      int n1=reader.nextInt();
      System.out.print("2nd number : ");
      int n2=reader.nextInt();
      System.out.print("3rd number : ");
      int n3=reader.nextInt();
      if(n1>n2)
      {
          if(n1>n3)
          {
             System.out.print("Greatest among " + n1 + ", "  + n2 + " and " + n3 + " is " + n1);
          }
          else
          {
             System.out.println("Greatest among " + n1 + ", "  + n2 + " and " + n3 + " is " + n3);
          }
      }
      else
      {
         if(n2>n3)
         {
             System.out.println("Greatest among " + n1 + ", "  + n2 + " and " + n3 + " is " + n2);
         }
         else
         {
             System.out.println("Greatest among " + n1 + ", "  + n2 + " and " + n3 + " is " + n3);
         }
      }
   }
}