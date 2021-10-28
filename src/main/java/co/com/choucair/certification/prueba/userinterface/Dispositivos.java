package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Dispositivos {

    public static final Target CDISPOSITIVOS = Target.the("Contenedor Dispo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target DDISPOSITIVOS = Target.the("despliegue dispositivos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target CMODEL = Target.the("Contenedor Modelos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target DMODELOS = Target.the("despliegue Modelos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target COPERATIVO = Target.the("Contenedor SO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target DOPERATIVO = Target.the("despliegue SO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target BOTON = Target.the("Boton siguiente")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
