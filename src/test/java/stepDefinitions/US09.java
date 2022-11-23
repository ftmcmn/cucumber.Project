package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US09 {

    MedunnaPages medunnaPages = new MedunnaPages();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @And("sayfa {int} saniye bekletilir.")
    public void sayfaSaniyeBekletilir(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Given("Belirtilen url'e gidilir.")
    public void belirtilenUrlEGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Giris icon'una tiklanir.")
    public void girisIconUnaTiklanir() {
        medunnaPages.login.click();
    }

    @And("Sign in'e tiklanir.")
    public void signInETiklanir() {
        medunnaPages.logSignin.click();
    }

    @And("Personel username girilir.")
    public void personelUsernameGirilir() {
        medunnaPages.signinUsername.sendKeys(ConfigReader.getProperty("staffUsername"));
    }

    @And("Personel password girilir.")
    public void personelPasswordGirilir() {
        medunnaPages.signinPassword.sendKeys(ConfigReader.getProperty("staffPassword"));
    }

    @And("Sign in butonuna tiklanir.")
    public void signInButonunaTiklanir() {
        medunnaPages.signInButton.click();
    }

    @And("My pages'a tiklanir.")
    public void myPagesATiklanir() {
        medunnaPages.dropDownMyPages.click();
    }

    @And("Search patient'e tiklanir.")
    public void searchPatientETiklanir() {
        medunnaPages.dropDownMyPagesSearchPatient.click();
    }

    @And("Patient ssn box'a ssn girilir.")
    public void patientSsnBoxASsnGirilir() {
        medunnaPages.patientSSNBox.sendKeys(ConfigReader.getProperty("hastaSSN"));
    }

    @And("View'e tiklanir.")
    public void viewETiklanir() {

        medunnaPages.patientView.click();

    }

    @Then("Hasta bilgilerinin goruldugu test edilir.")
    public void hastaBilgilerininGorulduguTestEdilir() {
        Assert.assertTrue(medunnaPages.patientViewTrue.isDisplayed());
    }

    @And("Edit butonuna tiklanir.")
    public void editButonunaTiklanir() {
        medunnaPages.patientEdit.click();
    }

    @And("firstname lastname birthdate email phone gender blood group address description user country and state city bilgileri duzenlenir.")
    public void firstnameLastnameBirthdateEmailPhoneGenderBloodGroupAddressDescriptionUserCountryAndStateCityBilgileriDuzenlenir() throws InterruptedException {

        medunnaPages.patientEditFirstname.clear();
       /* actions.click(medunnaPages.patientEditFirstname).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("25").sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB)
                .sendKeys("f").sendKeys(Keys.TAB).sendKeys("b").sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(10)).sendKeys(Keys.TAB)
                .click().sendKeys("s").sendKeys(Keys.TAB).sendKeys("a")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();*/
        actions.click(medunnaPages.patientEditFirstname).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("20").perform();
        Thread.sleep(2000);
        medunnaPages.patientEditEmail.clear();
        medunnaPages.patientEditEmail.sendKeys(faker.internet().emailAddress());
        medunnaPages.patientEditPhone.clear();
        medunnaPages.patientEditPhone.sendKeys("2589631265");
        actions.sendKeys(Keys.TAB).
                sendKeys("F").sendKeys(Keys.TAB).sendKeys("b").sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(10)).sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(15)).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

    }

    @And("Save butonuna tiklanir.")
    public void saveButonunaTiklanir() {
        actions.click(medunnaPages.patientEditSave);
    }

    @Then("firstname lastname birthdate email phone gender blood group address description user country and state city bilgilerin düzenlenebildigi test edilir.")
    public void firstnameLastnameBirthdateEmailPhoneGenderBloodGroupAddressDescriptionUserCountryAndStateCityBilgilerinDuzenlenebildigiTestEdilir() {
        Assert.assertTrue(medunnaPages.patientEditSaveBasarili.isDisplayed());
    }

    @And("Ssn girilerek aranabildiği test edilir.")
    public void ssnGirilerekAranabildigiTestEdilir() {
        medunnaPages.patientSSNBox.sendKeys(ConfigReader.getProperty("hastaSSN"));

    }

    @And("Show Appointments'e tiklanir.")
    public void showAppointmentsETiklanir() {

        medunnaPages.patientShowAppointments.click();

    }

    @Then("Tum kayit bilgilerinin dolduruldugu test edilir.")
    public void tumKayitBilgilerininDoldurulduguTestEdilir() {
        Assert.assertTrue(medunnaPages.patientShowAppointmentsTrue.isDisplayed());

    }

    @And("Sayfa kapatilir.")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }
}
