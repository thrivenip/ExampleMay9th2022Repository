package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogOut {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		lanuchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createuser();
		//modifyuser();
		deleteuser();
		creatcustmore();
		// modifycustomer();
		deletecustmore();
		 createproject();
		//	logout();
		//	closeApplication();
	}
	private static void lanuchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			oPage.getoLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		try
		{
			oPage.getGettingStartedShortcutsPanelId().click();
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
			oPage.getOCreateuser().click();  
			Thread.sleep(2000);
			oPage.getOadduser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("Demo");
			oPage.getLastName().sendKeys("user");
			oPage.getEmail().sendKeys("demo@gamil.com");
			oPage.getUserDataLightBox_usernameField().sendKeys("demouser1");
			oPage.getPassword().sendKeys("welcome123");
			oPage.getPasswordCopy().sendKeys("welcome123");
			Thread.sleep(2000);
			oPage.getUserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()
	{
		try
		{
			oPage.getModifyuser().click();
			Thread.sleep(2000);
			oPage.getUserDataLightBox_emailField().clear();
			Thread.sleep(2000);
			oPage.getUserDataLightBox_emailField().sendKeys("welcome@123");
			Thread.sleep(2000);
			oPage.getUserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oPage.getDeleteuser().click();
			Thread.sleep(2000);
			oPage.getUserDataLightBox_deleteBtn().click();
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

	private static void creatcustmore()
	{
		try
		{
			oPage.getCreatecustomer().click();
			Thread.sleep(1000);
			oPage.getAddcustomer().click();
			Thread.sleep(1000);
			oPage.getNewcustomer().click();
			Thread.sleep(1000);
			oPage.getCustomerLightBox_nameField().sendKeys("customer1");
			Thread.sleep(1000);
			oPage.getCustomerLightBox_descriptionField().sendKeys("welcome");
			Thread.sleep(1000);
			oPage.getCustomerLightBox_commitBtn().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifycustomer()
	{
		try
		{
			oPage.getModifycustomer().click();
			Thread.sleep(3000);
			oPage.getEditbutton().click();
			Thread.sleep(1000);
			oPage.getDescription().clear();
			oPage.getDescription().sendKeys("customer1");
			Thread.sleep(2000);
			oPage.getEditbutton().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustmore()
	{
		try
		{
			oPage.getModifycustomer().click();
			Thread.sleep(3000);
			oPage.getEditbutton().click();
			Thread.sleep(1000);
			oPage.getAction().click();
			Thread.sleep(1000);
			oPage.getDELECT().click();
			Thread.sleep(1000);
			oPage.getDelectpermently().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createproject()
	{
		try
		{
			oPage.getAddnew().click();
			Thread.sleep(2000);
			oPage.getAddproject().click();
			Thread.sleep(2000);
			oPage.getProjectPopup_projectNameField().sendKeys("project1");
			Thread.sleep(2000);
			oPage.getProjectPopup_projectDescriptionField().sendKeys("selenium Assigment project");
			Thread.sleep(2000);
			oPage.getProjectPopup_commitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	



/*	private static void logout()
	{
		try
		{
			oPage.getOlogout().click();
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
	}*/


}
