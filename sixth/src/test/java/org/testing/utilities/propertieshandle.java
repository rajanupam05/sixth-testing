package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertieshandle 
{
	public static Properties loadproperties(String filepath) throws FileNotFoundException, IOException
	{
		File f=new File(filepath);
		Properties pr=new Properties();
		pr.load(new FileInputStream(f));
		return pr;
	}
}
