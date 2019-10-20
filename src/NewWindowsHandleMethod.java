import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class NewWindowsHandleMethod {
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        int i=0;
        Set<String> id=driver.getWindowHandles();
        for(String windowValue : id)
        {
            i++;

            driver.switchTo().window(windowValue);
            System.out.println(i+"Window Title is :"+driver.getTitle());
        }
    }
}
