package com.qavipul.VipulTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
  @Test
  public void LMSTesting() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcp\\eclipse-workspace\\VipulTest\\File\\chromedriver.exe");
	  
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(5000);
	  driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  
	 // System.setProperties("webdriver.chrome.driver", "");
	  
	  Thread.sleep(3000);
	  
	  driver.quit();
  }
  
}
