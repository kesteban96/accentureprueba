package co.com.certificacion.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certificacion.demoblaze.userinterfaces.Home.*;

public class ValidarCompra implements Question<Boolean> {

    boolean respuesta=false;
    private String producto;
    public ValidarCompra(String producto){

        this.producto=producto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        switch (producto){
            case "GalaxyS6":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 360 USD")){
                    respuesta=true;
                }
                break;
            case "NokiaLumia":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 820 USD")){
                    respuesta=true;
                }
                break;
            case "Nexus6":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 650 USD")){
                    respuesta=true;
                }
                break;
            case "GalaxyS7":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 800 USD")){
                    respuesta=true;
                }
                break;
            case "Iphone6":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 790 USD")){
                    respuesta=true;
                }
                break;
            case "SonyXperia":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 320 USD")){
                    respuesta=true;
                }
                break;
            case "HTC":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 700 USD")){
                    respuesta=true;
                }
                break;
            case "Sonyi5":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 790 USD")){
                    respuesta=true;
                }
                break;
            case "Sonyi7":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 790 USD")){
                    respuesta=true;
                }
                break;
            case "MacAir":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 700 USD")){
                    respuesta=true;
                }
                break;
            case "Delli7":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 700 USD")){
                    respuesta=true;
                }
                break;
            case "Dell2017":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 700 USD")){
                    respuesta=true;
                }
                break;
            case "MacPro":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 1100 USD")){
                    respuesta=true;
                }
                break;
            case "Apple":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 400 USD")){
                    respuesta=true;
                }
                break;
            case "Asus":
                if (VALIDAR_COMPRA.resolveFor(actor).getText().contains("Amount: 230 USD")){
                    respuesta=true;
                }
                break;
        }

        return respuesta;
    }

    public static ValidarCompra validarCompra(String producto){

        return new ValidarCompra(producto);
    }
}
