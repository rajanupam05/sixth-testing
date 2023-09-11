package org.testing.responsevalidation;

import org.testng.Assert;

public class statushardvalidation {
	public static void validate(int actualvalue, int expectedvalue)
	{
		Assert.assertEquals(actualvalue, expectedvalue, "status code not matched");
		System.out.println("status code matched");
	}

}
