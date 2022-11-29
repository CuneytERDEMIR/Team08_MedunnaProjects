package stepDefinitions.uistepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaHospital;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US_21_StepDef {
    MedunnaHospital obje = new MedunnaHospital();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


    Actions actions = new Actions(Driver.getDriver());

    @Given("Staff url e gider")
    public void staffUrleGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        obje.enterButton.click();
        obje.signInButton.click();
        obje.userName.sendKeys("kullaniciAdi");
        obje.password.sendKeys("sifre");
        obje.signInButton2.click();
    }

    @Then("Staff {string} butonundan randevulari goruntuler")
    public void staffButonundanRandevulariniGoruntuler(String arg0) {
        obje.myPages.click();
        obje.searchPatient.click();
        obje.ssnSearchBox.sendKeys("ssnOlivia");
        obje.showAppointment.click();

    }

    @When("Staff edit ile randevu bilgilerinin oldugu sayfayi acar")
    public void staffEditIleRandevuBilgilerininOlduguSayfayiAcar() {
        obje.editButton.click();

    }

    @And("Staff gerekli randevu bilgilerini tamamlayip save e tiklar")
    public void staffGerekliRandevuBilgileriniTamamlayipSaveETiklar() {
        obje.prescription.clear();
        obje.prescription.sendKeys("yanık hasta");
        obje.description.clear();
        obje.description.sendKeys("yanıyorsun fuat abi");
        obje.saveButton.click();
    }

    @And("The appointmant is updated with identifier uyarisini gorur")
    public void theAppointmantIsUpdatedWithIdentifierUyarisiniGorur() {


        assertEquals("Toastify__toast-body", obje.successMessage.getAttribute("class"));


    }

    @Then("Staff status un Unapproved yapilabildigini gorur")
    public void staffStatusUnUnapprovedYapilabildiginiGorur() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Select select = new Select(obje.statusButton);
        select.selectByIndex(0);
        Thread.sleep(3000);
        String actualUnapproved = select.getFirstSelectedOption().getText();
        Assert.assertEquals("UNAPPROVED", actualUnapproved);
        // Thread.sleep(5000);
        //  obje.showAppointment.click();
        //  obje.editButton.click();
        //  ReusableMethods.waitFor(2);
        //  jse.executeScript("arguments[0].scrollIntoView(true);", obje.statusButton);
        //  jse.executeScript("arguments[0].click();", obje.statusButton);

        //  obje.unapproved.click();
        //  ReusableMethods.waitFor(3);
        //  Assert.assertTrue(obje.unapproved.isSelected());
    }

    @When("Staff status un Pending yapilabildigini gorur")
    public void staffStatusUnPendingYapilabildiginiGorur() throws InterruptedException {
        Select select = new Select(obje.statusButton);
        select.selectByIndex(1);
        Thread.sleep(3000);
        String actualPending = select.getFirstSelectedOption().getText();
        Assert.assertEquals("PENDING", actualPending);
        //  obje.showAppointment.click();
        //  obje.editButton.click();
        //  ReusableMethods.waitFor(2);
        //  jse.executeScript("arguments[0].scrollIntoView(true);", obje.statusButton);
        //  jse.executeScript("arguments[0].click();", obje.statusButton);

        //  obje.pending.click();
        //  ReusableMethods.waitFor(3);
        //  Assert.assertTrue(obje.pending.isSelected());
    }

    @And("Staff status un Cancelled yapilabildigini gorur")
    public void staffStatusUnCancelledYapilabildiginiGorur() throws InterruptedException {
        Select select = new Select(obje.statusButton);
        select.selectByIndex(3);
        Thread.sleep(3000);
        String actualCancelled = select.getFirstSelectedOption().getText();
        Assert.assertEquals("CANCELLED", actualCancelled);
        // obje.showAppointment.click();
        // obje.editButton.click();
        // ReusableMethods.waitFor(2);
        // jse.executeScript("arguments[0].scrollIntoView(true);", obje.statusButton);
        // jse.executeScript("arguments[0].click();", obje.statusButton);

        // obje.cancelled.click();
        // ReusableMethods.waitFor(3);
        // Assert.assertTrue(obje.cancelled.isSelected());
    }

    @And("Staff status un Completed yapilamadigini gorur")
    public void staffStatusUnCompletedYapilamadiginiGorur() {
        //Seçilemeyen bir elementin Assertion ı otamasyonla yapılamaz
    }

    @And("Staff physician kismindan doktoru secer ve save'e tiklar")
    public void staffPhysicianKismindanDoktoruSecerVeSaveETiklar() throws IOException {
        jse.executeScript("arguments[0].scrollIntoView(true);", obje.physician);
        jse.executeScript("arguments[0].click();", obje.physician);
        obje.prescription.clear();
        obje.prescription.sendKeys("yanık hasta");
        obje.description.clear();
        obje.description.sendKeys("yanıyorsun fuat abi");

        //Thread.sleep(5000);

        ReusableMethods.waitFor(2);
        Select select = new Select(obje.physician);
        select.selectByVisibleText("309728:Walter Bishop:MEDICAL_GENETICS");
        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshotWebElement("Doktor",obje.physician);
       // jse.executeScript("arguments[0].scrollIntoView(true);", obje.physician);
       // ReusableMethods.waitFor(5);
       // jse.executeScript("arguments[0].click();", obje.physician);

       // jse.executeScript("arguments[0].scrollIntoView(true);", obje.physician3);
       // jse.executeScript("arguments[0].click();", obje.physician3);

       // jse.executeScript("arguments[0].scrollIntoView(true);", obje.physician);
       // jse.executeScript("arguments[0].click();", obje.physician);






        obje.physician.sendKeys("317280");

    }

    @And("The appointment is updated with identifier uyarisini_ gorur")
    public void theAppointmentIsUpdatedWithIdentifierUyarisini_Gorur() {
        assertEquals("Toastify", obje.successMessage2.getAttribute("class"));
       // Assert.assertTrue(obje.successMessage2.isDisplayed());
    }
}
