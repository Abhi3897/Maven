package MavenPracticeSession;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Demowebshopshoppingcart extends DemowebshopBaseTest {
	@Test
		public void TC() throws InterruptedException {
		    driver.manage().window().maximize();
	        driver.get("http://demowebshop.tricentis.com/");
	        driver.findElement(By.className("ico-login")).click();
	        
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhisb@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Abhi@3897");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			
	        driver.findElement(By.partialLinkText("BOOKS")).click();
	        Thread.sleep(2000); 
	        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[@class='close']")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
	        String text = driver.findElement(By.xpath("//table/tbody/tr/td[3]/a[.='Computing and Internet']")).getText();//same as isdigit()
	        if(text.contains("Computing")){
	        	System.out.println("Pass: success");
	        }
	        
	        
	}
}

