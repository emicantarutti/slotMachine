package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
	private static WebElement element = null;

	public static WebElement betUp(WebDriver driver) {
		element = driver.findElement(By.id("betSpinUp"));
		return element;
	}

	public static WebElement betDown(WebDriver driver) {
		element = driver.findElement(By.id("betSpinDown"));
		return element;
	}

	public static WebElement betNumber(WebDriver driver) {
		element = driver.findElement(By.id("bet"));
		return element;
	}
	
	public static WebElement firstPrize(WebDriver driver) {
		element = driver.findElement(By.id("trPrize_32"));
		return element;
	}
	
	public static WebElement secondPrize(WebDriver driver) {
		element = driver.findElement(By.id("trPrize_33"));
		return element;
	}
	
	public static WebElement overviewLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='#overview']"));
		return element;
	}
	
	public static WebElement testimonalsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='#testimonials']"));
		return element;
	}
	
	public static WebElement buyNowLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='#buy_now']"));
		return element;
	}
	
	public static WebElement blackJackLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='blackjack']"));
		return element;
	}
	
	public static WebElement scratchcardsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='scratchcards']"));
		return element;
	}
	
	public static WebElement wheelOfFortuneLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='wheel_of_fortune']"));
		return element;
	}

	public static WebElement changeBackground(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class = 'btnChangeBackground']"));
		return element;
	}

	public static WebElement changeIcons(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class = 'btnChangeReels']"));
		return element;
	}
	
	public static WebElement changeMachine(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class = 'btnChangeMachine']"));
		return element;
	}
	

}
