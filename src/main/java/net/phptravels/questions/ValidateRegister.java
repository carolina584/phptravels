package net.phptravels.questions;



import net.phptravels.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateRegister implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(RegisterPage.Hi).viewedBy(actor).asString();
	}
	
	
	public static ValidateRegister at() {
		return new ValidateRegister();
	}
	

}
