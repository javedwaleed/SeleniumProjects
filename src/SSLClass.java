import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLClass {
    public static void main(String[] args) {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.acceptInsecureCerts();
        ChromeOptions co = new ChromeOptions();
        co.merge(dc);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Waleed Javed\\Downloads\\chromedriver.exe");
        WebDriver driver= new ChromeDriver(co);
        driver.get("http://www.amazon.com");
    }
}
