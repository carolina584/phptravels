package net.phptravels.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class openPage implements Task {

private PageObject page;
	
	public openPage(PageObject page) {
		this.page=page;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
	}
	
	public static openPage on(PageObject page) {
		return Tasks.instrumented(openPage.class, page);
	}

}
