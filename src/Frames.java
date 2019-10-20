import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Frames {
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();

        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe.demo-frame")));
        WebElement source= driver.findElement(By.cssSelector("#draggable"));
        WebElement target =driver.findElement(By.cssSelector("#droppable"));
        Actions act=new Actions(driver);
        act.dragAndDrop(source,target).build().perform();




    }
}