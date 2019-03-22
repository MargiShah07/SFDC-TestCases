package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC4 extends ReUsableMethod
{

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		//TC1 tc = new TC1();
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC4.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC4");
		WebElement forgotpw = findElement(By.linkText("Forgot Your Password?"), "Forgot Password");
		click_On_Link(forgotpw, "Forgot Password");
		WebElement forgetUn = findElement(By.xpath("//input[@id='un']"), "Username for forgot");
		EnterText(forgetUn, "Username for forgot", "nilay92000@yahoo.com");
		WebElement continues = findElement(By.xpath("//input[@id='continue']"), "Continue");
		click_On_Button(continues, "Continue");
		EndReport();
	}

}
