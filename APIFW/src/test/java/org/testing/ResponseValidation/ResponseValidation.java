package org.testing.ResponseValidation;

import org.testing.utilities.jsonParsing;
import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidation
{
 public static void statusCodeValidation(int expectedResponseCode,Response res)
 {
Assert.assertEquals(res.statusCode(), expectedResponseCode,"status code is not matching");
 }
 public static void dataValidation(String expectedData,Response res,String jsonPath)
 {
	 String actualData=jsonParsing.jsonParseUsingjsonPath(res, jsonPath);
	 if(actualData.equals(expectedData))
	 {
		 System.out.println("Data is matching ");
	 }
	 else
	 {
		 System.out.println("Data is not matching");
	 }
 }
}
