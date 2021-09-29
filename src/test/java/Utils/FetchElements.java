package Utils;

import PageObjects.Betslip;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FetchElements {


        public WebElement getWebElement(String identifierType, String identifierValue){
            switch(identifierType){
                case"ID":
                    return  Betslip.driver.findElement(By.id(identifierValue));
                case"CSS":
                    return  Betslip.driver.findElement(By.cssSelector(identifierValue));
                case"TAGNAME":
                    return  Betslip.driver.findElement(By.tagName(identifierValue));
                case"XPATH":
                    return  Betslip.driver.findElement(By.xpath(identifierValue));
                case"NAME":
                    return  Betslip.driver.findElement(By.name(identifierValue));
                case"CLASS":
                    return  Betslip.driver.findElement(By.className(identifierValue));
                default:
                    return null;
            }
        }

        public List<WebElement> getListWebElements(String identifierType, String identifierValue) {
            switch (identifierType) {
                case "ID":
                    return Betslip.driver.findElements(By.id(identifierValue));
                case "CSS":
                    return Betslip.driver.findElements(By.cssSelector(identifierValue));
                case "TAGNAME":
                    return Betslip.driver.findElements(By.tagName(identifierValue));
                case "XPATH":
                    return Betslip.driver.findElements(By.xpath(identifierValue));
                case "NAME":
                    return Betslip.driver.findElements(By.name(identifierValue));
                default:
                    return null;
            }
        }


}
