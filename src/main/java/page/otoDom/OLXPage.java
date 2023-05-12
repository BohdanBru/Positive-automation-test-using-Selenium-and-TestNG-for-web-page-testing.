package page.otoDom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.base.BasePage;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class OLXPage extends BasePage {
    public OLXPage(WebDriver driver) {
        super(driver);
    }

    By locat = By.xpath("//p[text()='Liczba pokoi']/../div/div");
    //"/html/body/div[1]/div[2]/div[2]/form/div[3]/div[1]/div/div[9]/div/div/div[1]"

    By option2Rooms = By.xpath("//p[text()='2 pokoje']/../input");
    // "/html/body/div[1]/div[2]/div[2]/form/div[3]/div[1]/div/div[9]/div/div/div[2]/div/div[3]/label/input"
    By accept = By.xpath("//button[text()='Akceptuję']");
    //"/html/body/div[2]/div[2]/div/div[1]/div/div[2]/div/button[1]"

    public OLXPage enterCountRooms() {
        driver.get("https://www.olx.pl/nieruchomosci/mieszkania/sprzedaz/");

        driver.findElement(accept).click();

        driver.findElement(locat).click();

        driver.findElement(option2Rooms).click();
        return this;
    }
}
