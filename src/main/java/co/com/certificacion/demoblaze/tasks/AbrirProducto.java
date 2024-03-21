package co.com.certificacion.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.demoblaze.userinterfaces.Home.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AbrirProducto implements Task {
    private String categoria;
    private String producto;

    public AbrirProducto(String categoria,String producto){

        this.categoria=categoria;
        this.producto=producto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.printf(categoria);
        switch (categoria){

            case "Phones":
                actor.attemptsTo(
                        Click.on(SELECCIONAR_CATEGORIA.of("1")));
                switch (producto){
                    case "GalaxyS6":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("1")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "NokiaLumia":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("2")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "Nexus6":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("3")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "GalaxyS7":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("4")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "Iphone6":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("5")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "SonyXperia":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("6")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "HTC":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("7")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                }
                break;
            case "Laptops":
                actor.attemptsTo(
                        Click.on(SELECCIONAR_CATEGORIA.of("2")));
                switch (producto){
                    case "Sonyi5":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("1")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "Sonyi7":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("2")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "MacAir":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("3")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "Delli7":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("4")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "Dell2017":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("5")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                    case "MacPro":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("6")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                }
                break;
            case "Monitors":
                actor.attemptsTo(
                        Click.on(SELECCIONAR_CATEGORIA.of("3")));
                switch (producto){

                    case "Apple":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("1")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                            break;
                    case "Asus":
                        actor.attemptsTo(
                            Click.on(SELECCIONAR_PRODUCTO.of("2")),
                            WaitUntil.the(BOTON_AGREGAR, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(BOTON_AGREGAR),
                            WaitUntil.the(Cart, isClickable()).forNoMoreThan(100).seconds(),
                            Click.on(Cart));
                        break;
                }
                break;
        }

    }

    public static AbrirProducto abrirProducto(String categoria, String producto){

        return Tasks.instrumented(AbrirProducto.class,categoria,producto);
    }
}
