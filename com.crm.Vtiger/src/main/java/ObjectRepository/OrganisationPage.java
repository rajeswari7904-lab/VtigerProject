package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy(xpath="//td[text()='Email ']/following-sibling::td/child::input")
	private WebElement emailaddress;
	
	@FindBy(name="rating")
	private WebElement ratingaddress;
	
	@FindBy(name="industry")
	private WebElement industrydrop;
	
	@FindBy(name="accounttype")
	private WebElement typedrop;
	
	@FindBy(name="bill_street")
	private WebElement billingaddress;
	@FindBy(name="ship_street")
	private WebElement shippingaddress;
	@FindBy(name="bill_city")
	private WebElement billingcity;
	@FindBy(name="ship_city")
	private WebElement shippingcity;
	@FindBy(name="bill_state")
	private WebElement billigstate;
	@FindBy(name="ship_state")
	private WebElement shippingstate;
	@FindBy(name="bill_country")
	private WebElement billingcountry;
	@FindBy(name="ship_country")
	private WebElement shippingcountry;
	@FindBy(name="description")
	private WebElement descriptionaddress;
	@FindBy(name="button")
	private WebElement savebtn;
	@FindBy(name="button")
	private WebElement cancelbtn;
	
	
	
	
//Initialization
	public OrganisationPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	public WebElement getPlusicon() {
		return plusicon;
		
		
		
		
	}
	public WebElement getOrgname() {
		return orgname;
	}
	public WebElement getEmailaddress() {
		return emailaddress;
	}
	public WebElement getRatingaddress() {
		return ratingaddress;
	}
	public WebElement getIndustrydrop() {
		return industrydrop;
	}
	public WebElement getTypedrop() {
		return typedrop;
	}
	public WebElement getBillingaddress() {
		return billingaddress;
	}
	public WebElement getShippingaddress() {
		return shippingaddress;
	}
	public WebElement getBillingcity() {
		return billingcity;
	}
	public WebElement getShippingcity() {
		return shippingcity;
	}
	public WebElement getBilligstate() {
		return billigstate;
	}
	public WebElement getShippingstate() {
		return shippingstate;
	}
	public WebElement getBillingcountry() {
		return billingcountry;
	}
	public WebElement getShippingcountry() {
		return shippingcountry;
	}
	public WebElement getdescriptionaddress() {
		return descriptionaddress;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	


}
