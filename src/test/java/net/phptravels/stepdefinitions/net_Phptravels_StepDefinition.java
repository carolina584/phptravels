package net.phptravels.stepdefinitions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.phptravels.questions.ValidateMessageError;
import net.phptravels.questions.ValidateRegister;
import net.phptravels.tasks.GoTo;
import net.phptravels.tasks.Login;
import net.phptravels.tasks.MakeReservation;
import net.phptravels.tasks.PaymentsDetails;
import net.phptravels.tasks.Reservation;
import net.phptravels.tasks.openPage;
import net.phptravels.userinterfaces.phpTravelsHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class net_Phptravels_StepDefinition {
	
	private phpTravelsHomePage page;
	@Managed(driver = "chrome")
	public WebDriver driver;
	Actor Valentina = Actor.named("Valentina");
	
	@Before
	public void SetUp() {
		Valentina.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Given("^I want to open phptravel page$")
	public void iWantToOpenPhptravelPage() {
		Valentina.wasAbleTo(openPage.on(page));
	}


	@When("^I want to register me and I enter the username and password\\.$")
	public void iWantToRegisterMeAndIEnterTheUsernameAndPassword() {
	    Valentina.attemptsTo(GoTo.Register());
	}

	@Then("^I validate the entry was successful\\.$")
	public void iValidateTheEntryWasSuccessful() {
		Valentina.should(eventually(seeThat(ValidateRegister.at(), equalTo("Hi, Margarita osorio"))));
	}
	
	@When("^I enter the username and password\\.$")
	public void iEnterTheUsernameAndPassword() {
	 Valentina.attemptsTo(Login.login());
	}


	@Then("^I validate that the entry has not been entering correctly\\.$")
	public void iValidateThatTheEntryHasNotBeenEnteringCorrectly() {
	    Valentina.should(eventually(seeThat(ValidateMessageError.at(), equalTo("Invalid Email or Password"))));
	}
	
	@When("^I search and to reserve hotel$")
	public void iSearchAndToReserveHotel() {
	 Valentina.attemptsTo(GoTo.Register(),Reservation.on(),MakeReservation.in(),PaymentsDetails.on());
	}


	@Then("^I validate the hotel reservation$")
	public void iValidateTheHotelReservation() {
	 
	}
}

