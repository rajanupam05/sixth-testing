package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.datasoft;
import org.testing.teststeps.httpmethod;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class getparticular_tc3 
{
	@Test
	public static void tc3() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadproperties("../sixth/uri.properties");
		httpmethod http=new httpmethod(pr);
		Response res=http.getparticular("uri1", post_tc1.returnvalue);
		datasoft.validate(res, "name", "kapil");
	}
}
