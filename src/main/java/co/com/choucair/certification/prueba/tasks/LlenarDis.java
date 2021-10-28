package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.Udatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.prueba.userinterface.Dispositivos.*;
public class LlenarDis implements Task {

    private List<Udatos> datos;

    public LlenarDis(List<Udatos> datos) {
        this.datos = datos;
    }

    public static LlenarDis laPagina(List<Udatos> datos) {
        return Tasks.instrumented(LlenarDis.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CDISPOSITIVOS),
                Enter.theValue(datos.get(0).getStrDispositivo()).into(DDISPOSITIVOS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CMODEL),
                Enter.theValue(datos.get(0).getStrModelo()).into(DMODELOS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(COPERATIVO),
                Enter.theValue(datos.get(0).getStrSo()).into(DOPERATIVO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTON)
                );
    }
}
