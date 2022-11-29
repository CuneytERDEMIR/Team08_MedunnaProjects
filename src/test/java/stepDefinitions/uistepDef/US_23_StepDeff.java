package stepDefinitions.uistepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.common.util.report.qual.ReportUse;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaHospital;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_23_StepDeff {
    MedunnaHospital obje=new MedunnaHospital();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Staff url adresine giris yapar")
    public void staffUrlAdresineGirisYapar() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        obje.enterButton.click();
        obje.signInButton.click();
        obje.userName.sendKeys("kullaniciAdi");
        obje.password.sendKeys("sifre");
        obje.signInButton2.click();
        Thread.sleep(3000);
    }

    @When("Staff {string} butonundan randevularinii goruntuler")
    public void staffButonundanRandevulariniiGoruntuler(String arg0) throws InterruptedException {
        obje.myPages.click();
        ReusableMethods.waitFor(3);
        obje.searchPatient.click();
        Thread.sleep(2000);
    }
    @Then("Staff Show Appointmenti tiklar")
    public void staffShowAppointmentiTiklar() {
        obje.ssnSearchBox.sendKeys("ssnPeter");
        actions.sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).perform();
        obje.showAppointmentPeter.click();

    }

    @And("Staff payment  invoice process e tiklar")
    public void staffPaymentInvoiceProcessETiklar() {
        ReusableMethods.waitFor(2);
        obje.paymentInvoice.click();


    }

    @And("Staff Payment Detail de muayene, test ucretlerinin  gorundugunu dogrular")
    public void staffPaymentDetailDeMuayeneTestUcretlerininGorundugunuDogrular() {
        List<WebElement> coast = obje.coastList;
        for (WebElement each : coast) {
            System.out.println(each.getText());
            Assert.assertTrue(each.isDisplayed());
        }
        System.out.println(obje.totalPrice.getText());
        Assert.assertTrue(obje.totalPrice.isDisplayed());

    }


    @Then("Staff, Show Appointmenta tiklar")
    public void staffShowAppointmentaTiklar() {
        obje.ssnSearchBox.sendKeys("ssnOlivia");
        actions.sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).perform();
        obje.showAppointment.click();
    }

    @And("Staff payment invoice veya create invoice  butonuna tiklar")
    public void staffPaymentInvoiceVeyaCreateInvoiceButonunaTiklar() {
        ReusableMethods.waitFor(2);
        obje.paymentInvoice.click();
        ReusableMethods.waitFor(2);
    }

    @And("Staff create invoice yazisini goruntuler")
    public void staffCreateInvoiceYazisiniGoruntuler(){
      Assert.assertTrue(obje.createinvoice.isDisplayed());


    }

    @Then("Staff, Show Appointment tan payment  invoice process e tiklar")
    public void staffShowAppointmentTanPaymentInvoiceProcessETiklar() {
        obje.ssnSearchBox.sendKeys("ssnPeter");
        actions.sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).perform();
        obje.showAppointmentPeter.click();
    }

    @And("Staff  acilan sayfada  show invoice yazisina tiklar")
    public void staffAcilanSayfadaShowInvoiceYazisinaTiklar() {
        ReusableMethods.waitFor(2);
        obje.paymentInvoice.click();
        ReusableMethods.waitFor(2);
        obje.showInvoice.click();
        ReusableMethods.waitFor(2);

    }

    @And("Staff acilan sayfada invoice basligini dogrular")
    public void staffAcilanSayfadaInvoiceBasliginiDogrular() {
        Assert.assertTrue(obje.invoiceTitle.isDisplayed());
        System.out.println(obje.invoiceTitle.getText());


    }
}
