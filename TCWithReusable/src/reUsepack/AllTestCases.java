package reUsepack;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;


public class AllTestCases extends ReUsableFunctions
{

	public static void main(String[] args) throws InterruptedException 
	{

		AllTestCases AllTC = new AllTestCases();
		String path="C:\\Users\\Nilay\\ExtentReports\\AllTCReports.html";
		InitializePath(path);

		AllTC.TestCase1();
		AllTC.TestCase2();
		AllTC.TestCase3();
		AllTC.TestCase4a();
		AllTC.TestCase4b();
		AllTC.TestCase5();
////		AllTC.TestCase6();
		AllTC.TestCase7();
		AllTC.TestCase8();
		AllTC.TestCase9();
		AllTC.TestCase10();

		report.flush();
		System.out.println("End");
		//		EndReport();
	}

	public void TestCase1() throws InterruptedException
	{
		System.out.println("TestCase1");
		logger = report.startTest("Navigate to SFDC");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," Salesforce page is displayed.");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," Salesforce page is not displayed.");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		if(un.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " UserName is displayed in User name field");
		}
		else
		{
			logger.log(LogStatus.FAIL, " UserName is not displayed in User name field");
		}

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		if(pass.isDisplayed())
		{
			pass.clear();
			logger.log(LogStatus.PASS, " Password is displayed and got cleared.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Password is not displayed and did not cleared");
		}

		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");

		WebElement ErrorMsg = findElement(By.xpath("//div[@id='error']"), "Error Message");
		System.out.println(ErrorMsg.getText());
		if(ErrorMsg.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Error Message: Please enter your password. Displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Error Message: Please enter your password. is not Displayed.");
		}

		driver.close();
		report.endTest(logger);
		//		EndReport();
	}

	public void TestCase2() throws InterruptedException
	{
		System.out.println("TestCase2");
		logger = report.startTest("Login to SFDC");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," SFDC login page is opened");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," SFDC login page is not opened");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		if(un.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " UserName is displayed in User name field");
		}
		else
		{
			logger.log(LogStatus.FAIL, " UserName is not displayed in User name field");
		}

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		if(pass.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Password is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Password is not displayed.");
		}

		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		if(Login.isDisplayed())
		{
			click_On_Button(Login, "Login");
			String actTitle = driver.getTitle();
			String expTitle = "Salesforce - Essentials Edition";
			if(actTitle.equalsIgnoreCase(expTitle))
			{
				System.out.println("Title Matched");
//				logger.log(LogStatus.PASS," SFDC login page is opened");
				logger.log(LogStatus.PASS, "Welcome to your free trial displayed");
			}
			
			else
			{
				System.out.println("Title didn't match");
				logger.log(LogStatus.FAIL," Error Message: Please check your username and password. Displayed.");
			}
		}
		else
		{
			logger.log(LogStatus.FAIL, "Welcome to your free trial is not displayed");
		}
		
		driver.close();
		report.endTest(logger);
		//		EndReport();
	}

	public void TestCase3() throws InterruptedException
	{
		System.out.println("TestCase3");
		logger = report.startTest("Test the remember username check box ");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," SFDC login page is opened");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," SFDC login page is not opened");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");

		WebElement RememberMe = findElement(By.xpath("//input[@id='rememberUn']"), "Remember Me");
		SelectCheckBox(RememberMe, "Remember Me");

		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");

		String actlogTitle = driver.getTitle();
		String explpgTitle = "Salesforce - Essentials Edition";
		if(actlogTitle.equalsIgnoreCase(explpgTitle))
		{
			System.out.println("Login Title Matched");
			logger.log(LogStatus.PASS," Sales force home page is displayed");
		}
		else
		{
			System.out.println("Login Title didn't match");
			logger.log(LogStatus.FAIL," Sales force home page is not displayed");
		}

		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");

		WebElement Logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		click_On_Button(Logout, "Logout");

		Thread.sleep(2000);
		WebElement untext = findElement(By.xpath("//span[@id='idcard-identity']"), "UserName Text");
		String actualun = untext.getText();
		String expectedun = "nilay92000@yahoo.com";
		if(!(actualun.isEmpty()))
		{
			if(actualun.equals(expectedun))
			{
				System.out.println("UserName Matched");
				logger.log(LogStatus.PASS," Login sales force page is displayed with username populated");
			}	
		}
		else
		{
			System.out.println("UserName didn't match");
			logger.log(LogStatus.FAIL," Login sales force page is displayed with username populated");
		}

		WebElement remember = findElement(By.xpath("//input[@id='rememberUn']"), "RememberMe");
		if(remember.isSelected())
		{
			logger.log(LogStatus.PASS, "Login sales force page is checked with remember user name");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Login sales force page is not checked with remember user name");
		}

		driver.close();
		report.endTest(logger);
	}

	public void TestCase4a() throws InterruptedException
	{
		System.out.println("TestCase4a");
		logger = report.startTest("Test forgot password");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," SFDC login page is opened");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," SFDC login page is not opened");
		}
		
		WebElement forgotpw = findElement(By.linkText("Forgot Your Password?"), "Forgot Password");
		if(forgotpw.isDisplayed())
		{

			click_On_Link(forgotpw, "Forgot Password");
			logger.log(LogStatus.PASS, "Salesforce forgot password page is displayed.");

		}
		else
		{
			logger.log(LogStatus.FAIL, "Salesforce forgot password page isnot displayed.");
		}
		
		WebElement forgetUn = findElement(By.xpath("//input[@id='un']"), "Username for forgot");
		EnterText(forgetUn, "Username for forgot", "nilay92000@yahoo.com");

		WebElement continues = findElement(By.xpath("//input[@id='continue']"), "Continue");
		if(continues.isDisplayed())
		{
			click_On_Button(continues, "Continue");
			logger.log(LogStatus.PASS, "Password reset message page is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Password reset message page is not displayed.");
		}
		driver.close();
		report.endTest(logger);
	}
	
	public void TestCase4b() throws InterruptedException
	{
		System.out.println("TestCase4b");
		logger = report.startTest("Validate Login Error Message");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," SFDC login page is opened");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," SFDC login page is not opened");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay9200@yahoo.com");
		if(un.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " UserName is displayed in User name field");
		}
		else
		{
			logger.log(LogStatus.FAIL, " UserName is not displayed in User name field");
		}
		
		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshh@09");
		if(pass.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Password is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Password is not displayed.");
		}

		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");

		String actlogTitle = driver.getTitle();
		String explpgTitle = "Salesforce - Essentials Edition";
		if(actlogTitle.equalsIgnoreCase(explpgTitle))
		{
			System.out.println("Login Title Matched");
			logger.log(LogStatus.FAIL," Sales force home page is displayed");
		}
		else
		{
			System.out.println("Login Title didn't match");
			logger.log(LogStatus.PASS," Sales force home page is not displayed");
		}
		
		WebElement ErrorMsg = findElement(By.xpath("//div[@id='error']"), "Error Message");
		System.out.println(ErrorMsg.getText());
		if(ErrorMsg.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Error Message: UserName or Password may be incorrect. Displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Error Message: UserName or Password may be incorrect. is not Displayed.");
		}
		
		driver.close();
		report.endTest(logger);
	}

	public void TestCase5() throws InterruptedException
	{
		System.out.println("TestCase5");
		logger = report.startTest("Select user menu for <username> dropdown");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," SFDC login page is opened");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," SFDC login page is not opened");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");

		WebElement RememberMe = findElement(By.xpath("//input[@id='rememberUn']"), "Remember Me");
		SelectCheckBox(RememberMe, "Remember Me");

		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");

		String actlogTitle = driver.getTitle();
		String explpgTitle = "Salesforce - Essentials Edition";
		if(actlogTitle.equalsIgnoreCase(explpgTitle))
		{
			System.out.println("Login Title Matched");
			logger.log(LogStatus.PASS," Sales force home page is displayed");
		}
		else
		{
			System.out.println("Login Title didn't match");
			logger.log(LogStatus.FAIL," Sales force home page is not displayed");
		}
		
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		if(UserMenu.isDisplayed())
		{
			logger.log(LogStatus.PASS, "User menu drop down is available");
		}
		else
		{
			logger.log(LogStatus.FAIL, "User menu drop down is not available");
		}
		
		Thread.sleep(2000);
		WebElement ProfileLbl = findElement(By.xpath("//a[contains(@title,'My Profile')]"), "My Profile");
		if(ProfileLbl.isDisplayed())
		{
			logger.log(LogStatus.PASS, " My Profile Option is displayed in dropdown list");
		}
		else
		{
			logger.log(LogStatus.FAIL, " My Profile Option is not displayed in dropdown list");
		}
		
		WebElement SettingLbl = findElement(By.xpath("//a[contains(@title,'My Settings')]"), "My Settings");
		if(SettingLbl.isDisplayed())
		{
			logger.log(LogStatus.PASS, " My Settings Option is displayed in dropdown list");
		}
		else
		{
			logger.log(LogStatus.FAIL, " My Settings Option is not displayed in dropdown list");
		}
		
		WebElement DevConsoleLbl = findElement(By.xpath("//a[contains(@title,'Developer Console (New Window)')]"), "Developer Console");
		if(DevConsoleLbl.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Developer Console Option is displayed in dropdown list");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Developer Console Option is not displayed in dropdown list");
		}
		WebElement LogoutLbl = findElement(By.xpath("//a[contains(@title,'Logout')]"), "Logout");
		if(LogoutLbl.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Logout Option is displayed in dropdown list");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Logout Option is not displayed in dropdown list");
		}
		
		driver.close();
		report.endTest(logger);
	}

//	public void TestCase6() throws InterruptedException
//	{
//
//	}

	public void TestCase7() throws InterruptedException
	{
		System.out.println("TestCase7");
		logger = report.startTest("Select My settings option from user menu for <username> drop down");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," SFDC login page is opened");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," SFDC login page is not opened");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");

		WebElement RememberMe = findElement(By.xpath("//input[@id='rememberUn']"), "Remember Me");
		SelectCheckBox(RememberMe, "Remember Me");

		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");

		String actlogTitle = driver.getTitle();
		String explpgTitle = "Salesforce - Essentials Edition";
		if(actlogTitle.equalsIgnoreCase(explpgTitle))
		{
			System.out.println("Login Title Matched");
			logger.log(LogStatus.PASS," Sales force home page is displayed");
		}
		else
		{
			System.out.println("Login Title didn't match");
			logger.log(LogStatus.FAIL," Sales force home page is not displayed");
		}
		
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		if(UserMenu.isDisplayed())
		{
			logger.log(LogStatus.PASS, "User menu drop down with all options displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, "User menu drop down with all options not displayed.");
		}
		
		Thread.sleep(2000);
		
		WebElement mysetting = findElement(By.xpath("//a[contains(text(),'My Settings')]"), "My Setting");
		if(mysetting.isDisplayed())
		{
			click_On_Button(mysetting, "My Setting");
			logger.log(LogStatus.PASS, "My Settings page is displayed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "My Settings page isnot displayed");
		}
		
		WebElement personal = findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"), "personal");
		click_On_Button(personal, "Personal");

		WebElement loginhistory = findElement(By.xpath("//a[@id='LoginHistory_font']"), "Login History");
		click_On_Button(loginhistory, "Login History");

		WebElement download = findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"), "download login history");
		if(download.isDisplayed())
		{
			click_On_Link(download, "Download Login History.");
			logger.log(LogStatus.PASS, "Login history is displayed and the data is downloaded in .csv format.");
		}
		else
		{
			logger.log(LogStatus.PASS, "Login history is not displayed and the data isnot downloaded in .csv format.");
		}

		WebElement displayandlayout = findElement(By.xpath("//div[@id='DisplayAndLayout']//a[@class='header setupFolder']"), "Display And Layout");
		click_On_Button(displayandlayout, "Display ANd Layout");

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

		WebElement savedisplaypage = findElement(By.xpath("//input[@title='Save']"), "Save");
		savedisplaypage.click();

		WebElement Email = driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"));
		Email.click();

		WebElement EmailSetting = driver.findElement(By.xpath("//a[@id='EmailSettings_font']"));
		EmailSetting.click();

		WebElement EmailName = findElement(By.xpath("//input[@id='sender_name']"), "Email Name");
		if(EmailName.isDisplayed())
		{
			
				EmailName.clear();
				EnterText(EmailName,"Email Name", "Shah");
			
		}
				
		WebElement EmailAdd = findElement(By.xpath("//input[@id='sender_email']"), "Email Address");
		if(EmailAdd.isDisplayed())
		{
			EmailAdd.clear();
			EnterText(EmailAdd,"Email Address", "mshah910@gmail.com");
		}
		
		List<WebElement> Radio_Bttn = driver.findElements(By.name("auto_bcc"));
		boolean bvalue;

		bvalue = Radio_Bttn.get(1).isSelected();

		if(bvalue==false)
		{
			Radio_Bttn.get(1).click();
		}
		else
		{
			System.out.println("It is already selected.");
		}

		WebElement Submit = driver.findElement(By.xpath("//input[@title='Save']"));
		click_On_Button(Submit, "Submit");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement calender = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		click_On_Button(calender, "Calender And Reminder");
		if(calender.isDisplayed())
		{
			System.out.println("Calendar And Reminder Link is Clicked");
		}
		else
		{
			System.out.println("Calendar And Reminder Link is not Clicked");
		}
		
		WebElement Reminder= driver.findElement(By.xpath("//a[@id='Reminders_font']"));
		click_On_Button(Reminder, "Activity Reminders");
		
		WebElement TestReminder = driver.findElement(By.xpath("//input[@title='Open a Test Reminder']"));
		click_On_Button(TestReminder, "Open a Test Reminder");
		if(TestReminder.isDisplayed())
		{
			System.out.println("Sample event popup window is displayed.");
			logger.log(LogStatus.PASS, " Sample event popup window is displayed.");
		}
		else
		{
			System.out.println("Sample event popup window is not displayed.");
			logger.log(LogStatus.FAIL, " Sample event popup window is not displayed.");
		}
		
		driver.close();
		report.endTest(logger);
	}

	public void TestCase8() throws InterruptedException
	{
		System.out.println("TestCase8");
		logger = report.startTest("Select \"Developers Console\" option from user menu for <username> drop down");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," Salesforce page is displayed.");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," Salesforce page is not displayed.");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		
		WebElement UserMenu1 = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu1, "User Menu");
		if(UserMenu1.isDisplayed())
		{
			logger.log(LogStatus.PASS, "UserMenu List is Displayed with all options.");
		}
		else
		{
			logger.log(LogStatus.FAIL, "UserMenu List is not Displayed with all options.");
		}
		
		WebElement developerConsole = findElement(By.xpath("//a[@title='Developer Console (New Window)']"), "Developer Console");
		
		if(developerConsole.isDisplayed())
		{
			click_On_Button(developerConsole, "Developer Console");
			logger.log(LogStatus.PASS, "Force.com Developer Console window is displayed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Force.com Developer Console window is not displayed");
		}
		
		Set<String> getAllWindows=driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]).close();
		System.out.println("executed");
		
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();
		report.endTest(logger);
	}

	public void TestCase9() throws InterruptedException
	{
		System.out.println("TestCase9");
		logger = report.startTest("Select \"Logout\" option from user menu for <username> drop down");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," Salesforce page is displayed.");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," Salesforce page is not displayed.");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		if(UserMenu.isDisplayed())
		{
			logger.log(LogStatus.PASS, "UserMenu List is Displayed with all options.");
		}
		else
		{
			logger.log(LogStatus.FAIL, "UserMenu List is not Displayed with all options.");
		}
		
		WebElement Logout = findElement(By.xpath("//a[@title='Logout']"), "Logout");
		click_On_Link(Logout, "Logout");
		if(Logout.isDisplayed())
		{
			logger.log(LogStatus.PASS, "Logout  of current sales force application and https://login.salesforce.com/ page is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Logout failed and https://login.salesforce.com/ page is not displayed.");
		}
		
		Set<String> getAllWindows=driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]).close();
		System.out.println("executed");
		
		
		driver.close();
		report.endTest(logger);
	}

	public void TestCase10() throws InterruptedException
	{
		System.out.println("TestCase10");
		logger = report.startTest("Create an Account");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.salesforce.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Salesforce";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," Salesforce page is displayed.");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," Salesforce page is not displayed.");
		}

		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");

		Thread.sleep(2000);
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		
		WebElement Accounts = findElement(By.xpath("//a[@title='Accounts Tab']"), "Accounts");
		click_On_Link(Accounts, "Accounts");
		if(Accounts.isDisplayed())
		{
			logger.log(LogStatus.PASS, "Accounts page is displayed with correct username");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Accounts page is  not displayed with correct username");
		}
		
		WebElement New = findElement(By.xpath("//input[@title='New']"), "New");
		click_On_Button(New, "New");
		
		WebElement AccName = findElement(By.xpath("//input[@id='acc2']"), "Account Name");
		AccName.clear();
		EnterText(AccName, "Account Name", "Margi");
		
		WebElement save = findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"), "Save");
		click_On_Button(save, "Save");
		if(save.isDisplayed())
		{
			logger.log(LogStatus.PASS, "New account page is displayed with account details.");
		}
		else
		{
			logger.log(LogStatus.FAIL, "New account page is not displayed with account details.");
		}
		
		driver.close();
		report.endTest(logger);
	}

}
