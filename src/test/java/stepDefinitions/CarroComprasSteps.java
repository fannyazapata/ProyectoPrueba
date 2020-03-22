package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CarroComprasSteps {
	WebDriver driver;
	By productLocator=By.xpath("//div[@id='speakersImg']");
	By buyNowLocator=By.name("buy_now");
	By addToCartLocator=By.name("save_to_cart");
	By CartLocator=By.xpath("//span[@class='cart ng-binding']");
	
	@Given("Que he entrado a Chrome")
	public void que_he_entrado_a_Chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		driver = new ChromeDriver();
	}

	@When("Abro pagina de advantageonlineshopping")
	public void abro_pagina_de_advantageonlineshopping() {
		driver.get("https://www.advantageonlineshopping.com/#/");
	}

	@Then("Verifico que aparezca el producto")
	public void verifico_que_aparezca_el_producto() throws InterruptedException {
		Thread.sleep(10000);
		boolean bandera=driver.findElement(productLocator).isDisplayed();
		Assert.assertEquals(true, bandera);
	}


	@Then("Elijo un producto")
	public void elijo_un_producto() {
		driver.findElement(productLocator).click();
	}
  	
	@Then("Oprimo el boton BUY NOW")
	public void oprimo_el_boton_BUY_NOW() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(buyNowLocator).click();

	}
	
	@Then("Oprimo el boton ADD TO CART")
	public void oprimo_el_boton_ADD_TO_CART() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(addToCartLocator).click();
	}

	@Then("Verifico producto en carrito de compra")
	public void verifico_producto_en_carrito_de_compra() throws InterruptedException {
		Thread.sleep(10000);
		List<WebElement> cart=driver.findElements(CartLocator);
		Assert.assertEquals("1", cart.get(1).getText());
	}

	@And("Cierro al chrome")
	public void cierro_al_chrome() {
		//driver.quit();
	}
}




	
	
