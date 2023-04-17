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
 
 @Test(dataProvider="dp")
 public void Test(String a, String b, String c, String d, String e) 
 {
	 driver.findElement(By.name("Gender")).click();
	 driver.findElement(By.name("FirstName")).sendKeys(a);
	 driver.findElement(By.name("LastName")).sendKeys(b);
	 driver.findElement(By.name("Email")).sendKeys(c);
	 driver.findElement(By.name("Password")).sendKeys(d);
	 driver.findElement(By.name("ConfirmPassword")).sendKeys(e);
	 driver.findElement(By.name("register-button")).click();
	 
 }
public Object[][] dp()
{
Object[][] obj=new Object[1][5] ;
    obj[0][0]="Roshan";
	obj[0][1]="Aware";
	obj[0][2]="Roshan123@gmail.com";
	obj[0][3]="123456";
	obj[0][4]="123456";
	
     return  obj;
}
}
