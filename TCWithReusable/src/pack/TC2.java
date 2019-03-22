package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC2 extends ReUsableMethod
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hi");
		//TC1 tc = new TC1();
		InitializeDriver();
		String path="C:\\Users\\Nilay\\ExtentReports\\TC2.html";
		InitializePath(path);
		Launch("https://login.salesforce.com/", "TC2");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		Thread.sleep(2000);
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		EndReport();
	}

}
