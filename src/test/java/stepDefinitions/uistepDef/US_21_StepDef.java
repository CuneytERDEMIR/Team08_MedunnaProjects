package stepDefinitions.uistepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedunnaHospital;
import utilities.ConfigReader;
import utilities.Driver;

public class US_21_StepDef {
    MedunnaHospital obje=new MedunnaHospital();
    @Given("Staff url e gider")
    public void staffUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        obje.enterButton.click();
        obje.signInButton.click();
        obje.userName.sendKeys("StuffCuneyt");
        obje.password.sendKeys("1905Hagi10");
        obje.signInButton2.click();
    }

    @Then("Staff {string} butonundan randevulari goruntuler")
    public void staffButonundanRandevulariGoruntuler(String arg0) {
        obje.myPages.click();
        obje.searchPatient.click();
        obje.ssnSearchBox.sendKeys("523-52-5230");
        obje.showAppointment.click();

    }

    @When("Staff edit ile randevu bilgilerinin oldugu sayfayi acar")
    public void staffEditIleRandevuBilgilerininOlduguSayfayiAcar() {
        obje.editButton.click();

    }

    @And("Staff gerekli randevu bilgilerini tamamlayip save e tiklar")
    public void staffGerekliRandevuBilgileriniTamamlayipSaveETiklar() {

        obje.prescription.sendKeys("yanık hasta");
        obje.description.sendKeys("yanıyorsun fuat abi");
        obje.saveButton.click();
    }

    @And("The appointmant is updated with identifier uyarisini gorur")
    public void theAppointmantIsUpdatedWithIdentifierUyarisiniGorur() {


        Assert.assertTrue(obje.successMessage.isDisplayed());


    }
}
