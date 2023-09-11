package org.testing.assertion;

public class responsedatassertion 
{
	public static boolean assertion(String expectedvalue, String actualvalue)
	{
		if(actualvalue.equals(expectedvalue))
		{
			System.out.println("data matched");
			return true;
		}
		else
		{
			System.out.println("data not matched");
			return false;
		}
	}
	
}
