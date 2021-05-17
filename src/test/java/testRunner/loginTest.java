package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = {"H:\\JAVA\\cucumbertest1\\Feature\\login.feature"}
		 ,glue={"stepDefinition"},
				 plugin = {"pretty"}
		 )

public class loginTest {

}
