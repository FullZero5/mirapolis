package app.pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {


    public SelenideElement loginField = $(By.name("user"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement signInButton = $("#button_submit_login_form");

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
