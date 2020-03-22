package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CrearUsuarioSteps {
	WebDriver driver;
	By botonUserLocator=By.xpath("//a[@id='hrefUserIcon']");
	By tituloOrLocator=By.xpath("//label[@id='signInResultMessage']");
	By botonCrearUsuarioLocator=By.xpath("//a[@class='create-new-account ng-scope']");
	By tituloCrearLocator=By.xpath("//h3[@class='roboto-regular sticky fixedImportant ng-scope']");
	
	By userLocator=By.xpath("//input[@name='usernameRegisterPage']");
	By emailLocator=By.xpath("//input[@name='emailRegisterPage']");
	By passLocator=By.xpath("//input[@name='passwordRegisterPage']");
	By confirmLocator=By.xpath("//input[@name='confirm_passwordRegisterPage']");
	By iagreeLocator=By.xpath("//input[@name='i_agree']");
	By botonRegisterLocator=By.xpath("//button[@id='register_btnundefined']");
	By botonSignLocator=By.id("sign_in_btnundefined");
	
	@Given("Que he ingresado al Chrome")
	public void que_he_ingresado_al_Chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		driver = new ChromeDriver();
	}

	@When("Abro la pagina del advantageonlineshopping")
	public void abro_la_pagina_del_advantageonlineshopping() {
		driver.get("https://www.advantageonlineshopping.com/#/");
	}

	@Then("Verifico que aparezca el boton del USER")
	public void verifico_que_aparezca_el_boton_del_USER() throws InterruptedException {
		Thread.sleep(10000);
		boolean bandera=driver.findElement(botonUserLocator).isDisplayed();
		Assert.assertEquals(true, bandera);
	}

	@And("Oprimo el boton del USER")
	public void oprimo_el_boton_del_USER() {
		driver.findElement(botonUserLocator).click();
	}
	
	@And("Verifico que aparezca titulo OR")
	public void verifico_que_aparezca_titulo_OR() throws InterruptedException {
		Thread.sleep(10000);
		boolean bandera2=driver.findElement(tituloOrLocator).isDisplayed();
		Assert.assertEquals(true, bandera2);
	}
	
	@And("Ingreso al boton de CREATE NEW ACCOUNT")
	public void ingreso_al_boton_de_CREATE_NEW_ACCOUNT() {
		driver.findElement(botonCrearUsuarioLocator).click();
	}
	
	@And("Verifico que aparezca el titulo de CREATE ACCOUNT")
	public void verifico_que_aparezca_el_titulo_de_CREATE_ACCOUNT() throws InterruptedException {
		Thread.sleep(10000);
		boolean bandera3=driver.findElement(tituloCrearLocator).isDisplayed();
		Assert.assertEquals(true, bandera3);

	}
	
	@And("Digito los campos obligatorios para crear usuario")
	public void digito_los_campos_obligatorios_para_crear_usuario() {
		driver.findElement(userLocator).sendKeys("faz4");
		driver.findElement(emailLocator).sendKeys("Faz@hotmail.com");
		driver.findElement(passLocator).sendKeys("Faz123");
		driver.findElement(confirmLocator).sendKeys("Faz123");
	}

	@And("Selecciono el checklist de I agree")
	public void selecciono_el_checklist_de_I_agree() {
		driver.findElement(iagreeLocator).click();

	}
	@And("Oprimo en boton REGISTER")
	public void oprimo_en_boton_REGISTER() {
		driver.findElement(botonRegisterLocator).click();

	}

	@And("Cierro chrome")
	public void cierro_chrome() {
		//driver.quit();
	}
}




	
	
