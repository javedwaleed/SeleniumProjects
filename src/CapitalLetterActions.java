import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CapitalLetterActions {
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions myactions = new Actions(driver);
        WebElement myWebElement = driver.findElement(By.cssSelector("input#email"));

        /*
        myactions.moveToElement(myWebElement).build().perform();
        myactions.click().build().perform();
        myactions.keyDown(myWebElement, Keys.SHIFT).build().perform();
        myactions.sendKeys("Waleed").build().perform();
        myactions.keyUp(myWebElement,Keys.SHIFT).build().perform();  */

        Action action = myactions.moveToElement(myWebElement)
                .click()
                .keyDown(myWebElement,Keys.SHIFT)
                .sendKeys("Waleed")
                .keyUp(myWebElement,Keys.SHIFT)
                .build();
        action.perform();


    }
}
