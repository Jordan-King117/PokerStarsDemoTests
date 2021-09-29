package PageObjects;

import Utils.FetchElements;
import Utils.Xpaths;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Betslip {

    public static WebDriver driver;


    public static void setupDriver(String browserName){

        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    public void clickButton(String idType, String buttonPath){
        FetchElements addNewBet = new FetchElements();
        addNewBet.getWebElement(idType, buttonPath).click();
    }

    public void verifyText(String betPathName, String expectedBetName){
        String nameOfDesiredBet = driver.findElement(By.xpath(betPathName)).getText();
        Assert.assertEquals(nameOfDesiredBet,expectedBetName);
    }

    public void bringElementIntoView() {
        WebElement findElement=driver.findElement(By.xpath(Xpaths.SELECT_FIRST_BET));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findElement);
    }

    public void textDoesNotEqual(String firstValueTaken, String secondValueTaken){
        Assert.assertNotEquals(firstValueTaken, secondValueTaken);
    }

    public void verifyPathExists(String pathValue, String failedMessage) {
        FetchElements elementToFetch = new FetchElements();
        Assert.assertTrue(failedMessage, elementToFetch.getListWebElements("ID", pathValue).size()>0);
    }


    public boolean verifyElementAbsent(String betPath) throws Exception {
        try {
            driver.findElement(By.xpath(betPath));
            System.out.println("Bet not deleted");
            driver.quit();
            return false;

        } catch (NoSuchElementException e) {
            System.out.println("bet successfully deleted");
            return true;
        }
    }

}
