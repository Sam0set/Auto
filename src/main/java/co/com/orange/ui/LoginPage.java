package co.com.orange.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("Campo de usuario").located(By.id("username"));
    public static final Target PASSWORD_FIELD = Target.the("Campo de contraseña").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Botón de login").located(By.id("boton"));
}
