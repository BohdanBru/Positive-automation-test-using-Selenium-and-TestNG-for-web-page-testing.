package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import page.base.BasePage;
import page.listning.OLXListeningPage;
import page.otoDom.OLXPage;

import java.time.Duration;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected OLXPage otoDomPage = new OLXPage(driver);
    protected OLXListeningPage otoDomListningPage = new OLXListeningPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    /*protected void switchWindow(){
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String window1 = driver.getWindowHandle();
        js.executeScript("window.open()");
        Set<String> currentWindows = driver.getWindowHandles();
        String window2 = null;
        for (String win: currentWindows             ) {
            if(!(win==window1)){
                window2=win;
                break;
            }
        }
        driver.switchTo().window(window2);


    }*/
    @AfterSuite(alwaysRun = true)
    public void windowQuit() {
        driver.quit();
    }
}
