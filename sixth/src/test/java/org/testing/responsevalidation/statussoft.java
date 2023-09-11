package org.testing.responsevalidation;

import org.testing.assertion.statuscodeassertion;
import org.testing.logreportcapture.loghandle;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class statussoft 
{
	public static void validate(Response res, int expectedvalue)
	{
		boolean response=statuscodeassertion.assertion(expectedvalue, res.statusCode());
		Assert.assertTrue(response);
	}
	public static boolean reportassertion(int expectedvalue, Response res, ExtentTest test)
	{
		boolean response=statuscodeassertion.assertion(expectedvalue, res.statusCode());
		if(response)
		{
			test.log(LogStatus.PASS, "status code matched");
			return true;
		}
		else
		{
			test.log(LogStatus.FAIL, "status code not matched");
			return false;
		}
	}
		public static boolean logassertion(int expectedvalue, Response res, ExtentTest test, String classname)
		{
			boolean response=statuscodeassertion.assertion(expectedvalue, res.statusCode());
			if(response)
			{
				loghandle.logcapture(classname, "status code matched");
				return true;
			}
			else
			{
				loghandle.logcapture(classname, "status code not matched");
				return false;
			}
	}
	

}
