package org.testing.utilities;

import io.restassured.response.Response;

public class jsonparsingusingjsonpath 
{
	public static String jsonparse(String jsonpath, Response res)
	{
		return res.jsonPath().get(jsonpath);
	}
}
