package GradleCucumber00.task;


import net.serenitybdd.screenplay.Actor;
import GradleCucumber00.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task{
	private ChoucairAcademyPage chocairAcademyPage;
	public static OpenUp thePage() {
		return Tasks.instrumented(OpenUp.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(chocairAcademyPage));
	
	}



}
