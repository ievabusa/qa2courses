import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class CompareFirstFiveWebMobArticleTiltes {

    private final By WEB_ARTICLES = By.xpath(".//a[@class ='top2012-title']");
    private final By MOB_ARTICLES = By.xpath(".//a[@class ='md-scrollpos']");

    @Test

    public void compareFirstFiveWebMobArticles() {

        System.setProperty("webdriver.gecko.driver", "/Users/ievabusa/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.lv");

        List<WebElement> webElements = driver.findElements(WEB_ARTICLES);
        List<String> webTitles = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {

            String webTitlesText = webElements.get(i).getText();
            webTitles.add(webTitlesText);
        }

        driver.get("http://m.delfi.lv/");

        List<WebElement> mobElements = driver.findElements(MOB_ARTICLES);
        List<String> mobTitles = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {

            String mobTitlesText = mobElements.get(i).getText();
            mobTitles.add(mobTitlesText);
        }

        for (int i = 0; i < 5; i++) {

            Assertions.assertEquals(webTitles.get(i), mobTitles.get(i), "Web article Nr. " + i + "incorrect!");
        }
    }
}
