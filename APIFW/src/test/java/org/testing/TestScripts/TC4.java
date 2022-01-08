package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.Json;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC4 {
	
	@Test
	public void testCase4() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesFile("../APIFW/URI.properties");
		String bodyData=Json.loadJsonFile("../APIFW/src/test/java/org/testing/Payloads/bodyDataforUpdate.json");
		bodyData=jsonVariable.jsonVariableReplacement(bodyData,"id",TC1.responseidValue);
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.updateRecord(bodyData,"QA_Env_APIStudents_URI",TC1.responseidValue);
	}

}
