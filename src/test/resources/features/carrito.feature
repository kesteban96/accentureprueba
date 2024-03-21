#language: es

  Característica: Validar funcionalidades de DemoBlaze

    Antecedentes:
      Dado que soy un usuario de DemoBlaze

  @testregistro
   Esquema del escenario:Validar que se puede realiar el registro de un nuevo usuario
      Cuando el usuario ingresa el "<nombre>" y tambien la "<contra>"
      Entonces el usuario visualiza su registro existoso con nombre "<nombre>"
    Ejemplos:
      |nombre     |contra  |
      |kevin1118  |12345678|

  @comprar
  Esquema del escenario: Validar que se pueda realizar la compra de un producto en especifico
      Cuando el usuario ingresa a la pagina con las credenciales "<nombre>" "<contra>"
      Cuando el usuario selecciona la "<categoria>" y el "<producto>" y agrega al carrito
      Cuando el usuario realiza la compra
      Entonces el usuario visualiza la compra exitosa del "<producto>"
    Ejemplos:
      |nombre     |contra  |categoria|producto |
      |kevin1116  |12345678| Phones  | NokiaLumia  |
