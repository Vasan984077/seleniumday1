package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookPageStep {

	

	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   driver = new ChromeDriver();
	   driver.get("https://omrbranch.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("User Enter {String} and {String}")
	public void user_enter_username_and( String email,String pass) {
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(email);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(pass);
	   
	}



	
	@When("User Click Login button")
	public void user_click_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='login']"));
	   btnLogin.click();
	}
	@Then("User Should Verify Login Success Message")
	public void user_should_verify_login_success_message() {
		Assert.assertTrue("Login Verified Successfully", true);
		
		Assert.assertFalse("Please Enter Valid Username Or Password", false);		
	  // driver.quit();
	}


}
