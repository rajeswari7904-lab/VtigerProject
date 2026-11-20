package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(name="user_name")
	private WebElement usertbx;
	@FindBy(name="user_password")
	private WebElement pwtbx;
	@FindBy(name="submitButton")
	private WebElement lbbtn;
	//initialization
	//public LoginPage(WebDriver driver){
	//PageFactory.initElements(driver,this);
	
	//}
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//utilization
public WebElement getUsertbx() {
	return usertbx;
	
}
public WebElement getpwtbx() {
	return pwtbx;
	
}
public WebElement getlbbtn() {
	return lbbtn;
}
//business logic
public void LoginToVtiger(WebDriver driver,String un,String pw) {
	LoginPage lp=new LoginPage(driver);
	lp.getUsertbx().sendKeys(un);
	lp.getpwtbx().sendKeys(pw);
	lp.getlbbtn().click();
}



}
