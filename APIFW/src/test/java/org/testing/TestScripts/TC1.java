package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.protocol.HTTP;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.Json;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.RandomData;
import org.testing.utilities.jsonParsing;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// TC1-----------post request
// we required bodydata for the post request
// we required the properties object
// how this testCase class will fetch
// the body data 
// it will call the utility method

public class TC1
{
	static String responseidValue;
	@Test
  public void testCase1() throws IOException
  {
 String bodyData=Json.loadJsonFile("../APIFW/src/test/java/org/testing/Payloads/bodyData.json");
 String randomId=RandomData.random();
 bodyData=jsonVariable.jsonVariableReplacement(bodyData,"id",randomId);
 
 Properties pr=LoadPropertiesFile.propertiesFile("../APIFW/URI.properties");
 HTTPMethods http=new HTTPMethods(pr);
 Response res=http.postMethod(bodyData,"QA_Env_APIStudents_URI");
 System.out.println("******************TC1*************");
 System.out.println("status code is "+res.statusCode());
 System.out.println("response data is "+res.asString());
 responseidValue=jsonParsing.jsonParse(res.asString(),"id");

 ResponseValidation.statusCodeValidation(201, res);
 
  }
}
