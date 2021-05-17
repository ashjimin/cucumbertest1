package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver = null; 
	 @Given("^User is on Home Page$")
	 public void user_is_on_Home_Page() throws Throwable {
		 System.out.println("user is on home");
	 }
	 
	 @When("^User Navigate to LogIn Page$")
	 public void user_Navigate_to_LogIn_Page() throws Throwable {
		 System.out.println("go to login page");
	 }
	 
	 @When("^User enters UserName and Password$")
	 public void user_enters_UserName_and_Password() throws Throwable {
		 System.out.println("Enter username & password");
	
	 }
	 
	 @Then("^Message displayed Login Successfully$")
	 public void message_displayed_Login_Successfully() throws Throwable {
	 System.out.println("Login Successfully");
	 }
	 
	
}
