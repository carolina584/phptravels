package net.phptravels.questions;


import net.phptravels.userinterfaces.LoginPage;
import net.phptravels.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessageError implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(LoginPage.MessageInvalid).viewedBy(actor).asString();
	}

	public static ValidateMessageError at() {
		return new ValidateMessageError();
	}
}
