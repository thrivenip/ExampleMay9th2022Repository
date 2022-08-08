package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//webElement for login page Username text field
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}

	//webElement for login page password text field
	private WebElement pwd;
	public WebElement getPwd() {
		return pwd;
	}

	//webElement for login page login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getoLogin() {
		return oLogin;
	}

	
	//webElement for home page flyout window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}
	//webElement for creatuser 
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement OCreateuser;
	public WebElement getOCreateuser() {
		return OCreateuser;
	}
	

	
	//webElement for home page logout
	@FindBy(linkText="logout")
	private WebElement ologout;
	public WebElement getOlogout() {
		return ologout;
	}
	//webElement for Adduser
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement Oadduser;
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	private WebElement lastName;
	private WebElement email;
	private WebElement userDataLightBox_usernameField;
	private WebElement password;
	private WebElement passwordCopy;
	private WebElement userDataLightBox_commitBtn;
	public WebElement getOadduser() {
		return Oadduser;
	}
	public void setOadduser(WebElement oadduser) {
		Oadduser = oadduser;
	}
	//modify user
	@FindBy(xpath="//span[text()='user, Demo']")
	private WebElement modifyuser;
	private WebElement userDataLightBox_emailField;
	//delete user
	@FindBy(xpath="//span[text()='user, Demo']")
	private WebElement deleteuser;
	private WebElement userDataLightBox_deleteBtn;
	private WebElement userDataLightBox_cancelBtn;
	//create customer
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
	private WebElement createcustomer;
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addcustomer;
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newcustomer;
	private WebElement customerLightBox_nameField;
	//modifycustomer
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
	public WebElement modifycustomer;
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	public WebElement Editbutton;
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	public WebElement Description;
	
	
	
	//delectcustomer
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	public WebElement action;
	@FindBy(xpath="//div[text()='Delete']")
	public WebElement DELECT;
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
	public WebElement delectpermently;
	
	
	//create project
	@FindBy(xpath="//a[@class='content selected tasks']")
	public WebElement task;
	@FindBy(xpath="//div[text()='Add New']")
	public WebElement addnew;
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	public WebElement addproject;
	public WebElement projectPopup_projectNameField;
	public WebElement projectPopup_projectDescriptionField;
	
	
	public WebElement getTask() {
		return task;
	}
	public WebElement getAddnew() {
		return addnew;
	}
	public WebElement getAddproject() {
		return addproject;
	}
	public WebElement getProjectPopup_projectNameField() {
		return projectPopup_projectNameField;
	}
	public WebElement getProjectPopup_projectDescriptionField() {
		return projectPopup_projectDescriptionField;
	}
	public WebElement getProjectPopup_commitBtn() {
		return getProjectPopup_commitBtn();
	}
	public void setCreatecustomer(WebElement createcustomer) {
		this.createcustomer = createcustomer;
	}
	public void setAddcustomer(WebElement addcustomer) {
		this.addcustomer = addcustomer;
	}
	public void setNewcustomer(WebElement newcustomer) {
		this.newcustomer = newcustomer;
	}
	public void setCustomerLightBox_nameField(WebElement customerLightBox_nameField) {
		this.customerLightBox_nameField = customerLightBox_nameField;
	}
	public void setModifycustomer(WebElement modifycustomer) {
		this.modifycustomer = modifycustomer;
	}
	public void setCustomerLightBox_descriptionField(WebElement customerLightBox_descriptionField) {
		this.customerLightBox_descriptionField = customerLightBox_descriptionField;
	}
	public void setCustomerLightBox_commitBtn(WebElement customerLightBox_commitBtn) {
		this.customerLightBox_commitBtn = customerLightBox_commitBtn;
	}
	public WebElement getAction() {
		return action;
	}
	public void setAction(WebElement action) {
		this.action = action;
	}
	public WebElement getDELECT() {
		return DELECT;
	}
	public void setDELECT(WebElement dELECT) {
		DELECT = dELECT;
	}
	public WebElement getDelectpermently() {
		return delectpermently;
	}
	public void setDelectpermently(WebElement delectpermently) {
		this.delectpermently = delectpermently;
	}
	public WebElement getModifycustomer() {
		return modifycustomer;
	}
	 
	public WebElement getEditbutton() {
		return Editbutton;
	}
	public void setEditbutton(WebElement editbutton) {
		Editbutton = editbutton;
	}
	public WebElement getDescription() {
		return Description;
	}
	public void setDescription(WebElement description) {
		Description = description;
	}
	public WebElement getCreatecustomer() {
		return createcustomer;
	}
	public WebElement getAddcustomer() {
		return addcustomer;
	}
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	public WebElement getCustomerLightBox_nameField() {
		return customerLightBox_nameField;
	}
	public WebElement getCustomerLightBox_descriptionField() {
		return customerLightBox_descriptionField;
	}
	public WebElement getCustomerLightBox_commitBtn() {
		return customerLightBox_commitBtn;
	}
	private WebElement customerLightBox_descriptionField;
	private WebElement customerLightBox_commitBtn;
	
	

	public WebElement getDeleteuser() {
		return deleteuser;
	}
	public void setDeleteuser(WebElement deleteuser) {
		this.deleteuser = deleteuser;
	}
	public WebElement getUserDataLightBox_deleteBtn() {
		return userDataLightBox_deleteBtn;
	}
	public void setUserDataLightBox_deleteBtn(WebElement userDataLightBox_deleteBtn) {
		this.userDataLightBox_deleteBtn = userDataLightBox_deleteBtn;
	}
	public WebElement getUserDataLightBox_cancelBtn() {
		return userDataLightBox_cancelBtn;
	}
	public void setUserDataLightBox_cancelBtn(WebElement userDataLightBox_cancelBtn) {
		this.userDataLightBox_cancelBtn = userDataLightBox_cancelBtn;
	}
	public WebElement getModifyuser() {
		return modifyuser;
	}
	public void setModifyuser(WebElement modifyuser) {
		this.modifyuser = modifyuser;
	}
	public WebElement getUserDataLightBox_emailField() {
		return userDataLightBox_emailField;
	}
	public void setUserDataLightBox_emailField(WebElement userDataLightBox_emailField) {
		this.userDataLightBox_emailField = userDataLightBox_emailField;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getUserDataLightBox_usernameField() {
		return userDataLightBox_usernameField;
	}
	public void setUserDataLightBox_usernameField(WebElement userDataLightBox_usernameField) {
		this.userDataLightBox_usernameField = userDataLightBox_usernameField;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getPasswordCopy() {
		return passwordCopy;
	}
	public void setPasswordCopy(WebElement passwordCopy) {
		this.passwordCopy = passwordCopy;
	}
	public WebElement getUserDataLightBox_commitBtn() {
		return userDataLightBox_commitBtn;
	}
	public void setUserDataLightBox_commitBtn(WebElement userDataLightBox_commitBtn) {
		this.userDataLightBox_commitBtn = userDataLightBox_commitBtn;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}
	public void setoLogin(WebElement oLogin) {
		this.oLogin = oLogin;
	}
	public void setGettingStartedShortcutsPanelId(WebElement gettingStartedShortcutsPanelId) {
		this.gettingStartedShortcutsPanelId = gettingStartedShortcutsPanelId;
	}
	public void setOCreateuser(WebElement oCreateuser) {
		OCreateuser = oCreateuser;
	}
	public void setOlogout(WebElement ologout) {
		this.ologout = ologout;
	}
}
