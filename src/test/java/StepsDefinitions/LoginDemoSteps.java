package StepsDefinitions;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps {
	
	LoginPage login;
    WebDriver driver=null;
	

	@Before
	public void browser_esta_abierto() {
		
		login=new LoginPage(driver);
		driver=login.ChromeConection();
	}

	@Given("se abre la pantalla de loguearse")
	public void se_abre_la_pantalla_de_loguearse() {
		
		login.visitUrl("https://the-internet.herokuapp.com/login");
		
	    
	}

	@When("el usuario entra su {string} y {string} correctamente")
	public void el_usuario_entra_su_usuario_y_contraseña_correctamente(String username,String password) throws InterruptedException {
		
	login=new LoginPage(driver);
		
	   login.UserName(username);
	   login.Password(password);
	   
	}

	@And("se autentica al dar clic en Login")
	public void se_autentica_al_dar_clic_en_login() {
		login.ClicLogin();
	   
	}

	@Then("el usuario entra a la Pagina Principal")
	public void el_usuario_entra_a_la_pagina_principal() {
	
		login.LogoutisDisplay();
			
	  
	}
	
	@After
	public void browser_esta_cerrado() {
		
		login.Quit();
		
	}

}
