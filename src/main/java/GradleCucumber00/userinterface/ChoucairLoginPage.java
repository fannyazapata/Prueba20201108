package GradleCucumber00.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject  {
	public static final Target LOGIN_BUTTON=Target.the("button that show us the form to login")
			.located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a/strong"));
	public static final Target INPUT_USER=Target.the("where do we write the user")
			.located(By.id("username"));
	public static final Target INPUT_PASSWORD=Target.the("where do we write the password")
			.located(By.id("password"));
	public static final Target ENTER_BUTTON=Target.the("button to confirm login")
			.located(By.xpath("//Button[contains(@class,'btn btn-primary')]"));

}
