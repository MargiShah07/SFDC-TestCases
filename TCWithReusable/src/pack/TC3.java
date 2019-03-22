package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC3 extends ReUsableMethod 
{

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		//TC1 tc = new TC1();
		InitializeDriver();
		String path="C:\\Users\\Nilay\\ExtentReports\\TC3.html";
		InitializePath(path);
		Launch("https://login.salesforce.com/", "TC3");
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
		EndReport();
	}

}
