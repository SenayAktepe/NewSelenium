package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigatMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

       //1.Techproeducation sayfasian gidelim.
       //2.Amazon sayfasina gidelim.
       //3.Amazon sayfasinin basligini yazdiralim.
       //4.Techproeducation sayfasina geri donelim.
       //5.sayfa basligini yazdiralim.
       //6.Amazon sayfasina geri donup url i yazdiralim.
        //7.Amazon sayfasindayken sayfayi yenileyelim.

        //1.
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);//kodlari bekletmek icin kullanilir.3 saniye bekletecek
        //2.
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        //3.
        System.out.println("Amazon Basligi:"+driver.getTitle());
        Thread.sleep(3000);
        //4.
        driver.navigate().back();
        Thread.sleep(3000);
        //5.
        System.out.println("Techpro Basligi:"+driver.getTitle());
        Thread.sleep(3000);
        //6.
        driver.navigate().forward();
        System.out.println("Amazon Url:"+driver.getCurrentUrl());
        Thread.sleep(3000);
        //7.
        driver.navigate().refresh();
        Thread.sleep(3000);

        //sayfayi kapatalim:
        driver.close();


    }
}
