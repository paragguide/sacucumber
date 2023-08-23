package testcases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPwdTest // extends AmazonUidTest not allowed
{
public boolean x = true;

	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(AmazonUidTest.flag == true)
	    {
	    	x = true;
	    }
	    else
	    {
	    	x = false;
	    }
	}
	@When("I enter invalid password")
	public void i_enter_invalid_password() 
	{
	    if(x == true)
	    {
	    	AmazonUidTest.pwd.sendKeys("dddd");
	    	AmazonUidTest.btn2.click();
	    }
	}
	@Then("error must come")
	public void error_must_come() 
	{
		try {
	    String msf = AmazonUidTest.err2.getText();
		}
		catch(Exception e)
		{
			System.err.println("test fail error msg not come");
		}
	    
	}
}
