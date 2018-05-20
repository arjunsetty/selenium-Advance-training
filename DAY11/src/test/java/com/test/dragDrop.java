package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dragDrop {

	
	@Test
	
	public void testDragDrop() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b7a.03.26\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
		WebElement to=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(from, to).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.textToBe(By.id("ctl00_ContentPlaceholder1_Label1"),"The price of 'Weekend Package' is : $3999"));
		

		String text=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
	
		System.out.println("The Price: "+text);
		Assert.assertTrue(text.contains("$"));
		
	}
}
