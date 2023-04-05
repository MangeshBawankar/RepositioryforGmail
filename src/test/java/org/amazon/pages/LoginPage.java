package org.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	
	@FindBy(xpath="//input[@type='email' ")
	public WebElement emailId;
	
	@FindBy(xpath="//div[@jsname='password']")
	public WebElement gpassword;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement nextbutton;
	
	public void fillUid(String userid)
	{
	    emailId.sendKeys(userid);
	    
	}
	public void fillPassword(String passcode)
	{
	        gpassword.sendKeys("05032022@Saavi");
	}
    public void clikNext()
    {
      nextbutton.click();
    }
}
