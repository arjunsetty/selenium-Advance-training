package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class keyPress {

	@Test
	
	public void keypress() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b7a.03.26\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/");
	WebElement from = driver.findElement(By.id("FromTag"));
	WebElement to = driver.findElement(By.id("ToTag"));
	
	Actions action1 = new Actions(driver); 
	action1.keyDown(from, Keys.SHIFT).perform();
	action1.sendKeys("h").perform();
	//Thread.sleep(2000);
	action1.keyUp(Keys.SHIFT).perform();
	//Thread.sleep(2000);
	action1.sendKeys("yd").perform();
	//action1.
		
	Thread.sleep(2000);
	action1.sendKeys(Keys.ENTER).perform();
	
	
	to.sendKeys("ban");
	
	Thread.sleep(2000);
	
	WebElement ul=driver.findElement(By.id("ui-id-2"));
	List<WebElement> list=ul.findElements(By.tagName("li"));
	Assert.assertEquals(list.size(),10);
	
	for(WebElement e:list)
	{
		String city=e.getText();
		if(city.contains("BKK"))
		{
			e.click();
			break;
		}
	
			
	}
	}
}
	
	

