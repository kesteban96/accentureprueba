package co.com.certificacion.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certificacion.demoblaze.userinterfaces.Home.*;

public class VerificacionRegistro implements Question<Boolean> {

    private String texto;
    boolean respuesta = false;

    public VerificacionRegistro(String texto){

        this.texto=texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (VALIDAR_REGISTRO.resolveFor(actor).getText().equals("Welcome"+" "+texto)){
            respuesta = true;
        }
        return respuesta;
    }

    public static VerificacionRegistro verificacionRegistro(String texto){

        return new VerificacionRegistro(texto);
    }
}
