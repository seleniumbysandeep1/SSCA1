package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.LoginPage;

public class BaseClass {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	
public static WebDriver driver;	
public FileLib f=new FileLib();

@BeforeClass
public void openBrowser() {
	Reporter.log("open the browser",true);
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@AfterClass
public void closeBrowser() {
	driver.close();
}
@BeforeMethod
public void login() throws IOException {
	 String url = f.getPropertyData("url");
	 String un = f.getPropertyData("username");
	 String pw = f.getPropertyData("password");
	 driver.get(url);
	 LoginPage l=new LoginPage(driver);
	 l.setLogin(un, pw); 
	
}
@AfterMethod
public void logout() {
	HomePage h=new HomePage(driver);
	h.getLogoutlink().click();
}
}
