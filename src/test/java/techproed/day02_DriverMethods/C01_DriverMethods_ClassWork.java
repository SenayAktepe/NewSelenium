package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Amazon sayfasina gidelim sayfa basliginin Amazon icerdigini test edelim. url nin https://www.amazon.com/
        //oldugunu test edelim. sayfayi kapatalim.

        //Title test:
        driver.get("https://amazon.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");

        }

        //Url Test:
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");

        }else{
            System.out.println("Test FAILLED-->"+actualUrl);
        }

     //Sayfayi Kapatalim:

        driver.close();//Browser i kapatir.
        //driver.quit(); birden fazla browser i kapatir.













    }}
