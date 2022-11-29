package stepDefinitions.uistepDef;

import org.junit.Assert;
import org.junit.Test;
import pages.MedunnaHospital;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestNgDeneme {
    @Test
    public void test01() throws InterruptedException {
        MedunnaHospital obje=new MedunnaHospital();
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        obje.enterButton.click();
        obje.signInButton.click();
        obje.userName.sendKeys("StuffCuneyt");
        obje.password.sendKeys("1905Hagi10");
        obje.signInButton2.click();
        Thread.sleep(5000);

        obje.myPages.click();
        obje.searchPatient.click();

        obje.ssnSearchBox.sendKeys("523-52-5230");

        String actualSsn="523-52-5230";

        Assert.assertEquals("you have a invalid SSN",obje.exceptedSsn.getText(),actualSsn);
        ReusableMethods.waitFor(5);
        obje.ssnSearchBox.sendKeys("523-52-5232");
        Thread.sleep(2000);
        obje.showAppointmentPeter.click();

        obje.showTestButton.click();
        Assert.assertTrue(obje.testsScreen.isDisplayed()) ;


    }
}
