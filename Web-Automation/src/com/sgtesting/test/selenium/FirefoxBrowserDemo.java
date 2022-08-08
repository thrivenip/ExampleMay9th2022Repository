package com.sgtesting.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LanuchBrowser();
		navigate();
		closeApplication();
	}
	private static void LanuchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://opensource-demo.orangehrmlive.com/");
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
