package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		//clearing the text in from textbox,entering value of Mumbai in that textbox and click tab button.
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Mumbai",Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MAS",Keys.TAB);
		
		//checking whether checkbox is checked using isselected option.
		//if checkbox is checked clicxk that checkbox so that we can deselect that checkbox.
		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		if(selected) {
			driver.findElementById("chkSelectDateOnly").click();
		}
		
		//Printing names alone by gng to eachrow and get 2nd cell alone for eachrow
		System.out.println("Trains between Mumbai and chennai are : ");
		List<WebElement> trainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]");
		for (WebElement eachTrain : trainNames) {
			System.out.println(eachTrain.getText());
		}
		
		//printing header of the trains table
		//finding xpath of all cells inthe trains header table and storing it in list and displaying that list
		List<WebElement> headercells = driver.findElementsByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr//td");
		for (int k=0;k<9;k++) {
			System.out.print(headercells.get(k).getText().trim()+"\t\t");
		}
		System.out.println("\n");
		
		//Printing all rows and columns in the table.
		//First we find rows xpath of the table.
		//then loop forloop fpr each row
		//then find xpath of each cell of first row,second row so on by
		//navigating to each row and find elements by tag name in that particular row
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int rowSize = rows.size();
		for (int i=0;i<rowSize;i++) {
			WebElement eachRow = rows.get(i);
			List<WebElement> cells = eachRow.findElements(By.tagName("td"));
			//int cellSize = cells.size();
			
			for (int j = 0; j <9 /*cellSize*/; j++) {
				System.out.print(cells.get(j).getText().trim()+"\t\t");
			}
			System.out.println("\n");
		}
		
		Thread.sleep(5000);
		driver.quit();

	}

}
