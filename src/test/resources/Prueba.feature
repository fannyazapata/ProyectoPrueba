Feature: Prueba Test

    @Crear     
  	Scenario: Dar de alta a un usuario
    Given Que he ingresado al Chrome
    When Abro la pagina del advantageonlineshopping
    Then Verifico que aparezca el boton del USER
    And Oprimo el boton del USER
    And Verifico que aparezca titulo OR
    And Ingreso al boton de CREATE NEW ACCOUNT
    
    And Verifico que aparezca el titulo de CREATE ACCOUNT
    And Digito los campos obligatorios para crear usuario
    And Selecciono el checklist de I agree
    And Oprimo en boton REGISTER
    And Cierro chrome
    
	@Login
    Scenario: Iniciar sesion en el sito con el usuario creado
    Given Que he ingresado a Chrome
    When Abro la pagina de advantageonlineshopping
    Then Verifico que aparezca el boton de USER
    And Oprimo el boton de USER
    And Verifico que aparezca el titulo OR
    And Digito las credenciales para loguearse
    And Oprimo el boton de SIGN IN
    And Cierro el chrome

    @AgregarProducto
    Scenario: Agregar producto al carrito de compras
    Given Que he entrado a Chrome
    When Abro pagina de advantageonlineshopping
    Then Verifico que aparezca el producto
    And Elijo un producto
    And Oprimo el boton BUY NOW
    And Oprimo el boton ADD TO CART
    And Verifico producto en carrito de compra
    And Cierro al chrome

