package Amazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shihab\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://Amazon.com");
        Thread.sleep(5000);

        obj.close();





    }


}
