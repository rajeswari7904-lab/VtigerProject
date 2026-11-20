package com.Vtiger.OrganisationTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Vtiger.GenericLibrary.Baseclass;
import com.crm.Vtiger.GenericLibrary.FileUtility;
import com.crm.Vtiger.GenericLibrary.Listenerimplementation;
import com.crm.Vtiger.GenericLibrary.SeleniumUtility;

import ObjectRepository.HomePage;
import ObjectRepository.OrganisationPage;
@Listeners(Listenerimplementation.class)
public class CreateOrganisation extends Baseclass{
@Test
public  void createOrg() throws EncryptedDocumentException, IOException {
	HomePage hp=new HomePage(driver);
	hp.getOrganisation().click();
	OrganisationPage op=new OrganisationPage(driver);
	op.getPlusicon().click();
	FileUtility f=new FileUtility();
	String name=f.readDataFromExcelString("OrganisationDetails", 1, 1);
	op.getOrgname().sendKeys(name);
	String email = f.readDataFromExcelString("OrganisationDetails", 1, 2);
	op.getEmailaddress().sendKeys(email);
	
	WebElement industrty = op.getIndustrydrop();
	SeleniumUtility s=new SeleniumUtility();
	s.selectOptionFromDropdownByContainsText(industrty, "Education");
	WebElement type = op.getTypedrop();
	s.selectOptionFromDropdownByContainsText(type, "Customer");
	 String billingaddress = f.readDataFromExcelString("OrganisationDetails", 1, 3);
	 String shipaddress = f.readDataFromExcelString("OrganisationDetails", 1, 4);
	 op.getBillingaddress().sendKeys(billingaddress);
	 op.getShippingaddress().sendKeys(shipaddress);
	 
	 String billingcity = f.readDataFromExcelString("OrganisationDetails", 1, 5);
	 String shipcity = f.readDataFromExcelString("OrganisationDetails", 1, 6);
	 op.getBillingcity().sendKeys(billingcity);
	 op.getShippingcity().sendKeys(shipcity);
	 
	 String billingstate = f.readDataFromExcelString("OrganisationDetails", 1, 7);
	 String shipstate= f.readDataFromExcelString("OrganisationDetails", 1, 8);
	 op.getBilligstate().sendKeys(billingstate);
	 op.getShippingstate().sendKeys(shipstate);
	 
	 String billingcountry = f.readDataFromExcelString("OrganisationDetails", 1, 9);
	 String shipcountry= f.readDataFromExcelString("OrganisationDetails", 1, 10);
	 op.getBillingcountry().sendKeys(billingcountry);
	 op.getShippingcountry().sendKeys(shipcountry);
	String desp = f.readDataFromExcelString("OrganisationDetails", 1, 11);
	op.getdescriptionaddress().sendKeys(desp);
	op.getSavebtn().click();	
}

@Test
public  void createOrg1() throws EncryptedDocumentException, IOException {
	HomePage hp=new HomePage(driver);
	hp.getOrganisation().click();
	OrganisationPage op=new OrganisationPage(driver);
	op.getPlusicon().click();
	FileUtility f=new FileUtility();
	String name=f.readDataFromExcelString("OrganisationDetails", 1, 1);
	op.getOrgname().sendKeys(name);
	String email = f.readDataFromExcelString("OrganisationDetails", 1, 2);
	op.getEmailaddress().sendKeys(email);
	
	WebElement industrty = op.getIndustrydrop();
	SeleniumUtility s=new SeleniumUtility();
	s.selectOptionFromDropdownByContainsText(industrty, "Education");
	WebElement type = op.getTypedrop();
	s.selectOptionFromDropdownByContainsText(type, "Customer");
	 String billingaddress = f.readDataFromExcelString("OrganisationDetails", 1, 3);
	 String shipaddress = f.readDataFromExcelString("OrganisationDetails", 1, 4);
	 op.getBillingaddress().sendKeys(billingaddress);
	 op.getShippingaddress().sendKeys(shipaddress);
	 
	 String billingcity = f.readDataFromExcelString("OrganisationDetails", 1, 5);
	 String shipcity = f.readDataFromExcelString("OrganisationDetails", 1, 6);
	 op.getBillingcity().sendKeys(billingcity);
	 op.getShippingcity().sendKeys(shipcity);
	 
	 String billingstate = f.readDataFromExcelString("OrganisationDetails", 1, 7);
	 String shipstate= f.readDataFromExcelString("OrganisationDetails", 1, 8);
	 op.getBilligstate().sendKeys(billingstate);
	 op.getShippingstate().sendKeys(shipstate);
	 
	 String billingcountry = f.readDataFromExcelString("OrganisationDetails", 1, 9);
	 String shipcountry= f.readDataFromExcelString("OrganisationDetails", 1, 10);
	 op.getBillingcountry().sendKeys(billingcountry);
	 op.getShippingcountry().sendKeys(shipcountry);
	String desp = f.readDataFromExcelString("OrganisationDetails", 1, 11);
	op.getdescriptionaddress().sendKeys(desp);
	op.getSavebtn().click();

}
}