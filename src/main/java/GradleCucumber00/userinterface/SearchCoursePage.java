package GradleCucumber00.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
	public static final Target BUTTON_CC=Target.the("Selecciona Cursos y Certificaciones")
			.located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a/h4/strong"));
	public static final Target INPUT_COURSE=Target.the("Buscar el curso")
			.located(By.id("coursesearchbox"));
	public static final Target BUTTON_GO=Target.the("Dar click en boton buscar")
			.located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
	public static final Target SELECT_COURSE=Target.the("Seleccione ISTQB Agil Tester Extension")
			.located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div/div/div/a/div[2]/h4"));
		public static final Target NAME_COURSE=Target.the("Extraer nombre del curso")
			.located(By.xpath("//h1[contains(text(),'ISTQB Agile Tester Extension')]"));

}
