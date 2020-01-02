package net.phptravels.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Reservation {
	  public static final Target BookNow = Target.the("Booknow").locatedBy("//div[1]//div[1]//div[1]//div[1]//div[3]//form[1]//button[1]");
	  public static final Target Title = Target.the("Title").locatedBy("//select[@id='title']");
	  public static final Target ChooseTiTle = Target.the("Choose Title").locatedBy("//option[contains(text(),'Miss.')]");
	  public static final Target FirstName = Target.the("First Name").located(By.id("first_name"));
	  public static final Target LastName = Target.the("Last Name").located(By.id("last_name"));
	  public static final Target Email = Target.the("Email").located(By.id("email"));
	  public static final Target Country = Target.the("Country").located(By.id("country_code"));
	  public static final Target ChooseCountry = Target.the("Choose Country").locatedBy("//option[contains(text(),'Colombia (+57)')]");
	  public static final Target Phone = Target.the("Phone Number").located(By.id("phone_number"));
}
