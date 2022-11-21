package practice_package;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendSMS 
{
	@FindBy(xpath = "//a[text()='Send SMS']")
	private WebElement SendSmsLink;
	
	@FindBy(xpath="//table[@class='table table-bordered']/tbody/tr[13]/th/input[1]")
	private WebElement SmsCheckBox;
	
	@FindBy(name = "message")
	private WebElement MessageText;
	
	@FindBy(name = "sms_alert")
	private WebElement SubmitBtn;
	
	//initialisation
	public SendSMS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSendSmsLink() {
		return SendSmsLink;
	}

	public WebElement getSmsCheckBox() {
		return SmsCheckBox;
	}

	public WebElement getMessageText() {
		return MessageText;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	//Business Libraries
	public void smsLink() 
	{
		SendSmsLink.click();
	}	
	
	public void smsText() 
	{
		SmsCheckBox.click();
//		MessageText.sendKeys(message);
	}	
	
	public void SMS(Map<String, String> map,WebDriver driver) 
	{
		for(Entry<String, String> set:map.entrySet()) 
		{
		
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
	}
	
	public void ClickonSmsSubmit()
	{
		SubmitBtn.click();
	}
}

