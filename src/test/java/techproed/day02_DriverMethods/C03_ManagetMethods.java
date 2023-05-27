package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManagetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1.Browser in konumun yazdiralim.
        //2.Browser in boyutlarini yazalim
        //3.Browser i maximize yapalim.
        //4.Techproeducation sayfasina gidelim.
        //5.sayfayi minimize yapalim.
        //6.sayfayi fullscren yapalim.

       //1.
        System.out.println("sayfanin konumunu :"+driver.manage().window().getPosition());

        //2.
        System.out.println("Sayfanin boyutu:"+driver.manage().window().getSize());

        //3.
        driver.manage().window().maximize();

        //4.
        driver.get("https://Techproeducation.com");
        System.out.println("sayfanin konumunu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu:"+driver.manage().window().getSize());

        //5.
        driver.manage().window().minimize();

        //6.
        driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50));//istedigimiz konum yapariz
        driver.manage().window().setSize(new Dimension(600,600));//istedigimiz size yapariz

       //sayfayi kapat:
        driver.close();


        //Browser'a gittikten sonra ilk is olarak sayfayi
        // her zaman maximize yapmaliyiz.
/*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */










    }
}
