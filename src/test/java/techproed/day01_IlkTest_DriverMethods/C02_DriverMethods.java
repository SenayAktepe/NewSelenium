package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //getTitle Methodu:
        driver.get("https://amazon.com");
        System.out.println("Amazon sayfa basligi:"+driver.getTitle());
        driver.get("https://techproeducation.com");
        System.out.println("Amazon window Handle degeri"+driver.getWindowHandle());//i822BDB0CA6BDE5A968F7B36D3B029B35

        System.out.println("Techproeducation sayfa basligi:"+driver.getTitle());
        // getTitle methodu sayfa basligini verir.

        //getCurrentUrl Methodu: icinde bulunulan sayfanin url inin string olarak verir.
        System.out.println("Amazon actual url:"+driver.getCurrentUrl());
        System.out.println("Techproed actual url:"+driver.getCurrentUrl());

        //getPageSource Methodu: Icinde bulunulan sayfanin kaynak kodlarini verir. cok kullanmamiz gerekmeyebilir.
       /// System.out.println("Amazon kaynak kodlari: "+driver.getPageSource());

        //getWindowHandle Methodu: icinde bulunulan sayfanin handle degerlerini getirir. Bu handle degeri ile
        //sayfalar arasi gecis icin kullaniriz.
        System.out.println("Techpro window Handle degeri"+driver.getWindowHandle());//i822BDB0CA6BDE5A968F7B36D3B029B35


    }
}
