package TestNGTCReUseFun;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class allTestCases extends ReUseMethod
{
	@Test(priority=1)
	public void Navigate_to_SFDC_TC1()
	{
		System.out.println("Welcome to TestCase1");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		pass.clear();
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		WebElement ErrorMsg = findElement(By.xpath("//div[@id='error']"), "Error Message");
		System.out.println(ErrorMsg.getText());
		driver.close();
	}
	
	@Test(priority=2)
	public void Login_to_SFDC_TC2() throws InterruptedException
	{
		System.out.println("Welcome To TestCase2");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		Thread.sleep(2000);
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		driver.close();
	}
	
	@Test(priority=3)
	public void Test_remember_checkbo_TC3()
	{
		System.out.println("Welcome To TestCase3");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		WebElement RememberMe = findElement(By.xpath("//input[@id='rememberUn']"), "Remember Me");
		SelectCheckBox(RememberMe, "Remember Me");
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		UserMenu.click();
		WebElement Logout = findElement(By.xpath("//a[@title='Logout']"),"Logout");
		click_On_Button(Logout, "Logout");
		driver.close();
	}
	
	@Test(priority=4)
	public void Test_Forgot_Password_4a()
	{
		System.out.println("Welcome To TestCase4a");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement forgotpw = findElement(By.linkText("Forgot Your Password?"), "Forgot Password");
		click_On_Link(forgotpw, "Forgot Password");
		WebElement forgetUn = findElement(By.xpath("//input[@id='un']"), "Username for forgot");
		EnterText(forgetUn, "Username for forgot", "nilay92000@yahoo.com");
		WebElement continues = findElement(By.xpath("//input[@id='continue']"), "Continue");
		click_On_Button(continues, "Continue");
		driver.close();
	}
	
	@Test(priority=5)
	public void Validate_Login_Error_Message_4b()
	{
		System.out.println("Welcome To TestCase4b");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay9200@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshh@09");
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		WebElement ErrorMsg = findElement(By.xpath("//div[@id='error']"), "Error Message");
		System.out.println(ErrorMsg.getText());
		driver.close();
	}
	
	@Test(priority=6)
	public void Select_UserName_Dropdown_5()
	{
		System.out.println("Welcome To TestCase5");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		driver.close();
	}
	
//	@Test(priority=7)
//	public void Select_UserName_Dropdown_6()
//	{
//		System.out.println("Welcome To TestCase6");
//		InitializeDriver();
//		Launch("https://login.salesforce.com/");
//		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
//		EnterText(un,"User Name", "nilay92000@yahoo.com");
//		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
//		EnterText(pass,"Password", "mnshah@09");
//		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
//		click_On_Button(Login, "Login");
//		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
//		click_On_Button(UserMenu, "User Menu");
//		driver.close();
//	}
	
	@Test(priority=7)
	public void Select_MySetting_Dropdown_7() throws InterruptedException
	{
		System.out.println("Welcome To TestCase7");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
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

			WebElement add = driver.findElement(By.xpath("//img[@title='Add']"));
			click_On_Button(add, "Add");
			
			WebElement savedisplaypage = findElement(By.xpath("//input[@title='Save']"), "Save");
			click_On_Button(savedisplaypage, "Save");
		}
		
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
		
		WebElement Submit = driver.findElement(By.xpath("//input[@title='Save']"));
		click_On_Button(Submit, "Save");
		driver.close();
	}
	
	@Test(priority=8)
	public void Developers_Console_UserName_Dropdown_8() throws InterruptedException
	{
		System.out.println("Welcome To TestCase8");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		Thread.sleep(2000);
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		
		WebElement developerConsole = findElement(By.xpath("//a[@title='Developer Console (New Window)']"), "Developer Console");
		click_On_Button(developerConsole, "Developer Console");
		
		Set<String> getAllWindows=driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]).close();
		System.out.println("executed");
		//driver.close();
		driver.quit();
		
	}
	
	@Test(priority=9)
	public void Logout_UserName_Dropdown_9() throws InterruptedException
	{
		System.out.println("Welcome To TestCase9");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		Thread.sleep(2000);
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		
		Thread.sleep(2000);
		WebElement Logout = findElement(By.xpath("//a[@title='Logout']"), "Logout");
		click_On_Button(Logout, "Logout");
		driver.close();
	}
	
	@Test(priority=10)
	public void Create_an_Account_10() throws InterruptedException
	{
		System.out.println("Welcome To TestCase10");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		Thread.sleep(2000);
		
		WebElement Accounts = findElement(By.xpath("//a[@title='Accounts Tab']"), "Accounts");
		click_On_Link(Accounts, "Accounts");
		
		WebElement New = findElement(By.xpath("//input[@title='New']"), "New");
		click_On_Button(New, "New");
		
		WebElement AccName = findElement(By.xpath("//input[@id='acc2']"), "Account Name");
		AccName.clear();
		EnterText(AccName, "Account Name", "Margi");
		
		WebElement save = findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"), "Save");
		click_On_Button(save, "Save");
		driver.close();
	}
}
