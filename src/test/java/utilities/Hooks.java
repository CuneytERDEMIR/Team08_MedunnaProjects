package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
      /*
   Cucumber'da Step definitions package'i icerisinde
   @before,@after gibi bir notasyon varsa
    extends testBase dememeize gerek kalmadan
    her scenario'dan once veya sonra bu methodlar calisacaktir
    Cucumber'da @before,@after kullanma ihtiyacimiz olursa
    bunu step definitions package'i altinda olusturacagimiz
    Hooks class'ina koyariz
    Biz her scenario;dan sonra test sonucunu kontrol edip
    failed olan scenario icin screenshoot almasi amaciyla
    @After method'u kullanacagiz
     */

    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }

}
