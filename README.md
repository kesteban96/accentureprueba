Requisitos de la Entrega:

-java version "1.8.0_202"
-Se hace uso de Serenity 
-El patron de diseño que se esta usando es Screenplay
-Como gestor de dependencias se uso Gradle 7.6.4
-Se hace uso de Cucumber
-Navegadores: La automatización se realizo en los navegadores Chrome y Firefox
    *Ingresar el archivo srenity.conf  \src\test\resources\serenity.conf
    *Indicar el tipo de navegar mediante la palabra "chrome" o "firefox" 

Casos de uso:

1.Realizar el registro de un nuevo usuario en la pagina Product Store.
Implementación: Desde el feature se deben ingresar un usuario y una contraseña, la automatización
realizara todo el proceso de registro y validara que se pueda hacer el login con dichas credenciales.

2.Realizar una compra, añadiendo productos al carrito.
Condiciones:El usuario indique la categoria y dentro de la categoria el producto que desea comprar y realizar 
la compra del mismo.
Implementación:
-Desde el feature se le pide a el usuario que indique la categoria mediante tres valores (Phones,Laptops,Monitors)
con esta información la automatización se ubicara en la categoria correspondiente.
-Desde el feature se le pide a el usuario que indique el producto dpendiendo de la categoria
Phones (GalaxyS6,NokiaLumia,Nexus6,GalaxyS7,Iphone6,SonyXperia,HTC)
Laptops  (Sonyi5,Sonyi7,MacAir,Delli7,Dell2017,MacPro)
Monitors  (Apple,Asus)
con esta información la automatización sabe que producto debe comprar
-por ultimo la automatización utiliza la información del producto ingresado para identificar el valor
y comprarlo con la respuesta de la compra realizada