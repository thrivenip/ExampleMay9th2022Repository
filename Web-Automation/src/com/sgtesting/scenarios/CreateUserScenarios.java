package com.sgtesting.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateUserScenarios {
	public static WebDriver oBrowser=null;
	public static SoftAssert obj=null;
		@Test(priority=1)
		 static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation1\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=2)
		static void navigate()
		{
			String expected,actual;
			try
			{
				expected="actiTIME - Login";
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(5000);
				actual=oBrowser.getTitle();
				obj.assertEquals(expected, actual);
			obj.assertAll();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=3)
		private static void login()
		{
			try
			{
				String expected="Enter Time-Track";
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(4000);
				WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
				obj.assertEquals(expected,oEle.getText());
				obj.assertTrue(oEle.isDisplayed());
				obj.assertNotNull(oEle);
				System.out.println("all the assertion steps have passed!!!!!!");
				obj.assertAll();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=4)
		private static void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("demo");
				oBrowser.findElement(By.name("lastName")).sendKeys("User1");
				oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=5)
		private static void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=6)
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
		@Test(priority=7)
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
