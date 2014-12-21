package com.kayode.selenium.practice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



/**
 * Unit test for simple App.
 */
public class JibeApplyHomePageTests 
    
{
@Test
    public void searchByJobName()
    {
	
	  // Create a new instance of a driver
    WebDriver driver = new FirefoxDriver();

    // Navigate to the right place
    driver.get("http://publicstorage.jibeapply.com/jobs?page=1");

    // Create a new instance of the search page class
    // and initialize any WebElement fields in it.
    JibeApplyHomePage page = PageFactory.initElements(driver, JibeApplyHomePage.class);
    
    page.pageNext();
    assertTrue( true );
    driver.quit();
   //o  driver.close();

       
    }
}
