package net.phptravels.tasks;

import net.phptravels.userinterfaces.LoginPage;
import net.phptravels.userinterfaces.Reservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

public class MakeReservation implements Task {

	int correo = (int)(Math.random()*99)+1000;
	String correoConvert = ""+ correo;
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(LoginPage.GoIt),
				Click.on(Reservation.BookNow),
				Click.on(Reservation.Title),
				Click.on(Reservation.ChooseTiTle),
				Enter.theValue("Margarita").into(Reservation.FirstName),
				Enter.theValue("Maria").into(Reservation.LastName),
				Enter.theValue(correoConvert+"@gmail.com").into(Reservation.Email),
				Click.on(Reservation.Country),
				Click.on(Reservation.ChooseCountry),
				Enter.theValue("3767213").into(Reservation.Phone)
				);
					
		
	}
	
	public static MakeReservation in() {
		return Tasks.instrumented(MakeReservation.class);
	}

}
