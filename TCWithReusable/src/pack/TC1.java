package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC1 extends ReUsableMethod
{
	public static void main(String[] args)
	{
		System.out.println("Hi");
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC1.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC1");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		pass.clear();
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		WebElement ErrorMsg = findElement(By.xpath("//div[@id='error']"), "Error Message");
		System.out.println(ErrorMsg.getText());
		EndReport();
	}

}
