package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.httpmethod;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class get_tc2 {
	@Test
	public static void tc2() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadproperties("../sixth/uri.properties");
		httpmethod http=new httpmethod(pr);
		Response res=http.get("uri1");
		System.out.println();
		System.out.println("+++++++++++++id parsed value++++++++++");
		jsonparsingusingorgjson.jsonparse(res.asString(), "id");
	}

}
