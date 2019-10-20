
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakesScreenShot {
    public static void main(String[] args) throws IOException {
        Browser myBrowser =new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\Waleed Javed\\Downloads\\myScreenShot.bmp"));

       // File screenShot= ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(screenShot,new File("C://screenShot.bmp"));
    }

}
