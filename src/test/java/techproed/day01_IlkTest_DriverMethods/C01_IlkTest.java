package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        //Java uygulamarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        // setProperty methodu ile classimiza driver in fiziki yolunu belirttik.

        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" degerini girerek "value"ya ulasabiliriz.

        WebDriver driver=new ChromeDriver();
        //ChromeDriver turunde yeni bir obje olusturduk.

        driver.get("https://techproeducation.com");
        //String olarak girilen URL e gireriz.

    }
}
