package page.otoDom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    By city = By.xpath("//input[@placeholder='Cała Polska']");
    By findPlace = By.xpath("//input[@placeholder='Znajdź coś dla siebie']");
    By priceLow = By.xpath("//p[text()='Cena ']/../div/div[1]/div/div/div/input");

    By priceHigh = By.xpath("//p[text()='Cena ']/../div/div[2]/div/div/div/input");
    By startRoom = By.xpath("//p[text()='Cena ']/../following-sibling::div/div/div/div/div/div/input");


    public OLXPage enterCountRooms() {
        driver.get("https://www.olx.pl/nieruchomosci/mieszkania/sprzedaz/");

        driver.findElement(accept).click();
        WebElement chooseCity = driver.findElement(city);
        chooseCity.sendKeys("Warszawa", Keys.ENTER);
        WebElement find = driver.findElement(findPlace);
        find.sendKeys("Ursynów", Keys.ENTER);

        WebElement lowPrice = driver.findElement(priceLow);
        lowPrice.sendKeys("200000", Keys.ENTER);
        WebElement highPrice = driver.findElement(priceHigh);
        highPrice.sendKeys("500000", Keys.ENTER);
        WebElement roomStart = driver.findElement(startRoom);
        roomStart.sendKeys("45", Keys.ENTER);


        driver.findElement(locat).click();

        driver.findElement(option2Rooms).click();
        return this;
    }
}
