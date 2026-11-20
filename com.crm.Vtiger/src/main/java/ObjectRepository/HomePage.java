package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="themes/softed/images/user.PNG")
	private WebElement profileelement;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement singoutlink;
	
	@FindBy(xpath="//a[text()='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	private WebElement Leads;
	
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement Organisation;
	
	//initialization
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	
	
		
	
	public WebElement getProfileelement() {
		return profileelement;
		
	}
	public WebElement getSignoutlink() {
		return singoutlink;
	}
	
	    
	public WebElement getSingoutlink() {
		return singoutlink;
	}





	public WebElement getCalendar() {
		return calendar;
	}





	public WebElement getLeads() {
		return Leads;
	}





	public WebElement getOrganisation() {
		return Organisation;
	}





	//Business logic 
	public void logout(WebDriver driver) {
		HomePage hp=new HomePage(driver);
		WebElement element=hp.getProfileelement();
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		hp.getSignoutlink().click();
	}
	
}
