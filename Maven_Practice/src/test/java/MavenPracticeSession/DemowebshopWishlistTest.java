package MavenPracticeSession;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemowebshopWishlistTest extends DemowebshopBaseTest{
	
		@Test
		public void login() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/");
			
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("game18061999@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Manoj@2580");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			
			driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'Blue and green Sneaker')])[1]")).click();
			driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();
			driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click();
			String wishlist = driver.findElement(By.className("share-label")).getText();
			if(wishlist.contains("Your wishlist URL for sharing")){
				System.out.println("pass");
			}
			
		}
	}

