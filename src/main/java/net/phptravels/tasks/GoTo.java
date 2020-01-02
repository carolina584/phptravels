package net.phptravels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.io.IOException;
import net.phptravels.interactions.File;
import net.phptravels.models.RegisterModel;
import net.phptravels.userinterfaces.RegisterPage;
import net.phptravels.utils.ReadExcelFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class GoTo implements Task{


	//RegisterModel dataProject= ReadExcelFile.getListDataRegister().get(0);
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			//actor.attemptsTo(File.onFile());
			//System.out.println("paso");

		//System.out.println("paso"+File.onFile());
		
		//System.out.println("paso"+ dataProject.getFirstName());
			int correo = (int)(Math.random()*99)+1000;
			String correoConvert = ""+ correo; 
			
		actor.attemptsTo(
				Click.on(RegisterPage.MYACCOUNT),
				Click.on(RegisterPage.SignUp),
				Enter.theValue("Margarita").into(RegisterPage.FirstName),
				Enter.theValue("osorio").into(RegisterPage.LastName),
				Enter.theValue("37627652").into(RegisterPage.MobileNumber),
				Enter.theValue(correoConvert +"@gmail.com").into(RegisterPage.Email),
				Enter.theValue("1234567").into(RegisterPage.Password),
				Enter.theValue("1234567").into(RegisterPage.ConfirmPassword),
				Click.on(RegisterPage.ButtonSignUp),
				Click.on(RegisterPage.Hi));
		} catch (Exception e) {
			System.out.println("fallo");
		}
				
	}
	public static GoTo Register() {
		return instrumented(GoTo.class);
	}

}
