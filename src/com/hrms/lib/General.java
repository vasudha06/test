package com.hrms.lib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.log;

import org.openqa.selenium.By;

public class General extends Global {
	
	//Re-usable Fun:
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Selenium_Vasudhivika\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened"); //javaconsole
		Reporter.log("Application opened");//html report
		log.info("Application opened");
		}
public void closeApplication() {
	driver.close();
	System.out.println("Application Closed");
	Reporter.log("Application closed");
	log.info("Application closed");
}
public void login() throws Exception {
	Thread.sleep(1000);
	driver.findElement(By.name(txt_loginname)).sendKeys(username);
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login Succesfully");
	log.info("Login Succesfully");
	
}


	public void logout() throws Exception {
		driver.findElement(By.id(btn_welcome)).click();
	Thread.sleep(500);
		driver.findElement(btn_logout).click();
		System.out.println("Logout Succesfully");
		log.info("Logout Succesfully");
			}
	
	public void addemp() {
		System.out.println("added Succesfully");
		}
	public void delemp() {
		System.out.println("deleted Succesfully");
		}
}
