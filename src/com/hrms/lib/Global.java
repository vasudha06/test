package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//Testdata 
	public String url = "https://opensource-demo.orangehrmlive.com/";
	public String username = "Admin";
	public String password = "admin123";
	
	//objects
	public String txt_loginname = "txtUsername";
	public String txt_password = "txtPassword";
	public String btn_login    = "Submit";
	
	
	
	public String btn_welcome = "welcome";
	public By btn_logout = By.xpath("//a[text() = 'Logout']");
}