package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTest extends Page
{
	
	@Given("^I went to (.*)")
	public void i_went(String url) 
	{
	    openBrowser("chrome",url);
	}
	@When("^I search for the (.*) for location (.*)")
	public void i_search_for_the_for_location(String product,String location) 
	{
	    driver.findElement(By.name("q")).sendKeys(product+" near "+location);
	}
	@Then("search result must come")
	public void search_result_must_come() 
	{
		Actions a = new Actions(driver);
	    a.sendKeys(Keys.ENTER).perform();
	}




}
