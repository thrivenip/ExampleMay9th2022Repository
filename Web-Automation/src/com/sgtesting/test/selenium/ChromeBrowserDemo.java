package com.sgtesting.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
public static void main(String[] args) {
		lanuchBrowser();
		navigate();
		closeApplication();
	}
private static void lanuchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
private static void navigate()
{
	try
	{
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
private static void closeApplication()
{
	try
	{
		oBrowser.get(null);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
