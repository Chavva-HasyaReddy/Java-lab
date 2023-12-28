//Program to differentiate between static and non-static methods.

class StaticNonStaticMethod
{
    int count=0;
    static int obCount;
    public static int objectCount()
    {
	return ++obCount;
    }
    public void increaseCount()
    {
        count++;
    }
    public void printCount()
    {
	System.out.println("\nThe number of object created = "+StaticNonStaticMethod.obCount );
	System.out.println("\nThe value of count = " +count );
    }
}
class StaticVsNonStaticMethod
{
    public static void main(String args[])
    {
	StaticNonStaticMethod ob1= new StaticNonStaticMethod();
	StaticNonStaticMethod.objectCount();
	ob1.increaseCount();
	ob1.increaseCount();
	ob1.increaseCount();
	ob1.printCount(); 
	StaticNonStaticMethod ob2= new StaticNonStaticMethod();
	StaticNonStaticMethod.objectCount();
	ob2.increaseCount();
	ob2.increaseCount();
	ob2.increaseCount();
	ob2.increaseCount();
	ob2.printCount(); 
        StaticNonStaticMethod ob3= new StaticNonStaticMethod();
	StaticNonStaticMethod.objectCount();
        ob3.printCount(); 
        StaticNonStaticMethod ob4= new StaticNonStaticMethod();
	StaticNonStaticMethod.objectCount();
        ob4.increaseCount();
        ob4.printCount(); 
    }
}