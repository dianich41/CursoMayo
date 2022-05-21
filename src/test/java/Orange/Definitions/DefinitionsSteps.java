package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Pages.LeavePage;
import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import Orange.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		// llamado a la página LoginPage
		this.driver = this.conexion.abrirNavegador();

	}

	@And("^diligenciar username (.*) y password (.*)$")
	public void diligenciarFormulario(String userName, String contrasena) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.diligenciarFormulario(userName, contrasena);

	}

	@And("^llegar a add employee$")
	public void llegaraPim() {
		this.pimPage = new PimPage(driver);
		this.pimPage.llegaraPim();

	}

	@When("^diligenciar firstname (.*) y lastname (.*)$")
	public void diligenciarempleado(String firstName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.diligenciarempleado(firstName, lastName);
	}

	@And("^llegar hasta leave$")
	public void llegarLeave() {
		this.leavePage = new LeavePage(driver);
		this.leavePage.llegarLeave();
	}

}