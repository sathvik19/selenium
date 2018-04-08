package SWATHI;

import java.awt.List;
import java.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 ChromeDriver driver= new ChromeDriver();

 
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(9000);
	WebElement sYear=driver.findElementByXPath("//*[@id='month']");
		
		Select s= new Select(sYear);
		
       /* d=s.getOptions();
	System.out.println(d.size());*/
		
		s.selectByIndex(2);
		//s.selectByValue("2016");
		//s.selectByVisibleText("2017");
		
		

	}

}


