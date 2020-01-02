package net.phptravels.models;

public class RegisterModel {

	private String FirstName;
	private String LastName;
	private String MobileNumber;
	private String Email;
	private String Password;
	private String ConfirmPassword;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	
	public RegisterModel() {
		
	}
/*	public  RegisterModel (String FirstName, String LastName, String MobileNumber, String Email, String Password, String ConfirmPassword) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.MobileNumber=MobileNumber;
		this.Email=Email;
		this.Password=Password;
		this.ConfirmPassword=ConfirmPassword;
	}*/
}
