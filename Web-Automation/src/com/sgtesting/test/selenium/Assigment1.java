package com.sgtesting.test.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1 {
	public static WebDriver oBrowser=null;
    public static void main(String[] args) {
    	lanuchBrowser();
    	navigate();
    	login();
    	minimizeflyoutwindow();
    	createuser();
    	deleteuser();
    	logout();
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
    private static void login()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void minimizeflyoutwindow()
    {
    	try
    	{
    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createuser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("firstName")).sendKeys("Demo");    		
    		oBrowser.findElement(By.name("lastName")).sendKeys("user");
    		oBrowser.findElement(By.name("email")).sendKeys("demo@gamil.com");
    		oBrowser.findElement(By.name("username")).sendKeys("demouser1");
    		oBrowser.findElement(By.name("password")).sendKeys("welcome123");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
    		Thread.sleep(4000);
    		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
    		Thread.sleep(4000);
    	}catch(Exception e)
    	
    	{
    		e.printStackTrace();
    		}
    	}
    private static void deleteuser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//span[text()='user, Demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    		Thread.sleep(2000);
    		Alert oAlert=oBrowser.switchTo().alert();
    		String content=oAlert.getText();
    		System.out.println(content);   
    		oAlert.accept();
    		}catch(Exception e)
    	{
    			e.printStackTrace();
    	}
    }
    private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
