package projectFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class upsProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ups.com/lasso/login");
		driver.manage().window().maximize();
		
		//Sign Up Button Click
		WebElement signUpButton=driver.findElement(By.xpath("//*[@id=\"DOARegisterLink\"]"));
		signUpButton.click();
		
		//Sign Up Page Confirmation
		WebElement signUpPage=driver.findElement(By.xpath("//span[contains(text(),'Sign up.')]"));
		String pageText= signUpPage.getText();
		System.out.println(pageText);
		
		
		//Menubar Option "Shipping" click
		WebElement shippingMenu=driver.findElement(By.xpath("//*[@id=\"ups-menuLinks1\"]"));
		shippingMenu.click();
		
		//Shipping List option "Create A Shipment"
		WebElement shipmentOption=driver.findElement(By.cssSelector("#ups-menuPanel1 > div > div:nth-child(1) > ul > li:nth-child(1) > a"));
		shipmentOption.click();
		
		//Confirmation of Shpment Page
		WebElement shipmentPage=driver.findElement(By.xpath("//span[contains(text(),'Create a Shipment')]"));
		String createAShipment=shipmentPage.getText();
		System.out.println(createAShipment);
		
		
		//Select Country from Dropdown
		Select countryTerritory=new Select(driver.findElement(By.xpath("//select[@id='origin-cac_country']")));
		countryTerritory.selectByIndex(2);
		
		
		//Fill Out Name field
		WebElement fnameLname=driver.findElement(By.xpath("//*[@id='origin-cac_companyOrName']"));
		fnameLname.sendKeys("Multajim Mahir");
		
		//Fillout Contact name
		WebElement contactName=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div/main/div[10]/app/ng-component/div/div/div/div/ng-component/section/origin/agent-wrapper/section/div[2]/cac-agent/cac/cac-form/div/div[1]/div[2]/shared-field/div/div/input"));
		contactName.sendKeys("Fatima Rubyat");
		
		
		//Select Address from list
		WebElement address=driver.findElement(By.xpath("//*[@id=\"origin-cac_singleLineAddress\"]"));
		address.sendKeys("Woodhaven");
		
		//Enter Zip Code
		WebElement zipCode=driver.findElement(By.xpath("//input[@id='origin-cac_postalCode']"));
		zipCode.sendKeys("11421");
		
		//Fill Out City
		WebElement city=driver.findElement(By.xpath("//input[@id='origin-cac_city']"));
		city.sendKeys("Queens");
		
		//Select State
		Select state=new Select  (driver.findElement(By.xpath("//*[@id=\"origin-cac_state\"]")));
		state.selectByVisibleText("NewYork");
		System.out.println("Fatima updated the file ");
		
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
