package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com");
		driver.findElementByXPath("//h5[text()='Window']").click();
		String ParentWindow = driver.getWindowHandle();
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		/*
		 * for (String currentWindow : windowHandles) { if(currentWindow!=ParentWindow)
		 * { driver.switchTo().window(currentWindow); } }
		 */
		List<String> windowHandlesList=new ArrayList<>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		driver.manage().window().maximize();
		
Thread.sleep(2000);
driver.close();

driver.switchTo().window(ParentWindow);
Thread.sleep(2000);
driver.close();
	}

}
