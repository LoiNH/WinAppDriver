package first.app;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws MalformedURLException {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("app", "C:\\Windows\\System32\\calc.exe");

            WindowsDriver<WebElement> driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), cap);
            Thread.sleep(5000);

            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
