package co.com.certificacion.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target SIGN_UP= Target.the("SIGN UP").
                located(By.xpath("//a[@id=\"signin2\"]"));
    public static final Target NOMBRE_REGISTRO= Target.the("Name registro").
                located(By.id("sign-username"));
    public static final Target CONTRASEÑA_REGISTRO= Target.the("Contrasena registro").
            located(By.id("sign-password"));
    public static final Target BOTON_REGISTRO= Target.the("Registro completado").
            locatedBy("//button[@onclick=\"register()\"]");

    public static final Target LOG_IN= Target.the("LOG IN").
            locatedBy("//a[@id=\"login2\"]");

    public static final Target Nombre_LogIn= Target.the("name login").
            locatedBy("//input[@id=\"loginusername\"]");

    public static final Target Contrasena_LogIn= Target.the("password login").
            locatedBy("//input[@id=\"loginpassword\"]");
    public static final Target BOTON_LOGIN= Target.the("login completado").
            locatedBy("//button[@onclick=\"logIn()\"]");
    public static final Target Cart= Target.the("Carrito").
            locatedBy("//a[@id=\"cartur\"]");
    public static final Target BOTON_AGREGAR= Target.the("boton de agregar").
            located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    public static final Target VALIDAR_REGISTRO = Target.the("Validar el registro").located(By.xpath("//*[@id=\"nameofuser\"]"));
    public static final Target SELECCIONAR_CATEGORIA= Target.the("seleccioanr categoria").
            locatedBy("//*[@class=\"list-group\"]//*[@id=\"itemc\"][{0}]");
    public static final Target SELECCIONAR_PRODUCTO= Target.the("seleccioanr producto").
            locatedBy("//*[@id=\"tbodyid\"]//*[@class=\"col-lg-4 col-md-6 mb-4\"][{0}]//*[@class=\"card-title\"]");
    public static final Target COMPRAR = Target.the("Boton comprar").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    public static final Target COMPRADOR = Target.the("nombre comprador").located(By.id("name"));
    public static final Target PAIS = Target.the("nombre pais").located(By.id("country"));
    public static final Target CIUDAD = Target.the("nombre ciudad").located(By.id("city"));
    public static final Target TARJETA = Target.the("tarjeta").located(By.id("card"));
    public static final Target MES = Target.the("Mes de vencimiento").located(By.id("month"));
    public static final Target AÑO = Target.the("Año").located(By.id("year"));
    public static final Target ACEPTAR = Target.the("Aceptar la compra").located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    public static final Target VALIDAR_COMPRA = Target.the("Validar la compra realizada").located(By.xpath("//*[@class=\"lead text-muted \"]"));

}
