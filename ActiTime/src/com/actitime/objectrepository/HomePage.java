package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

@FindBy(id="logoutLink")
private WebElement logoutlink;

@FindBy(id="container_tasks")
private WebElement TaskTab;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLogoutlink() {
	return logoutlink;
}

public WebElement getTaskTab() {
	return TaskTab;
}
	
	
}
