package org.testing.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC5 extends Base{
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"guide-icon\"]"));
				signin.click();
				System.out.println("code executed");
				driver.get("https://accounts.google.com/signin/v2/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
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
				
				WebElement video= driver.findElement(By.id("video-title"));
				video.click();
				Thread.sleep(8000);
						
				WebElement subscribe=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-subscribe-button-renderer']"));
				subscribe.click();
				Thread.sleep(6000);

}
}

