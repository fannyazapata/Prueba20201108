package GradleCucumber00.stepdefinitions;

import java.util.List;

import GradleCucumber00.model.ChoucairAcademyData;
import GradleCucumber00.questions.Answer;
import GradleCucumber00.task.Login;
import GradleCucumber00.task.OpenUp;
import GradleCucumber00.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
	@Before
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
	}
	

@Given("^than brandon wants to learn automation at the academy Choucair$")
public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<ChoucairAcademyData> choucairAcademyData) {
	OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.
			onThePage(choucairAcademyData.get(0).getUser(),choucairAcademyData.get(0).getPassword())));
}

		
@When("^he search for the course ISTQB on the chocair academy plataform$")
public void heSearchForTheCourseISTQBOnTheChocairAcademyPlataform(List<ChoucairAcademyData> choucairAcademyData) {
	OnStage.theActorInTheSpotlight().attemptsTo(Search.the(choucairAcademyData.get(0).getSearch()));
}

@Then("^the finds the course called$")
public void theFindsTheCourseCalled(List<ChoucairAcademyData> choucairAcademyData) {
	OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(choucairAcademyData.get(0).getSearch())));
}


	
}
