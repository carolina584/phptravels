package net.phptravels.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

	public static final Target MYACCOUNT = Target.the("Clic in the option MyAccount").locatedBy("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	public static final Target SignUp = Target.the("Clic in the option Sign Up").locatedBy("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	public static final Target FirstName = Target.the("Clic in FirstName").locatedBy("//input[@placeholder='First Name']");
	public static final Target LastName = Target.the("Clic in LastName").locatedBy("//input[@placeholder='Last Name']");
	public static final Target MobileNumber = Target.the("Clic in MobileNumber").locatedBy("//input[@placeholder='Mobile Number']");
	public static final Target Email = Target.the("Clic in Email").locatedBy("//input[@placeholder='Email']");
	public static final Target Password = Target.the("Clic in Password").locatedBy("//input[@placeholder='Password']");
	public static final Target ConfirmPassword = Target.the("Clic in ConfirmPassword").locatedBy("//input[@placeholder='Confirm Password']");
	public static final Target ButtonSignUp = Target.the("Button Sign Up").locatedBy("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	public static final Target Hi = Target.the("Clic in the option Hi").locatedBy("//h3[@class='RTL']");
	public static final Target Account = Target.the("Clic in the option Account").locatedBy("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'Margarita')]");
	public static final Target SignOut = Target.the("Clic in the option Sign Out").locatedBy("//li[@class='open']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Logout')]");
	
}
