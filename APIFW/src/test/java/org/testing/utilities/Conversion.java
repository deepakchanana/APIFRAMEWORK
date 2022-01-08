package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion 
{
 public static String xmltoJson(String xmlData)
 {
	  JSONObject js=XML.toJSONObject(xmlData);	
		
	   return js.toString();
 }
 public static String Jsontoxml(String jsonData)
 {
	 JSONObject obj = new JSONObject(jsonData);
		
		String xml_data = XML.toString(obj);
		return xml_data;
 }
}
