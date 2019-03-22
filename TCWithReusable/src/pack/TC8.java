package pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC8 extends ReUsableMethod
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hi");
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC8.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC8");
		
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
		EndReport();

	}

}
