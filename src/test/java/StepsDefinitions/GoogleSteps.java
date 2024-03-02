package StepsDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class GoogleSteps {
	
	WebDriver driver=null;
	
	
	@Given("Estoy en la pagina de seccion de busqueda en google")
	public void estoy_en_la_pagina_de_seccion_de_busqueda_en_google() {
		
		System.setProperty("webdriver.chrome.driver", "/home/mint/COSAS MIAS/JAVA/drivers/chromedriver-linux64/chromedriver");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	}

	@When("escribo la informacion a buscar {string}")
	public void escribo_la_informacion_a_buscar(String string) {
	    System.out.println("escribo la informacion a buscar {string}");
	    WebElement nombre=driver.findElement(By.name("q"));
	    nombre.sendKeys("automation step by step");
	  
	}

	@And("presiono Enter")
	public void presiono_enter() {
		 System.out.println("escribo la informacion a buscar {string}");
		 WebElement nombre=driver.findElement(By.name("q"));
		 nombre.submit();
	   
	}

	@Then("Obtengo informacion de la pagina")
	public void obtengo_informacion_de_la_pagina() {
		 System.out.println("Obtengo info d la pagina final");
		 
		 String textoMostrado=driver.findElement(By.cssSelector("a[href=\"https://automationstepbystep.com/\"]>h3")).getText();

		assertEquals(textoMostrado,"Automation Step by Step: NEVER STOP LEARNING");
		System.out.println(textoMostrado);
		 
	}
}
