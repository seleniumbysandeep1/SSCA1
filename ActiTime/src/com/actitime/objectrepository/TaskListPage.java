package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

@FindBy(xpath="//div[.='Add New']")	
	private WebElement AddNewButton;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement NewCustomerMenu;


@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
private WebElement EnterCustomerNametbx;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement CustomerDescriptiontbx;


@FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
private WebElement SelectCustomerDropDown;

@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
private WebElement OurcompanyOption;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement CreateCustomerBtn;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title' and @title]")
private WebElement ActualCustomer;

public WebElement getActualCustomer() {
	return ActualCustomer;
}

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewButton() {
	return AddNewButton;
}

public WebElement getNewCustomerMenu() {
	return NewCustomerMenu;
}

public WebElement getEnterCustomerNametbx() {
	return EnterCustomerNametbx;
}

public WebElement getCustomerDescriptiontbx() {
	return CustomerDescriptiontbx;
}

public WebElement getSelectCustomerDropDown() {
	return SelectCustomerDropDown;
}

public WebElement getOurcompanyOption() {
	return OurcompanyOption;
}

public WebElement getCreateCustomerBtn() {
	return CreateCustomerBtn;
}

}
