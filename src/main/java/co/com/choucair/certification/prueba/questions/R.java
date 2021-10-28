package co.com.choucair.certification.prueba.questions;

import co.com.choucair.certification.prueba.model.Udatos;
import co.com.choucair.certification.prueba.userinterface.Pfinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class R implements Question<Boolean> {

    private List<Udatos> datos;

    public R(List<Udatos> datos) {
        this.datos = datos;
    }

    public static R aLos(List<Udatos> datos) {
        return new R(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Boton = Text.of(Pfinal.BOTON).viewedBy(actor).asString();

        return datos.get(0).getStrTxt().equals(Boton);
    }
}
