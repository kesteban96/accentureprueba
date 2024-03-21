package co.com.certificacion.demoblaze.tasks;

import co.com.certificacion.demoblaze.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.demoblaze.userinterfaces.Home.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarUsuario implements Task {
    private String nombre;
    private String contra;

    public IngresarUsuario(String nombre,String contra){
        this.contra=contra;
        this.nombre=nombre;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(LOG_IN, isClickable()).forNoMoreThan(100).seconds(),
            Click.on(LOG_IN),
            Enter.theValue(nombre).into(Home.Nombre_LogIn),
            Enter.theValue(contra).into(Home.Contrasena_LogIn),
            Click.on(BOTON_LOGIN),
            WaitUntil.the(VALIDAR_REGISTRO, isVisible()).forNoMoreThan(100).seconds());
    }

    public static IngresarUsuario ingresarUsuario(String nombre,String contra){

        return Tasks.instrumented(IngresarUsuario.class,nombre,contra);
    }
}
