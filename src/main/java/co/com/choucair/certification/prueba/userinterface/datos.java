package co.com.choucair.certification.prueba.userinterface;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class datos {

    public static final Target PNOMBRE = Target.the("Primer nombre")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target MNACIMIENTO = Target.the("Mes de nacido")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target DNACIMIENTO = Target.the("Dia de nacido")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target ANACIMIENTO = Target.the("Ano nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BOTON_DIRECCION = Target.the("Boton de localizacion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
