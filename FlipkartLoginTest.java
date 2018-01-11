package com.prakash.automation.businessScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.prakash.automation.Base.ActionEngine;
import com.prakash.automation.Utilities.ExceptionHandle;
import com.prakash.automation.Utilities.PojoUtilities;
import com.prakash.automation.Utilities.RetryFailedTestCase;
import com.relevantcodes.extentreports.LogStatus;

public class FlipkartLoginTest extends ActionEngine {
	
	@Test(retryAnalyzer=RetryFailedTestCase.class)
	public static void login() throws IOException, ExceptionHandle
	{
		try {
			getWebDriver().get(PojoUtilities.getConfigPropertiesReusablesObject().getProperty("Url"));
		} catch (Exception e) {
			e.toString();
		}
		et.log(LogStatus.INFO, "Url is entered && Opened");
		System.out.println("Url is entered");
		int a=0,b=0;
		if(a==b){
			sendKeys("cssSelector", PojoUtilities.getObjRepoPropertiesReusableObject().getProperty("userName_css"), PojoUtilities.getConfigPropertiesReusablesObject().getProperty("userName"));
		}
		else
		{
			throw new ExceptionHandle("No such element");
		}
		et.log(LogStatus.INFO, "UserName is entered");
		System.out.println("UserName is entered");
		
		if(a==b){
			sendKeys("cssSelector", PojoUtilities.getObjRepoPropertiesReusableObject().getProperty("pwd_css"), PojoUtilities.getConfigPropertiesReusablesObject().getProperty("pass"));
		}
		else{
			throw new ExceptionHandle("No such Element");
		}
		et.log(LogStatus.INFO, "Password is entered");
		System.out.println("Password is entered");
		//click("cssSelector", PojoUtilities.getObjRepoPropertiesReusableObject().getProperty("login_css"));
		try {
			moveToElement(getWebDriver().findElement(By.cssSelector(PojoUtilities.getObjRepoPropertiesReusableObject().getProperty("login_css"))));
		} catch (Exception e) {
			et.log(LogStatus.INFO, e.toString());
		}
		et.log(LogStatus.INFO, "Moved to login button");
		System.out.println("Moved to login button");
		moveToElement(getWebDriver().findElement(By.cssSelector(PojoUtilities.getObjRepoPropertiesReusableObject().getProperty("login_css"))));
	}

}
