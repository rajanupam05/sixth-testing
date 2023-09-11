package org.testing.teststeps;

import java.util.Properties;

import javax.print.DocFlavor.STRING;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class httpmethod 
{
	static Properties pr;
	public httpmethod(Properties pr) {
		this.pr=pr;
	}
	public static Response post(String urikeyname, String responsedata)
	{
		String urikeyvalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(responsedata)
				.when()
				.post(urikeyvalue);
		
		System.out.println("post value");
		System.out.println(res.asString());
		return res;
	}
	public static Response get(String urikeyname)
	{
		String urikeyvalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urikeyvalue);
		
		System.out.println("get data");
		System.out.println(res.asString());
		return res;
	}
	public static Response getparticular(String urikeyname, String endpoint)
	{
		String urikeyvalue=pr.getProperty(urikeyname)+"/"+endpoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urikeyvalue);
		
		System.out.println("getparticular data");
		System.out.println(res.asString());
		return res;
	}
}