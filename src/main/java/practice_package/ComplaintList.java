package practice_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplaintList 
{
	@FindBy(xpath = "//a[text()='Complaint List']")
	private WebElement ComplaintListLink;
	
	//initialisation
		public ComplaintList(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//utilization
		public WebElement getComplaintListLink() 
		{
			return ComplaintListLink;
		}

		//Business Libraries
		public void complaint() 
		{
			ComplaintListLink.click();
		}	
}
