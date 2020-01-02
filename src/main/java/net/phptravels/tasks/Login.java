package net.phptravels.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.phptravels.userinterfaces.LoginPage;
import net.phptravels.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(RegisterPage.MYACCOUNT),
				Click.on(LoginPage.lOGIN),
				Enter.theValue("valentina1245@gmail.com").into(RegisterPage.Email),
				Enter.theValue("va123456").into(RegisterPage.Password),
				Click.on(LoginPage.GoIt),
				DoubleClick.on(LoginPage.ButtonLogin));
			
		
	}
	
	public static Login login() {
		return instrumented(Login.class);
	}
 
}
