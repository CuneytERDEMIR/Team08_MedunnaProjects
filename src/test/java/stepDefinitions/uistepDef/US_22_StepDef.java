package stepDefinitions.uistepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaHospital;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22_StepDef {
    MedunnaHospital obje=new MedunnaHospital();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Staff url adresine gider")
    public void staffUrlAdresineGider() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        obje.enterButton.click();
        obje.signInButton.click();
        obje.userName.sendKeys("kullaniciAdi");
        obje.password.sendKeys("sifre");
        obje.signInButton2.click();
        Thread.sleep(3000);
    }

    @When("Staff {string} butonundan randevularini goruntuler")
    public void staffButonundanRandevulariniGoruntuler(String arg0) throws InterruptedException {
        obje.myPages.click();
        ReusableMethods.waitFor(3);
        obje.searchPatient.click();
        Thread.sleep(2000);
    }

    @Then("Staff test sonucunu gormek istedigi hastanin SSN ini girer")
    public void staffTestSonucunuGormekIstedigiHastaninSSNIniGirer() {

        obje.ssnSearchBox.sendKeys("ssnOlivia");
        ReusableMethods.waitFor(2);
    }

    @And("Staff Patient SSN ID ile arama yapabildigini dogrular")
    public void staffPatientSSNIDIleAramaYapabildiginiDogrular() {
        String actualSsn="ssnOlivia";

        Assert.assertEquals("you have a invalid SSN",obje.exceptedSsn.getText(),actualSsn);
    }

    @Then("Staff Show Appointment i tiklar")
    public void staffShowAppointmentITiklar() throws InterruptedException {
        obje.ssnSearchBox.sendKeys("ssnPeter");
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.ARROW_RIGHT).perform();
        ReusableMethods.waitFor(2);
        obje.showAppointmentPeter.click();
        ReusableMethods.waitFor(2);
    }

    @And("Staff Show Tests butonuna tiklar")
    public void staffShowTestsButonunaTiklar() {
        obje.showTestButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("Staff acilan sayfada Test Result in gorunulurlugunu dogrular")
    public void staffAcilanSayfadaTestResultInGorunulurlugunuDogrular() {
        Assert.assertTrue(obje.testsScreen.isDisplayed()) ;
    }

    @Then("Staff Show Tests butonundan test sonuclarini goruntuler")
    public void staffShowTestsButonundanTestSonuclariniGoruntuler() {
        obje.ssnSearchBox.sendKeys("ssnPeter");
        ReusableMethods.waitFor(3);
        obje.showAppointmentPeter.click();
        ReusableMethods.waitFor(2);
        obje.showTestButton.click();
        ReusableMethods.waitFor(2);
        obje.viewResultButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Staff Test Result da id, date, result, description i dogrular")
    public void staffTestResultDaIdDateResultDescriptionIDogrular() {
        Assert.assertTrue(obje.idTestResult.isDisplayed());
        Assert.assertTrue(obje.resultTestResult.isDisplayed());
        Assert.assertTrue(obje.descriptionTestResult.isDisplayed());
        Assert.assertTrue(obje.dateTestResult.isDisplayed());

    }

    @And("Staff test result sonuclarinin edit ve save butonlarina tiklar")
    public void staffTestResultSonuclarininEditVeSaveButonlarinaTiklar() {
        obje.albuminEdit.click();
        obje.resultTextBox.clear();
        ReusableMethods.waitFor(2);
        obje.resultTextBox.sendKeys("Albumin tavan");
        ReusableMethods.waitFor(2);
        obje.saveTestResult.click();

    }

    @Then("Staff {string} i goruntuler")
    public void staffIGoruntuler(String arg0) {

        obje.successUpdated.isDisplayed();
    }
}
