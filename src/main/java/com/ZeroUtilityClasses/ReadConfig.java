package com.ZeroUtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	public ReadConfig() 
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream file = new FileInputStream(src);
			pro= new Properties();
			pro.load(file);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getuname()
	{
		String uname = pro.getProperty("uname");
		return uname;
	}
	
	public String getpass()
	{
		String pass = pro.getProperty("pass");
		return pass;
	}
	
	public String getpinno()
	{
		String pinno = pro.getProperty("pinno");
		return pinno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
