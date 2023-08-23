package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUidTest extends Page
{
	@FindBy(xpath=xpath.AllProjectXpath.signin)
	WebElement signin;
	
	@FindBy(xpath = xpath.AllProjectXpath.uid)
	WebElement uid;
	
	@FindBy(xpath = xpath.AllProjectXpath.btn1)
	WebElement btn1;
	
	@FindBy(xpath = xpath.AllProjectXpath.err1)
	WebElement err1;
	
	@FindBy(xpath = xpath.AllProjectXpath.pwd)
	public static WebElement pwd;
	
	@FindBy(xpath = xpath.AllProjectXpath.btn2)
	public static WebElement btn2;
	
	@FindBy(xpath = xpath.AllProjectXpath.err2)
	public static WebElement err2;
	
	public static boolean flag = true;
	
	@Given("Browser {string} is open with url {string}")
	public void browser_is_open_with_url(String browser, String url) 
	{
	    openBrowser(browser,url);
	}
	@Given("i click signin")
	public void i_click_signin() 
	{
	    signin.click();
	}
	@When("I enter userid {string}")
	public void i_enter_userid(String userid) 
	{
	    uid.sendKeys(userid);
	}
	@When("click continue")
	public void click_continue() 
	{
	    btn1.click();
	}
	@Then("password txtbox must come")
	public void password_txtbox_must_come() 
	{
		try {
	   String msg =  err1.getText();
	    flag = false;
	    System.out.println(msg);
		}
		catch(Exception e)
		{
			System.out.println("user id is valid");
			if(pwd != null)
			{
				System.out.println("password txtbox has come");
			}
		}
	}

}
