package tests.searchAparments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class SearchApartmentTest extends BaseTest {
    @Test
    public void checkRedirectToListning() {
        basePage.open("https://www.olx.pl/nieruchomosci/mieszkania/sprzedaz/");
        //switchWindow();
        otoDomPage.enterCountRooms();
        otoDomListningPage.checkCountCards();


    }

}
