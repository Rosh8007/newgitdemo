package Letspush;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Abc {
	
	 WebDriver driver;	
 @BeforeSuite
 public void browser() 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/register");
	 driver.manage().window().maximize();
	 
 }
 
 @Test
 public void Test() 
 {
	 driver.findElement(By.name("Gender")).click();
	 driver.findElement(By.name("FirstName")).sendKeys("Roshan");
	 driver.findElement(By.name("LastName")).sendKeys("Aware");
	 driver.findElement(By.name("Email")).sendKeys("Roshan123@gmail.com");
	 driver.findElement(By.name("Password")).sendKeys("123456");
	 driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
	 driver.findElement(By.name("register-button")).click();
	 
 }

}
