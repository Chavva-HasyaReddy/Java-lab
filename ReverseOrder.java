//Program to reverse the order of digits in a given number
import java.util.Scanner;
public class ReverseOrder
{
   public static void main(String args[])
	{
	  Scanner reader = new Scanner(System.in);
	  System.out.print("\nEnter the number: ");
	  int num = reader.nextInt();
	  int numcopy = num;
	  int reversenum = 0;
	  while(num >0)
	  {
	    reversenum = reversenum*10 + num%10;
	    num = num/10;
	  }	
	  System.out.print("Reverse of the given number is " + reversenum); 
	}
}