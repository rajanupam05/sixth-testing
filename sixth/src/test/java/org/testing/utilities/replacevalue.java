package org.testing.utilities;

import java.util.regex.Pattern;

import io.restassured.response.Response;

public class replacevalue 
{
	public static String replace(String responsedata, String variablename, String variablevalue)
	{
		return responsedata.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);
	}
}
