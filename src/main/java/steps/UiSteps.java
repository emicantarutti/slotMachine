package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiSteps extends Steps {
	static WebDriver driver = new ChromeDriver();

	@BeforeClass
	public static void initialize() {
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void close() {
		driver.close();
	}

	@Given("I open the url $url")
	public void openUrl(String url) {
		driver.manage().window().maximize();
		driver.get("http://" + url);
	}

	@When("I click on the 'Spin' button")
	public void clickingOnTheSpinButton() {
		scrollDown();
		WebElement spinButton = driver.findElement(By.id("spinButton"));
		spinButton.click();
	}

	@When("I change the background")
	public void changingTheBackground() {
		PageObjectModel.changeBackground(driver).click();
	}

	@When("I change the icons")
	public void changingTheIcons() {
		PageObjectModel.changeIcons(driver).click();
	}

	@When("I raise the bet")
	public void raisingTheBet() {
		PageObjectModel.betUp(driver).click();
	}

	@When("I lower down the bet")
	public void loweringDownTheBet() {
		PageObjectModel.betDown(driver).click();
	}

	@When("I click on the FAQ that says: '$question'")
	public void clickingOnTheFirstFAQ(String question) {
		driver.findElement(By.partialLinkText(question)).click();
	}

	@When("I click on the 'Overview' link")
	public void clickingTheOverviewLink() {
		PageObjectModel.overviewLink(driver).click();
	}

	@When("I click on the 'Testimonials' link")
	public void clickingTheTestimonialsLink() {
		PageObjectModel.testimonalsLink(driver).click();
	}
	
	@When("I click on the 'Buy Now' link")
	public void clickingTheBuyNowLink() {
		PageObjectModel.buyNowLink(driver).click();
	}

	@When("I click on the 'Blackjack' link")
	public void clickingTheBlackJackLink() {
		PageObjectModel.blackJackLink(driver).click();
	}

	@When("I click on the 'Wheel Of Fortune' link")
	public void clickingTheWheelOfFortuneLink() {
		PageObjectModel.wheelOfFortuneLink(driver).click();
	}

	@When("I click on the 'Scratch Cards' link")
	public void clickingScratchCardsLink() {
		PageObjectModel.scratchcardsLink(driver).click();
	}

	@Then("I verify that the url: '$expectedUrl' is displayed")
	public void gettingCurrentUrl(String expectedUrl) {
		Assert.assertEquals(driver.getCurrentUrl(), "http://" + expectedUrl + "/");
	}

	@Then("I verify that the text: '$text' is displayed on screen")
	public void verifyingTextPresent(String text) {
		assertText(text);
	}
	
	@Then("I verify that the value of 'Bet' is '$betNumber'")
	public void checkingTheBetNumber(String betnumber){
		Assert.assertEquals(betnumber, PageObjectModel.betNumber(driver).getText());
	}

	@Then("I verify that the value of the highest prize is '$topPriceRate'")
	public void checkingTheFirstPrize(String topPriceRate){
		Assert.assertEquals(topPriceRate, PageObjectModel.firstPrize(driver).getText());
	}
	
	@Then("I verify that the value of the second prize is '$secondPrizeRate'")
	public void checkingTheSecondrize(String secondPrizeRate){
		Assert.assertEquals(secondPrizeRate, PageObjectModel.secondPrize(driver).getText());
	}
	
	private void assertText(String message) {
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains(message));
	}

	private void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250);");
	}

}
