package app.pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private SelenideElement loginField = $(By.name("user"));
    private SelenideElement passwordField = $(By.name("password"));
    private SelenideElement signInButton = $("#button_submit_login_form");

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    public void login(String login, String password) {
        loginField.setValue(login);
        passwordField.setValue(password);
        signInButton.click();
    }

    public String getTitlePage() {
        return Driver.getTitlePage();
    }
}
