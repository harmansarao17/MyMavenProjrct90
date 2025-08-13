package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testing1 {
FirefoxDriver driver = new FirefoxDriver();
  
  @BeforeMethod
  public void beforeMethod() {
	 driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=DqAaHDW9nOs&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8iLCJyYXIiOmZhbHNlLCJvYXV0aF9rZXkiOiJEcUFhSERXOW5PcyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczovL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb20vb25saW5lL2xhbmRpbmcvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTc0NjM4NDA5MSwiaWF0IjoxNzQ2MzgyODkxLCJqdGkiOiIwMWZjZTU0YS0zZjcyLTQ2OGYtOGVmNS03NjM0YzI4ZDcwMjYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6Ly9wYXNzcG9ydC5zY290aWFiYW5rLmNvbSJ9.jON1ClpK789FX14XLcNjRmzOGf-ZcGHgUNR_pkXIb3oyboc1h1JLbVuFL2kbpfU0yp0SQCwIKGHcQYt_Qy5nSdeU7aEhA8qufcVFoqedKFGxuYFWE0MScNCi7Eo19EvdZjv6PJZDKxay3SjmX_cYD1rWEObCGloxex9XMREKnQo7LHCuYhm-6z9bFPIeb6KnhaXtwDenDdw9ntAisK4GMIXayMo6grHX29ndlTtTvVwuc1eG4S4jI2grnQUtMG_TqLb3EDTIlLtt-ztKykP0-EZDcqgrRE4dyWwy4Awui7iMxc9J9DZRjRHhNA5iFvy6BMoTHwtAKoI1JI_U1duf1Q&preferred_environment=");
		  
	  System.out.println("before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();

	  System.out.println("AfterMethod");
  }
  @Test
  public void Test1() throws InterruptedException {
		driver.findElement(By.id("usernameInput-input")).sendKeys("sdfsadfsgerh@#$");
		driver.findElement(By.name("password")).sendKeys("sfasgrgershet");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
		
		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.xpath("//div[@class='Errorstyle__ErrorText-canvas-core__sc-swivz4-1 jMfSQW Error__text']/span")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
				
	  System.out.println("Test1");
  }
  @Test
  public void Test2() {
	  System.out.println("Test2");
  }
  @Test
  public void Test3() {
	  System.out.println("Test3");
	  
	  
  }

  
}

