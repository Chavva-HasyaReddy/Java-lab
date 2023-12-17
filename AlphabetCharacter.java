//Program to check whether a given character is Aplhabet or not
import java.util.Scanner;
public class AlphabetCharacter
{
    public static void main(String args[])
    {
       Scanner reader = new Scanner(System.in);
       System.out.print("\nPlease enter a character: ");
       char ch = reader.next().charAt(0);
       if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
	{
	     System.out.print("Entered character is an Alphabet.");
	}
       else
       {
             System.out.print("Entered character is not an Alphabet.");
       }
    }
}