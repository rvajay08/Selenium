package test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class objrepos {
	public String get_uname() throws IOException {
		
	
	FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\eclipse-workspace\\Project12\\src\\test\\java\\test\\p1.properties");
	Properties p1=new Properties();
	p1.load(f);
	String x=p1.getProperty("username");
	return x;
	}
	public String get_pword() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\eclipse-workspace\\Project12\\src\\test\\java\\test\\p1.properties");
		Properties p1=new Properties();
		p1.load(f);
		String x=p1.getProperty("password");
		return x;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
