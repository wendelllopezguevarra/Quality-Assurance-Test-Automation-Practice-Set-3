package GroupIdMaven.ArtigfactIdMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act1StandaloneJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement nav_automobileButtonElement = driver.findElement(By.id("nav_automobile"));
		nav_automobileButtonElement.click();

		Select makeSelect = new Select(driver.findElement(By.id("make")));
		makeSelect.selectByVisibleText("Volvo");

		WebElement engineperformanceTexWebElement = driver.findElement(By.id("engineperformance"));
		engineperformanceTexWebElement.sendKeys("123");

		WebElement dateofmanufacturewWebElement = driver.findElement(By.id("dateofmanufacture"));
		dateofmanufacturewWebElement.sendKeys("12/02/2023");

		Select numberofseatsSelect = new Select(driver.findElement(By.id("numberofseats")));
		numberofseatsSelect.selectByVisibleText("1");

		Select fuelSelect = new Select(driver.findElement(By.id("fuel")));
		fuelSelect.selectByVisibleText("Petrol");

		WebElement listpriceWebElement = driver.findElement(By.id("listprice"));
		listpriceWebElement.sendKeys("1231");

		WebElement licenseplatenumberWebElement = driver.findElement(By.id("licenseplatenumber"));
		licenseplatenumberWebElement.sendKeys("1231");

		WebElement annualmileageeWebElement = driver.findElement(By.id("annualmileage"));
		annualmileageeWebElement.sendKeys("12314");

		WebElement nextenterinsurantdataButtonElement = driver.findElement(By.id("nextenterinsurantdata"));
		nextenterinsurantdataButtonElement.click();

		/////

		WebElement firstnameWebElement = driver.findElement(By.id("firstname"));
		firstnameWebElement.sendKeys("weqwe");

		WebElement lastnameWebElement = driver.findElement(By.id("lastname"));
		lastnameWebElement.sendKeys("qweqw");

		WebElement birthdateWebElement = driver.findElement(By.id("birthdate"));
		birthdateWebElement.sendKeys("12/02/1996");

		WebElement gendermaleWebElement = driver
				.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
		gendermaleWebElement.click();

		WebElement streetaddressWebElement = driver.findElement(By.id("streetaddress"));
		streetaddressWebElement.sendKeys("qweqw");

		Select countrySelect = new Select(driver.findElement(By.id("country")));
		countrySelect.selectByVisibleText("Afghanistan");

		WebElement zipcodeWebElement = driver.findElement(By.id("zipcode"));
		zipcodeWebElement.sendKeys("1311");

		WebElement cityWebElement = driver.findElement(By.id("city"));
		cityWebElement.sendKeys("asdas");

		Select occupationSelect = new Select(driver.findElement(By.id("occupation")));
		occupationSelect.selectByVisibleText("Employee");

		WebElement speedingWebElement = driver
				.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
		speedingWebElement.click();

		WebElement websiteWebElement = driver.findElement(By.id("website"));
		websiteWebElement.sendKeys("wendell.com");

		WebElement nextenterproductdataWebElement = driver.findElement(By.id("nextenterproductdata"));
		nextenterproductdataWebElement.click();

		///
		WebElement startdateWebElement = driver.findElement(By.id("startdate"));
		startdateWebElement.sendKeys("12/08/2027");

		Select insurancesumSelect = new Select(driver.findElement(By.id("insurancesum")));
		insurancesumSelect.selectByVisibleText("3.000.000,00");

		Select meritratingSelect = new Select(driver.findElement(By.id("meritrating")));
		meritratingSelect.selectByVisibleText("Bonus 1");

		Select damageinsuranceSelect = new Select(driver.findElement(By.id("damageinsurance")));
		damageinsuranceSelect.selectByVisibleText("No Coverage");

		WebElement euroProtectionWebElement = driver
				.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"));
		euroProtectionWebElement.click();

		Select courtesycarSelect = new Select(driver.findElement(By.id("courtesycar")));
		courtesycarSelect.selectByVisibleText("No");

		WebElement nextselectpriceoptionWebElement = driver.findElement(By.id("nextselectpriceoption"));
		nextselectpriceoptionWebElement.click();

		///

		WebElement selectsilverWebElement = driver
				.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span"));
		selectsilverWebElement.click();

		WebElement nextsendquoteWebElement = driver.findElement(By.id("nextsendquote"));
		nextsendquoteWebElement.click();

		////

		WebElement emailWebElement = driver.findElement(By.id("email"));
		emailWebElement.sendKeys("wendell@we.com");

		WebElement phoneWebElement = driver.findElement(By.id("phone"));
		phoneWebElement.sendKeys("12312312");

		WebElement usernameWebElement = driver.findElement(By.id("username"));
		usernameWebElement.sendKeys("Wendell21");

		WebElement passwordWebElement = driver.findElement(By.id("password"));
		passwordWebElement.sendKeys("Wendell21");

		WebElement confirmpasswordWebElement = driver.findElement(By.id("confirmpassword"));
		confirmpasswordWebElement.sendKeys("Wendell21");

		WebElement commentsWebElement = driver.findElement(By.id("Comments"));
		commentsWebElement.sendKeys("Wendell21");

		WebElement sendemailButtoElement = driver.findElement(By.id("sendemail"));
		sendemailButtoElement.click();

		///

		WebElement succesWebElement = driver.findElement(By.xpath("/html/body/div[4]/h2"));
		String successString = succesWebElement.getText();

		if (successString.equalsIgnoreCase("Sending e-mail success!")) {
			WebElement confirmButtonWebElement = driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));
			confirmButtonWebElement.click();
			System.out.println(successString);
		}

		////
		WebElement nav_truckButtonWebElement = driver.findElement(By.id("nav_truck"));
		nav_truckButtonWebElement.click();

		driver.quit();

	}

}
