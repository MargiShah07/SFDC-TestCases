package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC5 extends ReUsableMethod
{

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		//TC1 tc = new TC1();
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC5.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC5");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		EndReport();

	}

}
