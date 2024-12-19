package demo.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.epam.healenium.SelfHealingDriver;

public class HeleniumDemo {
	
	static private SelfHealingDriver driver;
	
    public static void main(String[] args) {
    	
    	
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe"); // Update this path

        // Initialize the ChromeDriver
        WebDriver delegate = new EdgeDriver();
        driver= SelfHealingDriver.create(delegate);

        // Open a web page
        String url = "file:///C:/Users/narendra.gopisetti/Downloads/carvilla-v1.0/index.html"; // Replace with your desired URL
        driver.get(url);
        driver.manage().window().maximize();

        WebElement contact = driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[1]/div/nav/div/div[1]/a"));
        contact.click();
        
    }
}
