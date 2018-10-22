import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiFirstTest {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    @Test
    public void delfiFirstTitleTest() {
        System.setProperty("webdriver.gecko.driver", "/Users/ievabusa/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("Http:delfi.lv");

        String articleToCheck = "Daugavpilī faktiski izjukusi Eigima un Lāčplēša koalīcija; ietekmi atgūst 'Saskaņa'";

        WebElement article = driver.findElement(ARTICLE_TITLE);

        String articleText = article.getText();

        Assertions.assertEquals(articleToCheck, articleText, "Fatal error");




    }



}
