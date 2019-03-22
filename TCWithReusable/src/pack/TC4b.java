package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC4b extends ReUsableMethod
{

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		//TC1 tc = new TC1();
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC4b.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC4b");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay9200@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshh@09");
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		WebElement ErrorMsg = findElement(By.xpath("//div[@id='error']"), "Error Message");
		System.out.println(ErrorMsg.getText());
		EndReport();
	}

}
