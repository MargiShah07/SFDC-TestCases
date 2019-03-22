package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC6 extends ReUsableMethod
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hi");
		InitializeDriver();
		String Path="C:\\Users\\Nilay\\ExtentReports\\TC6.html";
		InitializePath(Path);
		Launch("https://login.salesforce.com/", "TC6");
		WebElement un = findElement(By.xpath("//input[@id='username']"), "User Name");
		EnterText(un,"User Name", "nilay92000@yahoo.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		EnterText(pass,"Password", "mnshah@09");
		WebElement Login = findElement(By.xpath("//input[@id='Login']"),"Login");
		click_On_Button(Login, "Login");
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		click_On_Button(UserMenu, "User Menu");
		WebElement myprofile = findElement(By.xpath("//a[contains(@title,'My Profile')]"), "My Profile");
		click_On_Button(myprofile, "My Profile");
		Thread.sleep(4000);
		WebElement Edit = findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"), "Edit Contacts");
		click_On_Button(Edit, "Edit Contacts");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		driver.switchTo().frame(iframe);
		WebElement about=driver.findElement(By.id("aboutTab"));
		about.click();
		WebElement lastName=driver.findElement(By.xpath(".//*[@id='lastName']"));
		lastName.clear();
		EnterText(lastName, "Last Name", "Sha");
		WebElement saveAll=driver.findElement(By.xpath(".//*[@id='TabPanel']/div/div[2]/form/div/input[1]"));
		click_On_Button(saveAll, "SaveAll");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		//		driver.switchTo().frame("contactInfoContentId");
		WebElement post=driver.findElement(By.xpath(".//*[@id='publisherAttachTextPost']/span[1]"));
		click_On_Link(post, "Post");
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		//System.out.println("Switched to frame"+ frame);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement messagebox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
		messagebox.click();
		//System.out.println("Msg box clicked");
		Thread.sleep(2000);
		WebElement messagebox1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
		//System.out.println("Sending msg to post");
		EnterText(messagebox1, "Message Box", "Latest Post function testing");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement shareButtton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='publishersharebutton']")));
		click_On_Button(shareButtton, "Share");
		Thread.sleep(2000);
		WebElement file=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='publisherAttachContentPost']/span[1]")));
		click_On_Link(file, "File");
		Thread.sleep(1000);
		WebElement upload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chatterUploadFileAction']")));
		click_On_Link(upload, "Upload");
		WebElement choosefile=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='chatterFile']")));
		click_On_Button(choosefile, "Choose File");
		WebElement browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chatterFile']")));
		browse.sendKeys("C:\\Users\\Nilay\\Desktop\\PayRoll1\\img\\accounting.png");
		WebElement share=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='publishersharebutton']")));
		click_On_Button(share, "Share");
		Thread.sleep(2000);
		Actions mousehoover=new Actions(driver);
		mousehoover.moveToElement(driver.findElement(By.xpath("//*[text()='Moderator']"))).perform();;
		WebElement addPhoto=driver.findElement(By.xpath(".//*[@id='uploadLink']"));
		addPhoto.click();
		Thread.sleep(5000);
		WebElement photoframe=driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(photoframe);
		WebElement browsePhoto=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadInputFile']")));
		browsePhoto.sendKeys("C:\\Users\\Nilay\\Desktop\\\\PayRoll1\\img\\accounting.png");
		WebElement savePhoto=driver.findElement(By.id("j_id0:j_id7:save"));
		click_On_Button(savePhoto, "Save Photo");
//		Actions action=new Actions(driver); 
//		action.dragAndDropBy(driver.findElement(By.xpath(".//*[@id='j_id0:outer']/div[1]/div/div/div/div[6]")), 100, 20);
//		driver.findElement(By.xpath(".//*[@id='j_id0:j_id7:save']")).click(); 
//		driver.switchTo().defaultContent();
		EndReport();
	}

}
