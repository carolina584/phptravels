package net.phptravels.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target lOGIN = Target.the("Clic in the option Login").locatedBy("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	public static final Target ButtonLogin = Target.the("Button Login").locatedBy("(//*[@class='btn btn-action btn-lg btn-block loginbtn'])[1]");
	public static final Target MessageInvalid = Target.the("Capt Message Invalid").locatedBy("//div[@class='alert alert-danger'][contains(text(),'Invalid Email or Password')]");
	public static final Target GoIt = Target.the("Clic Go it").locatedBy("//button[@id='cookyGotItBtn']");
	
	

}
