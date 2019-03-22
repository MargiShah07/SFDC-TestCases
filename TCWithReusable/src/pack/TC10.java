package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Enter;

public class TC10 extends ReUsableMethod
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hi");
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC10.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC10");
		
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
		
		EndReport();
	}

}
