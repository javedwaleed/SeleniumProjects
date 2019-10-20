import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop {
    public static void main(String[] args){
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='BANK']")));
        WebElement source = driver.findElement(By.xpath("//a[test()='BANK']"));
        WebElement target= driver.findElement(By.cssSelector("ol#bank>li"));
        Actions myActions =new Actions(driver);
        myActions.dragAndDrop(source,target).build().perform();
    }

}
