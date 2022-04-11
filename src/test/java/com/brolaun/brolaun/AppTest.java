package com.brolaun.brolaun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest {
   

   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver;
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.salesforce.com/");
Thread.sleep(5000);
	         System.out.println("Browser is launched");
	         driver.quit();
}
    }

