package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues
{
	public static void main(String[] args) throws IOException
	{
		
	
Properties prop=new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\bhang\\eclipse-workspace\\CoreJava\\src\\test\\config.properties");
prop.load(fis);
System.out.println(prop.getProperty("browser"));
System.out.println(prop.getProperty("url"));
FileOutputStream ous=new FileOutputStream("C:\\\\Users\\\\bhang\\\\eclipse-workspace\\\\CoreJava\\\\src\\\\test\\\\config.properties");
prop.setProperty("browser", "safari");
prop.store(ous, null);

	}

}
