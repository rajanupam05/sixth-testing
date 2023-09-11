package org.testing.responsevalidation;

import org.testing.assertion.responsedatassertion;
import org.testing.utilities.jsonparsingusingjsonpath;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testng.Assert;

import io.restassured.response.Response;

public class datasoft {
	public static void validate(Response res, String jsonpath, String expectedvalue)
	{
		String actualvalue=jsonparsingusingjsonpath.jsonparse(jsonpath, res);
		boolean response=responsedatassertion.assertion(expectedvalue, actualvalue);
		Assert.assertTrue(response);
	}
}
