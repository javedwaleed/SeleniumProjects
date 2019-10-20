import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public WebDriver invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Waleed Javed\\Downloads\\chromedriver.exe");
        WebDriver waleed = new ChromeDriver();
        return waleed;
    }
}