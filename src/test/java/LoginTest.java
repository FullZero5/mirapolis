import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import static app.AppConfig.login;
import static app.AppConfig.password;
import static helpers.Driver.takeScreenshot;
import static helpers.Driver.waitPage;

public class LoginTest extends BaseTest {
    @Description("Test login page")
    @Story("Test login page ")
    @Test
    public void testViaLogin() {
        app.loginPage.open();
        app.loginPage.login(login, password);
        String titlePage = app.loginPage.getTitlePage();
        logger.info(titlePage);
        softAssert.assertEquals(titlePage, "Главная страница");
        waitPage(5);
        takeScreenshot();
    }
}
