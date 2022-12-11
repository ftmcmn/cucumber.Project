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
        medunnaPages.logSignin9.click();
    }

    @And("Personel username girilir.")
    public void personelUsernameGirilir() {
        medunnaPages.signinUsername9.sendKeys(ConfigReader.getProperty("staffUsername"));
    }

    @And("Personel password girilir.")
    public void personelPasswordGirilir() {
        medunnaPages.signinPassword9.sendKeys(ConfigReader.getProperty("staffPassword"));
    }

    @And("Sign in butonuna tiklanir.")
    public void signInButonunaTiklanir() {
        medunnaPages.signInButton9.click();
    }

    @And("My pages'a tiklanir.")
    public void myPagesATiklanir() {
        medunnaPages.dropDownMyPages9.click();
    }

    @And("Search patient'e tiklanir.")
    public void searchPatientETiklanir() {
        medunnaPages.dropDownMyPagesSearchPatient9.click();
    }

    @And("Patient ssn box'a ssn girilir.")
    public void patientSsnBoxASsnGirilir() {
        medunnaPages.patientSSNBox9.sendKeys(ConfigReader.getProperty("hastaSSN"));
    }

    @And("View'e tiklanir.")
    public void viewETiklanir() {

        medunnaPages.patientView9.click();

    }

    @Then("Hasta bilgilerinin goruldugu test edilir.")
    public void hastaBilgilerininGorulduguTestEdilir() {
        Assert.assertTrue(medunnaPages.patientViewTrue9.isDisplayed());
    }

    @And("Edit butonuna tiklanir.")
    public void editButonunaTiklanir() {
        medunnaPages.patientEdit9.click();
    }

    @And("firstname lastname birthdate email phone gender blood group address description user country and state city bilgileri duzenlenir.")
    public void firstnameLastnameBirthdateEmailPhoneGenderBloodGroupAddressDescriptionUserCountryAndStateCityBilgileriDuzenlenir() throws InterruptedException {

        medunnaPages.patientEditFirstname9.clear();
       /* actions.click(medunnaPages.patientEditFirstname).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("25").sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB)
                .sendKeys("f").sendKeys(Keys.TAB).sendKeys("b").sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(10)).sendKeys(Keys.TAB)
                .click().sendKeys("s").sendKeys(Keys.TAB).sendKeys("a")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();*/
        actions.click(medunnaPages.patientEditFirstname9).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).perform();
        Thread.sleep(2000);
        medunnaPages.patientEditEmail9.clear();
        medunnaPages.patientEditEmail9.sendKeys(faker.internet().emailAddress());
        medunnaPages.patientEditPhone9.clear();
        medunnaPages.patientEditPhone9.sendKeys("2589631265");
        actions.sendKeys(Keys.TAB).
                sendKeys("F").sendKeys(Keys.TAB).sendKeys("b").sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(10)).sendKeys(Keys.TAB)
                .sendKeys(faker.lorem().characters(15)).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

    }

    @And("Save butonuna tiklanir.")
    public void saveButonunaTiklanir() throws InterruptedException {
        actions.click(medunnaPages.patientEditSave9);
        Thread.sleep(2000);
    }

    @Then("firstname lastname birthdate email phone gender blood group address description user country and state city bilgilerin düzenlenebildigi test edilir.")
    public void firstnameLastnameBirthdateEmailPhoneGenderBloodGroupAddressDescriptionUserCountryAndStateCityBilgilerinDuzenlenebildigiTestEdilir() throws InterruptedException {
        Thread.sleep(2000);
       Assert.assertTrue(medunnaPages.patientEditSaveBasarili9.isDisplayed());
    }

    @And("Ssn girilerek aranabildiği test edilir.")
    public void ssnGirilerekAranabildigiTestEdilir() throws InterruptedException {
        Thread.sleep(2000);
        medunnaPages.patientSSNBox9.sendKeys(ConfigReader.getProperty("hastaSSN"));

    }

    @Then("Tum kayit bilgilerinin dolduruldugu test edilir.")
    public void tumKayitBilgilerininDoldurulduguTestEdilir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(medunnaPages.patientViewTrue9.isDisplayed());

    }

    @And("Sayfa kapatilir.")
    public void sayfaKapatilir() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
