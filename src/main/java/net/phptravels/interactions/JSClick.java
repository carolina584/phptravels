package net.phptravels.interactions;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class JSClick implements Interaction{
	private final Target target;
    public JSClick(Target target) {
        this.target = target;
    }

	@Override
	@Step("{0} clicks on #target")
	public <T extends Actor> void performAs(T actor) {
		 WebElement targetElement = target.resolveFor(actor);
	        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].click()", targetElement);
	}
	public static Interaction on(Target target) {
        return Tasks.instrumented(JSClick.class, target);
    }
}
