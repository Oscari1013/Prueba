package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.Udatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


import java.util.List;
import static co.com.choucair.certification.prueba.userinterface.PaginaDireccion.*;

public class LlenarUbicacion implements Task {

    private List<Udatos> datos;

    public LlenarUbicacion(List<Udatos> datos) {
        this.datos = datos;
    }

    public static LlenarUbicacion lapagina(List<Udatos> datos) {
        return Tasks.instrumented(LlenarUbicacion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CIUDAD),
                Hit.the(Keys.ENTER).into(CIUDAD),
                Enter.theValue(datos.get(0).getStrZip()).into(ZIP),
                Click.on(CPAISES),
                Enter.theValue(datos.get(0).getStrPais()).into(PAIS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTON)
        );
    }
}
