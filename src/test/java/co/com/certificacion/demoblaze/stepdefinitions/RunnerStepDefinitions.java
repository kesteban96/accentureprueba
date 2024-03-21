package co.com.certificacion.demoblaze.stepdefinitions;

import co.com.certificacion.demoblaze.questions.*;
import co.com.certificacion.demoblaze.tasks.*;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RunnerStepDefinitions {

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }

    @Dado("^que soy un usuario de DemoBlaze$")
    public void queSoyUnUsuarioDeDemoBlaze() {

        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }

    @Cuando("el usuario ingresa el {string} y tambien la {string}")
    public void el_usuario_ingresa_el_y_tambien_la(String string, String string2) {

        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.registrarUsuario(string,string2));
    }

    @Entonces("el usuario visualiza su registro existoso con nombre {string}")
    public void el_usuario_visualiza_su_registro_existoso_con_nombre(String string) {

        theActorInTheSpotlight().should(seeThat(VerificacionRegistro.verificacionRegistro(string)));
    }

    @Cuando("el usuario ingresa a la pagina con las credenciales {string} {string}")
    public void el_usuario_ingresa_a_la_pagina_con_las_credenciales(String string, String string2) {

        theActorInTheSpotlight().attemptsTo(IngresarUsuario.ingresarUsuario(string,string2));
    }

    @Cuando("el usuario selecciona la {string} y el {string} y agrega al carrito")
    public void el_usuario_selecciona_la_y_el_y_agrega_al_carrito(String string, String string2) {

        theActorInTheSpotlight().attemptsTo(AbrirProducto.abrirProducto(string,string2));
    }

    @Cuando("el usuario realiza la compra")
    public void el_usuario_realiza_la_compra() {

        theActorInTheSpotlight().attemptsTo(Comprar.comprar());
    }

    @Entonces("el usuario visualiza la compra exitosa del {string}")
    public void el_usuario_visualiza_la_compra_exitosa_del(String string) {

        theActorInTheSpotlight().should(seeThat(ValidarCompra.validarCompra(string)));
    }
}
