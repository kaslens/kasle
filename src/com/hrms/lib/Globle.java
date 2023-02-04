package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Globle {
	
	public WebDriver driver;
	
	//**********test data******
	
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String EFN = "narsing";
	public String ELN = "kasle";
	
	//******OBJ/ELE*************
	
	public String txt_username = "txtUserName";
	public String txt_password = "txtPassword";
	public String login_btn    = "Submit";
	public String entframe     = "rightMenu";
	public String add_btn      = "//input[@value='Add']";
	public String txt_efn      = "txtEmpFirstName";
	public String txt_eln      = "txtEmpLastName";
	public String save_btn     = "btnEdit";
	public String logout_btn   = "Logout";

}
