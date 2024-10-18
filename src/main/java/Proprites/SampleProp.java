package Proprites;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProp  {
	@Test
	public void propp() throws Exception{
		/*
		 * Properties properties=new Properties(); properties.load(new
		 * FileInputStream("./Lang.properties")); String value=
		 * properties.getProperty("Language"); System.out.println(value);
		 */
		
		Properties properties=new Properties();
		properties.load(new FileInputStream("./Lang.properties"));
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
		driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
		
		
		
		driver.findElement(By.name("email")).sendKeys(properties.getProperty("email"));
		
		
		driver.findElement(By.name("password1")).sendKeys(properties.getProperty("pasword"),Keys.ENTER);
		
		
		
		
		
		
		
	}

}
