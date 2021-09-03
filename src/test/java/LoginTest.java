import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import static app.AppConfig.login;
import static app.AppConfig.password;

public class LoginTest extends BaseTest {
    @Description("Test login page")
    @Story("Test login page ")
    @Test
    public void testViaLogin() {
        app.loginPage.open();
        app.loginPage.login(login, password);
        String title = app.loginPage.getTitlePage();
        softAssert.assertEquals("Главная страница", title);
    }
}
