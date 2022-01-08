package org.testing.testSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

// how we can fetch the URI from the properties file
// we required the properties object
// with the help of constructor we can
// assign the values

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}

	public Response postMethod(String bodydata,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(uriKey));
		
		return res;
	}
	
	public Response getMethod(String uriKey,String id)
	{
		String uri=pr.getProperty(uriKey)+"/"+id;
		
		Response res=
		given().contentType(ContentType.JSON)
		.when().get(uri);
		
		return res;
	}
	
	public Response getAllRecords(String uriKey)
	{
		
		
		Response res=
		given().contentType(ContentType.JSON)
		.when().get(pr.getProperty(uriKey));
		
		return res;
	}
	
	public Response updateRecord(String bodyData,String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		
		return res;
	}
	
	
}
