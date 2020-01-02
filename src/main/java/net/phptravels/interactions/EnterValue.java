package net.phptravels.interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class EnterValue implements Interaction{
	
	
	private final Target target;
	 public EnterValue(Target target) {
	        this.target = target;
	    }

	 

	    public static EnterValue on(Target target) {
	        return Tasks.instrumented(EnterValue.class, target);
	    }

	 

	    
	    @Step("{0} double-clicks on #target")
	    public <T extends Actor> void performAs(T actor) {
	        
	        WebElement element = target.resolveFor(actor);
	        as(actor).sendKeys(element, "Mede").perform();    
	        
	    }

	 

	    private Actions as(Actor actor) {
	        return new Actions(BrowseTheWeb.as(actor).getDriver());
	    }



		
}
