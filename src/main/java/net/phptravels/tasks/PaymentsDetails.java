package net.phptravels.tasks;

import net.phptravels.userinterfaces.LoginPage;
import net.phptravels.userinterfaces.PaymentsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PaymentsDetails  implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("Margarita").into(PaymentsPage.NameOrCard),
				Enter.theValue("3726476275").into(PaymentsPage.CardNumber),
				Click.on(PaymentsPage.Month),
				Click.on(PaymentsPage.ChooseMonth),
				Click.on(PaymentsPage.Year),
				Click.on(PaymentsPage.ChooseYear),
				Enter.theValue("124").into(PaymentsPage.SecurityCode),
				Click.on(LoginPage.GoIt),
				Click.on(PaymentsPage.ButtonCompleteBooking)
				);
		
	}
	
	public static PaymentsDetails on() {
		return Tasks.instrumented(PaymentsDetails.class);
	}

}
