package org.testing.TestScripts;

import java.io.IOException;

import org.testing.utilities.LoadXmlData;

public class TC5 {
	public static void main(String[] args) throws IOException {
		
	String response=	LoadXmlData.readXml("../APIFW/src/test/java/org/testing/Payloads/xmlFile.xml");
	System.out.println(response);
	}

}
