/**
 * 
 */
package SWATHI;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sathvik
 *
 */
public class SampleTestNG {
    ChromeDriver  driver;
	public void Openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	public void Openapp()
	{
		driver.get("https://accounts.google.com/");
	}
	public void login()
	{
		driver.findElementByXPath("//*[@id=\"identifierId\"]").sendKeys("swathireddy18@gmail.com");
		driver.findElementByXPath("//*[@id=\"identifierNext\"]").click();
		System.out.println("done with the next");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.findElementByXPath("//*[@id=\"password\"]").sendKeys("swathiloka");
		driver.findElementByXPath("//*[@id=\"password\"]/div[1]/div/div[1]/input").sendKeys("swathiloka");
//		driver.findElementByClassName("rFrNMe KSczvd BlbNGe zKHdkd sdJrJc Tyc9Jpassword").sendKeys("swathiloka");
		
		driver.findElementByXPath("//*[@id=\"passwordNext\"]").click();
		
	}
	public void displayhomepage()
	{
		System.out.println("home page should be displayed");
		

	}
	public static void main(String[] args) {
		SampleTestNG page=new SampleTestNG();
		page.Openbrowser();
		page.Openapp();
		page.login();
		page.displayhomepage();

	}

}
