import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowAlert {

	WebDriver driver;

	@Before
	public void setUp() {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");

		driver.manage().window().maximize();

	}

	@Test
	public void testWindowAlert() throws Exception {

		// enter a valid email address

		driver.findElement(By.id("Email")).sendKeys("enter email id here");

		// click on next button

		driver.findElement(By.id("next")).click();

		// enter a valid password

		driver.findElement(By.id("Passwd")).sendKeys("enter password here");

		// click on sign in button

		driver.findElement(By.id("signIn")).click();

		Thread.sleep(30000);

		// click on compose button

		driver.findElement(
				By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]"))
				.click();

		// click on attach files icon

		driver.findElement(
				By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]"))
				.click();

		// creating instance of Robot class (A java based utility)

		Robot rb = new Robot();

		// pressing keys with the help of keyPress and keyRelease events

		rb.keyPress(KeyEvent.VK_E);

		rb.keyRelease(KeyEvent.VK_E);

		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_SHIFT);

		rb.keyPress(KeyEvent.VK_SEMICOLON);

		rb.keyRelease(KeyEvent.VK_SEMICOLON);

		rb.keyRelease(KeyEvent.VK_SHIFT);

		rb.keyPress(KeyEvent.VK_BACK_SLASH);

		rb.keyRelease(KeyEvent.VK_BACK_SLASH);

		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);

		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

	}

	@After
	public void tearDown()

	{
		driver.quit();
	}

}