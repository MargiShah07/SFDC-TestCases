package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC7 extends ReUsableMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hi");
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC7.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC7");
		
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		Thread.sleep(2000);
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		
		WebElement mysetting = findElement(By.xpath("//a[contains(text(),'My Settings')]"), "My Setting");
		click_On_Button(mysetting, "My Setting");
		
		WebElement personal = findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"), "personal");
		click_On_Button(personal, "Personal");

		WebElement loginhistory = findElement(By.xpath("//a[@id='LoginHistory_font']"), "Login History");
		click_On_Button(loginhistory, "Login History");
		
		WebElement download=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		click_On_Link(download, "Link");
		Thread.sleep(2000);
		WebElement displayandlayout = findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"), "Display And Layout");
		click_On_Button(displayandlayout, "Display And Layout");

		WebElement customizemytab = findElement(By.xpath("//a[@id='CustomizeTabs_font']"), "Customize My tab");
		click_On_Link(customizemytab, "Customize My Tab");
		Boolean found = false;
		java.util.List<WebElement> selectedTabsOptions = driver.findElements(By.xpath("//select[@id='duel_select_1']"));

		for (WebElement e : selectedTabsOptions) 
		{
			if (e.getText().contains("Reports")) 
			{
				found = true;
			}
		}
		if (found) 
		{
			System.out.println("Reports is already added");
		}
		else 
		{
			System.out.println("Reports not added");
			Select availableTabs = new Select(driver.findElement(By.xpath("//select[@id='duel_select_0']")));
			availableTabs.selectByVisibleText("Reports");
			//System.out.println("Custom App is clicked");

			WebElement add = driver.findElement(By.xpath("//img[@title='Add']"));
			click_On_Button(add, "Add");
			//System.out.println("Add button is clicked");
			
			WebElement savedisplaypage = findElement(By.xpath("//input[@title='Save']"), "Save");
			click_On_Button(savedisplaypage, "Save");
			//System.out.println("Validation --> Reports is Added");

		}
//		Select dropdown = new Select (driver.findElement(By.name("p4")));
//		dropdown.selectByVisibleText("Salesforce Chatter");
//
//		Select tabs = new Select(driver.findElement(By.xpath("//select[@id='duel_select_1']")));
//		tabs.selectByVisibleText("Reports");
//		
//		WebElement remover = findElement(By.xpath("//img[contains(@title,'Remove')]"), "Remove");
//		click_On_Button(remover, "Remove");
//		
//		Select report = new Select(driver.findElement(By.xpath("//select[@id='duel_select_0']")));
//		report.deselectByVisibleText("Reports");
//		
//		WebElement add = findElement(By.xpath("//img[@title='Add']"), "Add");
//		click_On_Button(add, "Add");
		
		WebElement savedisplaypage = findElement(By.xpath("//input[@title='Save']"), "Save");
		click_On_Button(savedisplaypage, "Save");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"));
		click_On_Button(Email, "Email");

		WebElement EmailSetting = driver.findElement(By.xpath("//a[@id='EmailSettings_font']"));
		click_On_Button(EmailSetting, "Email Setting");

		WebElement EmailName = findElement(By.xpath("//input[@id='sender_name']"), "Email Name");
		EmailName.clear();
		EnterText(EmailName,"Email Name", "Shah");
		
		WebElement EmailAdd = findElement(By.xpath("//input[@id='sender_email']"), "Email Address");
		EmailAdd.clear();
		EnterText(EmailAdd, "Email Address", "nilay92000@yahoo.com");
		Thread.sleep(2000);
		WebElement bccRadio = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
		bccRadio.click();
//		System.out.println("Bcc Radio btn is selected");
//		List<WebElement> Radio_Bttn = driver.findElements(By.name("auto_bcc"));
//		boolean bvalue;
//		bvalue = Radio_Bttn.get(0).isSelected();
//		if(bvalue==false)
//		{
//			Radio_Bttn.get(0).click();
//		}
		
		WebElement Submit = driver.findElement(By.xpath("//input[@title='Save']"));
		click_On_Button(Submit, "Save");
		
		EndReport();
	}

}
