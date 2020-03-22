package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginUsuarioSteps {
	WebDriver driver;
	By botonUserLocator=By.xpath("//a[@id='hrefUserIcon']");
	By tituloOrLocator=By.xpath("//label[@id='signInResultMessage']");
	By userLocator=By.name("username");
	By passLocator=By.name("password");
	By botonSignLocator=By.id("sign_in_btnundefined");
	
	@Given("Que he ingresado a Chrome")
	public void que_he_ingresado_a_Chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		driver = new ChromeDriver();
	}

	@When("Abro la pagina de advantageonlineshopping")
	public void abro_la_pagina_de_advantageonlineshopping() {
		driver.get("https://www.advantageonlineshopping.com/#/");
	}

	@Then("Verifico que aparezca el boton de USER")
	public void verifico_que_aparezca_el_boton_de_USER() throws InterruptedException {
		Thread.sleep(10000);
		boolean bandera=driver.findElement(botonUserLocator).isDisplayed();
		Assert.assertEquals(true, bandera);
	}

	@Then("Oprimo el boton de USER")
	public void oprimo_el_boton_de_USER() {
		driver.findElement(botonUserLocator).click();
	}
	
	@Then("Verifico que aparezca el titulo OR")
	public void verifico_que_aparezca_el_titulo_OR() throws InterruptedException {
		Thread.sleep(10000);
		boolean bandera2=driver.findElement(tituloOrLocator).isDisplayed();
		Assert.assertEquals(true, bandera2);
	}
	
	@Then("Digito las credenciales para loguearse")
	public void digito_las_credenciales_para_loguearse() {
		driver.findElement(userLocator).sendKeys("faz");
		driver.findElement(passLocator).sendKeys("Faz123");
	}

	@Then("Oprimo el boton de SIGN IN")
	public void oprimo_el_boton_de_SIGN_IN() {
		driver.findElement(botonSignLocator).click();
	}

	@Then("Verifico que el usuario se haya logueado")
	public void verifico_que_el_usuario_se_haya_logueado() {
	}

	@And("Cierro el chrome")
	public void cierro_el_chrome() {
		//driver.quit();
	}
}




	
	
