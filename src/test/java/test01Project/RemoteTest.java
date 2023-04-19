package test01Project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteTest {

	@Test
	public void googleTest() throws MalformedURLException{


		ChromeOptions opt = new ChromeOptions();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444/"),opt);
		driver.get("https://it.microtechlimited.com/");	
			String s = driver.findElement(By.xpath("//div//h1['Welcome to MicroTech NA.']")).getText();
			//assertEquals("Welcome to MicroTech NA.", s);
		System.out.println("welcom text: "+ s);
		click(By.xpath("//a[@href=\"elogin.php\"]"));
		
		
		driver.quit();
		

	}
}
