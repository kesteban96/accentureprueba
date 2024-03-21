package co.com.certificacion.demoblaze.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/carrito.feature",
        glue = "co.com.certificacion.demoblaze.stepdefinitions",
        tags  ="@comprar"
)
public class CarritoRunner {
}
