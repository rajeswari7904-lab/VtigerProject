package com.crm.Vtiger.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class Baseclass {
	public static WebDriver driver;
	FileUtility f=new FileUtility();
	SeleniumUtility sutil=new SeleniumUtility();
	@BeforeSuite
	public void connectToDatabase() {
		Reporter.log("database connected successfully", true);
		
		
		
	}
@BeforeTest
public void launchBrowser(@Optional("chrome") String BROWSER) {
	if(BROWSER.equals("chrome")){
		driver=new ChromeDriver();	
	}else if(BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
	}else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();	
	}else {
		driver=new ChromeDriver();
		}
	sutil.maximizeWindow(driver);
	sutil.implicitWait(driver);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("http://localhost:8888/index.php");
	  Reporter.log("launched browser and nav to vtiger",true);
	
}
@BeforeMethod
public void LoginToVtiger() {
driver.findElement(By.name("user_name")).sendKeys("admin");
    driver.findElement(By.name("user_password")).sendKeys("manager");
    driver.findElement(By.id("submitButton")).click();
    Reporter.log("loggin in to the vtiger",true);
}
@AfterMethod
public void logoutFromvtiger() {
	WebElement address = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions a=new Actions(driver);
	a.moveToElement(address).perform();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	Reporter.log("logged out from Vtiger",true);
}
@AfterTest
public void closeBrowser() {
	driver.quit();
	Reporter.log("browser closed successfully",true);
}
@AfterSuite
public void disconnectWithDatabase() {
	Reporter.log("database disconnected",true);
			
	
	
}


}
