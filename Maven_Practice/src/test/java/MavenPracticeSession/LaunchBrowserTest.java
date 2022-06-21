package MavenPracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
@Test
public void TC() {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.close();
}
}
