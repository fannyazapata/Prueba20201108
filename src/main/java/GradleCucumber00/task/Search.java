package GradleCucumber00.task;

import GradleCucumber00.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
	private String search;

	
	public Search(String search) {
		this.search = search;
	}

	public static Search the(String search) {
		return Tasks.instrumented(Search.class, search);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_CC),
				Enter.theValue(search).into(SearchCoursePage.INPUT_COURSE),
				Click.on(SearchCoursePage.BUTTON_GO),
				Click.on(SearchCoursePage.SELECT_COURSE)
		);
	}

}
