package co.com.certificacion.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certificacion.demoblaze.userinterfaces.Home.*;
public class Comprar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Click.on(COMPRAR),
            Enter.theValue("Comprador").into(COMPRADOR),
            Enter.theValue("Colombia").into(PAIS),
            Enter.theValue("Medellin").into(CIUDAD),
            Enter.theValue("0001").into(TARJETA),
            Enter.theValue("01").into(MES),
            Enter.theValue("2025").into(AÑO),
            Click.on(ACEPTAR));
    }

    public static Comprar comprar(){

        return Tasks.instrumented(Comprar.class);
    }
}
