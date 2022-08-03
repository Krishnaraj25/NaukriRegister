package org.create;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\NaukriRegister\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Krishnaraj");
		WebElement Mail=driver.findElement(By.id("email"));
		Mail.sendKeys("krishnaraj9825@gmail.com");
		WebElement Pass=driver.findElement(By.id("password"));
		Pass.sendKeys("Krishna@25");
		WebElement Mobile=driver.findElement(By.id("mobile"));
		Mobile.sendKeys("9788259534");
		WebElement Exp=driver.findElement(By.xpath("(//h2[@class='main-3'])[1]"));
		Exp.click();
		WebElement Register=driver.findElement(By.xpath("(//button[@type='submit'])"));
		Register.click();
	}
}
