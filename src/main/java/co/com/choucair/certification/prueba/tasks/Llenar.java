package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.Udatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.choucair.certification.prueba.userinterface.datos.*;
public class Llenar implements Task{

    private List<Udatos> datos;

    public Llenar(List<Udatos> datos) {
        this.datos = datos;
    }

    public static Llenar lapagina(List<Udatos> datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(PNOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(MNACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(DNACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(ANACIMIENTO),
                Click.on(BOTON_DIRECCION )
        );
    }
}
