package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class test1 {

	@Test
	public void testHDFC() throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_b7a.03.26\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions actions = new Actions(driver);
		
		actions.
		moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).
		moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']")))
		.click().perform();

		String title = driver.getTitle();
		Assert.assertTrue(title.startsWith("Demat Account"));
		
	}

}
