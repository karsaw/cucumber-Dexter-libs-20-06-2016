package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	WebDriver driver;
	String PRODUCT = "Samsung Galaxy S7";
	@Given("^User is on Flipkart home page$")
	public void user_is_on_Flipkart_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://flipkart.com");
	}

	@When("^user enter product name in search bar$")
	public void user_enter_product_name_in_search_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath(".//*[@class='O8ZS_U']/input")).sendKeys(PRODUCT);
	}

	@When("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath(".//*[@class='vh79eN']")).click();
	}
	@Then("^user is displayed all the products which matches search result$")
	public void user_is_displayed_all_the_products_which_matches_search_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String PAGE_TITLE;
	    PAGE_TITLE = driver.findElement(By.xpath(".//*[@id='pageTitle']/h1")).getText();
	    if(PRODUCT.equalsIgnoreCase(PAGE_TITLE)){
	    	Assert.assertTrue(true);
	    }else{
	    	Assert.assertFalse(true);
	    }
	}

	@Then("^user selects white product\\.$")
	public void user_selects_white_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath(".//*[@id='products']/div[1]/div[1]/div[2]/div")).click();
	}

}
