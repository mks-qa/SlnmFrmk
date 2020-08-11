package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC2 extends Base {
	
	@Test
	public void test() throws InterruptedException
	{
				//WebElement signin=driver.findElement(By.xpath("//*[@id=\"guide-icon\"]"));
				WebElement signin=driver.findElement(By.linkText("SIGN IN"));
				signin.click();
				System.out.println("code executed");
				Thread.sleep(3000);
				WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("tester.automation27@gmail.com");
				WebElement next= driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
				next.click();
				Thread.sleep(3000);
				WebElement pwd= driver.findElement(By.xpath("//input[@type='password']"));
				pwd.sendKeys("Test@1234");
				
				WebElement next2= driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
				next2.click();
				Thread.sleep(8000);
				
				WebElement trending=driver.findElement(By.linkText("History"));				
				trending.click();
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//yt-img-shadow[@class='style-scope ytd-topbar-menu-button-renderer no-transition']//img[@id='img']")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign out')]")).click();
				Thread.sleep(5000);
				
				
	}			

}
