package simpleWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownList {
	
	WebDriver driver;
	
	@Test
	public void dropDownTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Subhash\\Downloads\\selenium\\New folder\\chromedriver_win32\\chromedriver_win32_2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement wbele=driver.findElement(By.name("birthday_month"));
		
		Select sel=new Select(wbele);
		List<WebElement> list=sel.getOptions();
//		String str=list.get(3).getText();
//		Assert.assertEquals(str, "Makr");
		for(WebElement wb:list)
		{
			
			Assert.assertEquals(list.get(3).getText(), "Mar");
			
		}
		
		
		
		
		//System.out.println(str);
	
		//System.out.println(z);
		//sel.selectByIndex(3);
		
	}
	

}
