package net.phptravels.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentsPage {
	 public static final Target NameOrCard = Target.the("Name Or Card").located(By.id("cardHolderName"));
	  public static final Target CardNumber = Target.the("Card Number").located(By.id("cardNumber"));
	  public static final Target Month = Target.the("Month").located(By.id("month"));
	  public static final Target ChooseMonth = Target.the("Choose Month").locatedBy("//select[@id='month']//option[contains(text(),'07')]");
	  public static final Target Year = Target.the("Year").locatedBy("//select[@name='year']");
	  public static final Target ChooseYear = Target.the("Choose Year").locatedBy("//option[contains(text(),'2019')]");
	  public static final Target SecurityCode = Target.the("Security Code").locatedBy("//input[@id='cardCVC']");
	  public static final Target ButtonCompleteBooking = Target.the("Button Complete Booking").locatedBy("//button[@id='completeBooking']");

}
