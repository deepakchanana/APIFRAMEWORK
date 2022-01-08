package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3 {

	@Test
	public void testCase3() throws IOException
	{
		 Properties pr=LoadPropertiesFile.propertiesFile("../APIFW/URI.properties");
		 HTTPMethods http=new HTTPMethods(pr);
		Response res=http.getAllRecords("QA_Env_APIStudents_URI");
		System.out.println("******************TC3*************");
		 System.out.println("status code is "+res.statusCode());
		 System.out.println("response data is "+res.asString());

	}

}
