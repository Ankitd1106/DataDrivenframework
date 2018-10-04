package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Auto_constant;
import generic.Excel;

public class Mivi2 implements Auto_constant
{
	static 
	{
		System.setProperty(key,value);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		String us= Excel.abc(excelpath, "Sheet1", 0, 0);
		String pwd=Excel.abc(excelpath, "Sheet1", 1, 1);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mivi.in/login");
		driver.findElement(By.id("spree_user_email")).sendKeys(us);
		Thread.sleep(1000);
		driver.findElement(By.id("spree_user_password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
