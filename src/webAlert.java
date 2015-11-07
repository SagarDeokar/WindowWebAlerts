import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webAlert {

	WebDriver driver;
	String baseDirectory = System.getProperty("user.dir");

	public webAlert() {
	}

	@Before
	public void setUp() {

		driver = new FirefoxDriver();

		driver.get(baseDirectory + "\\resources\\Sample_Webpage.html");
		driver.manage().window().maximize();

	}

	@Test
	public void testWebAlert() throws InterruptedException {

		// clicking on try it button

		driver.findElement(
				By.xpath("//*[@id='selectTable']/tbody/tr[2]/td/button"))
				.click();

		Thread.sleep(5000);

		// accepting javascript alert

		Alert alert = driver.switchTo().alert();

		alert.accept();

		// clicking on try it button

		driver.findElement(By.xpath("//button[contains(text(),'Try it')]"))
				.click();

		Thread.sleep(5000);

		// accepting javascript alert

		driver.switchTo().alert().dismiss();

		// clicking on try it button

		driver.findElement(By.xpath("//button[contains(text(),'Try it')]"))
				.click();

		Thread.sleep(5000);

		// accepting javascript alert

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
