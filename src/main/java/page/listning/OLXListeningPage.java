package page.listning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.base.BasePage;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class OLXListeningPage extends BasePage {

    public OLXListeningPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[text()='Wyróżnione']");

    public OLXListeningPage checkCountCards() {

        waitElementIsVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        //Assert.assertEquals(countCard, 12);
        System.out.println("The marked elements were found: " + countCard);
        return this;
    }
}
