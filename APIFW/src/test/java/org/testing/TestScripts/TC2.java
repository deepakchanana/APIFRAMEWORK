package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2
{
@Test	
 public void testCase2() throws IOException
 {
	 Properties pr=LoadPropertiesFile.propertiesFile("../APIFW/URI.properties");
	 HTTPMethods http=new HTTPMethods(pr);
	Response res=http.getMethod("QA_Env_APIStudents_URI",TC1.responseidValue);
	System.out.println("******************TC2*************");
	 System.out.println("status code is "+res.statusCode());
	 System.out.println("response data is "+res.asString());
	 
	 ResponseValidation.statusCodeValidation(201, res);
	 
	 ResponseValidation.dataValidation("Deepak", res, "firstname");
	 
	 
	 
 }
	
}
