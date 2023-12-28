//Program to pass the variable length arguments.

class VariableLenArg
{
    public static void main(String args[])
    {
	System.out.print("\nProgram to display the variable length Arguments passing ....\n");
	VariableArg va = new VariableArg();
	System.out.print("\nOnly one Arguments ------\n");
	va.print_arguments("Hasya ");
	System.out.print("\nMultiple Arguments ------\n");
	va.print_arguments("Chavva\n", "Hasya\n", "Reddy\n");
    }
}
class VariableArg
{
    void print_arguments(String... str)
    {
	for(String s:str)
	{
	    System.out.print(s);
	}
    }
}