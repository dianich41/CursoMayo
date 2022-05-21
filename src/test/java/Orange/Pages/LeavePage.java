package Orange.Pages;

import org.openqa.selenium.WebDriver;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;

public class LeavePage {

	private ButtonPages buttonPages;
	private Questions questions; 

	public LeavePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);

	}

	public void llegarLeave() {
		buttonPages.btnLeave();
		questions.screenShot();
	}

	public void buscarEmpleado(String employee) {
		question.scrollSearch(employee);
	}
}
