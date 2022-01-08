package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// Purpose of this class
// it will load the properties file
// what should be the input to this method ?
// the path of the file
// here we can't hard code the path of the
// properties file if we are specifying the 
// path in the method itself we have limitation
// in our method it can handle only that file
// so that's why we are taking the file path
// as a method input
// what will be the output of this method
// it will be non void method
// it will return the object of the properties class

public class LoadPropertiesFile 
{

	public static Properties propertiesFile(String path) throws IOException
	{
		File f=new File(path); // connection establish
		FileInputStream fi=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fi);		
		return pr;
	}
	
}
