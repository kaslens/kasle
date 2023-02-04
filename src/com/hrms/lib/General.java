package com.hrms.lib;

import org.testng.Reporter;
import com.hrms.utility.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class General extends Globle{
	
	public void openApplication() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nit82\\Desktop\\c\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("openapp");
		Log.info("applicationo");
	}
	public void login() {
		
		driver.findElement(By.name(txt_username)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(login_btn)).click();
		System.out.println("login");
		Log.info("login");
	}
	public void enterFrame() {
		
		driver.switchTo().frame(entframe);
		System.out.println("frame");
		Log.info("entframe");
	}
	public void addEmployee() {
		
		driver.findElement(By.xpath(add_btn)).click();
		driver.findElement(By.name(txt_efn )).sendKeys(EFN);
		driver.findElement(By.name(txt_eln)).sendKeys(ELN);
		driver.findElement(By.id(save_btn)).click();
		System.out.println("addeml");
		Log.info("add");
	}
	public void exitFrame() {
		
		driver.switchTo().defaultContent();
		System.out.println("exitf");
		Log.info("exit");
	}
	public void logout() {
		
		driver.findElement(By.linkText(logout_btn)).click();
		System.out.println("logout");
		Log.info("logout");
	}
	public void close() {
		
		driver.close();
		System.out.println("appclose");
		Log.info("close");
	}
	

}
