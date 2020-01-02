package net.phptravels.tasks;

import net.phptravels.interactions.EnterValue;
import net.phptravels.userinterfaces.SearchReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Reservation implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				    Click.on(SearchReservation.ClicHotel),
	                EnterValue.on(SearchReservation.SearchHotel),
	                Click.on(SearchReservation.City),
	                Click.on(SearchReservation.OPCION_IN),
	                Click.on(SearchReservation.CHECK_IN),
	                Click.on(SearchReservation.CHECK_OUT),
	                Click.on(SearchReservation.SEARCH),
	                Click.on(SearchReservation.HOTEL_SELECT));
		
	}
	
	public static Reservation on() {
	  return Tasks.instrumented(Reservation.class);
	}

}
