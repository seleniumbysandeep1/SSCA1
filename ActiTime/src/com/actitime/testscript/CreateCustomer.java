package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.TaskListPage;

@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
	
@Test
public void testCreareCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	String customername = f.getExcelData("CreateCustomer", 1, 0);
	String customerDescription = f.getExcelData("CreateCustomer", 1, 1);
	//click on task tab
	HomePage h=new HomePage(driver);
	h.getTaskTab().click();
	//click on add new button
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewButton().click();
	//click on new create customer menu
	t.getNewCustomerMenu().click();
	//enter the customer name
	t.getEnterCustomerNametbx().sendKeys(customername);
	//enter the customer description
	t.getCustomerDescriptiontbx().sendKeys(customerDescription);
	//click on select customer dropdown
	t.getSelectCustomerDropDown().click();
	//select our company option
	t.getOurcompanyOption().click();
	//click on create customer button
	t.getCreateCustomerBtn().click();
	Thread.sleep(5000);
	String ActualText = t.getActualCustomer().getText();
	Assert.assertEquals(ActualText, customername);
     
	
}
}
