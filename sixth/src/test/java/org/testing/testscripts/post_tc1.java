package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.responsevalidation.statussoft;
import org.testing.teststeps.httpmethod;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testing.utilities.propertieshandle;
import org.testing.utilities.replacevalue;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.response.Response;

public class post_tc1 
{
	static String returnvalue;
	@Test
	public static void tc1() throws FileNotFoundException, IOException
	{
		///reporthandling
		
		ExtentReports report=new ExtentReports("c://report//report5.html");
		ExtentTest test1=report.startTest("post_tc1");
		
		///path for uri and json file declare
		
		Properties pr=propertieshandle.loadproperties("../sixth/uri.properties");
		String responsedata=jsonhandle.loadjsonfile("../sixth/src/test/java/org/testing/resources/request_payload.json");
		
		///value declare
		
		Random r=new Random();
		Integer input=r.nextInt();
		String response=replacevalue.replace(responsedata, "id", input.toString());
		System.out.print("enter the name: ");
		//Scanner s=new Scanner(System.in);
		//String name=s.next();
		//String finalvalue=replacevalue.replace(response, "name", name);
		
		///steps calling
		
		httpmethod http=new httpmethod(pr);
		Response res=http.post("uri1", response);
		returnvalue=jsonparsingusingorgjson.jsonparseget(res.asString(), "id");
		
		///responsevalidation
		
		statussoft.reportassertion(201, res, test1);
		statussoft.logassertion(201, res, test1, "tc1");
		statussoft.validate(res, 201);
		
		///report save and close
		
		report.endTest(test1);
		report.flush();
	}
}
