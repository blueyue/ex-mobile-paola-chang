#language:es
  Característica:Login de
                  Como Usuario
                  Deseo acceder a mi cuenta
                  Para poder usar la aplicación

    @test
    Escenario:Login exitoso
      Cuando ingreso con las credenciales "standard_user" y "secret_sauce"
      Entonces lograré ingresar visualizar el titulo "PRODUCTS"

    Escenario:Login fallido
      Cuando ingreso con las credenciales "locked_out_user" y "secret_sauce"
      Entonces obtendré un mensaje de error "Sorry, this user has been locked out."


