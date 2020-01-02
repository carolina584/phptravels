package net.phptravels.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchReservation {

	public static final Target ClicHotel = Target.the("Clic in the option Hotel ").locatedBy("//ul[@class='nav navbar-nav go-right']//li[1]//a[1]");
	public static final Target SearchHotel  = Target.the("hotel").locatedBy("//*[@id='s2id_location']");
    public static final Target City  = Target.the("city").locatedBy("//div[contains(text(),'llin, Colombia')]");
    public static final Target OPCION_IN  = Target.the("hotel").locatedBy("//div[@id='dpd1']");
    public static final Target CHECK_IN = Target.the("in").locatedBy("//div[13]//tr[5]//td[2]");
    public static final Target CHECK_OUT = Target.the("out").locatedBy("//div[14]//tr[6]//td[2]");
    public static final Target SEARCH = Target.the("Search").locatedBy("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']//i[@class='icon_set_1_icon-66']");
    public static final Target HOTEL_SELECT = Target.the("out").locatedBy("//*[@id=\"listing\"]/tbody/tr[1]/td/div[3]/form/button");
    public static final Target HOTEL_RESER = Target.the("out").locatedBy("//div[1]//div[1]//div[1]//div[1]//div[3]//form[1]//button[1]");
}
