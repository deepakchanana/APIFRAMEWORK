package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.response.Response;

public class jsonParsing
{
 public static String jsonParse(String response,String keyName)
 {
	 JSONObject ob=new JSONObject(response);
	 return ob.get(keyName).toString();	 
 }
 public static void jsonParseAllKeys(String response,String keyName)
 {
	JSONArray js=new JSONArray(response);
	int L=js.length();
	for(int i=0;i<L;i++)
	{
		JSONObject ob=js.getJSONObject(i);
		System.out.println(ob.get(keyName));
	}
 }
 
 public static String jsonParseUsingjsonPath(Response res,String jsonPath)
 {
	 return res.jsonPath().get(jsonPath);
 }
}

