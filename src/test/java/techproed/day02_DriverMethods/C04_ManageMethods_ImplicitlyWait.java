package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir.
        Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer.
         */
      ////////////////////////////////////////////////////////////////////////////////////////////////////
        //1. Tecproed sayfasina gidelim.
        //2. Amazona gidelim
        //3. Tecproed ya geri donelim
        ///4. sayfa basliginin tecpro icerdigini test edelim.
        //5. tekrar amazon sayfasina geri gidelim
        //6. sayfa basliginin Amazon icerdigini test edelim.

        driver.get("https://techproeducation.com");
        driver.get("https://amazon.com");
        driver.navigate().back();

        String baslik=driver.getTitle();
        String arananKelime="techpro";
        if (baslik.contains(arananKelime)){
            System.out.println("Test Passed");

        }else{
            System.out.println("Test Failed"+baslik);

        }
        driver.navigate().forward();
        String baslikamazon=driver.getTitle();
        String arananamazon="Amazon";
        if (baslikamazon.contains(arananamazon)){
            System.out.println("Test Gecerli");


        }else{
            System.out.println("Test Gecersiz"+baslikamazon);
        }
        driver.close();





















































































    }
}
