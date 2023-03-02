package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import factory.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;

public class LandingPage_SD {

	WebDriver driver;
	LandingPage home = new LandingPage(DriverFactory.getDriver());

	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		driver = DriverFactory.getDriver();

	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		System.out.println(string);
		home.clickOnGetStarted(string);
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {

	}
}
