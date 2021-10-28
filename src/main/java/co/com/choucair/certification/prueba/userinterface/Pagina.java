package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class Pagina extends PageObject {

    public static final Target JOIN = Target.the("Boton para iniciar registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
