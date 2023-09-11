package org.testing.assertion;

public class statuscodeassertion 
{
	public static boolean assertion(int expectedvalue, int actualvalue)
	{
		if(actualvalue==expectedvalue)
		{
			System.out.println("status code matched");
			return true;
		}
		else
		{
			System.out.println("status code not matched");
			return false;
		}
	}
	
}
