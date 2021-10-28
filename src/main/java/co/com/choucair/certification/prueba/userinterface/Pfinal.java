package co.com.choucair.certification.prueba.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pfinal {
    public static final Target CL = Target.the("Clave")
            .located(By.id("password"));
    public static final Target CP = Target.the("Confirmar Clave")
            .located(By.id("confirmPassword"));
    public static final Target CHEC1 = Target.the("chec1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHEC2 = Target.the("chec2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHEC3 = Target.the("chec3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static Target BOTON = Target.the("Boton")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
