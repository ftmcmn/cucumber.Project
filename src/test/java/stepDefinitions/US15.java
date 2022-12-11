package stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPages;
import utilities.Driver;

import java.time.LocalDate;

public class US15 {

    MedunnaPages fatma2=new MedunnaPages();
    Faker faker=new Faker();

    @And("Yonetici username girilir FC.")
    public void yoneticiUsernameGirilirFC() {
        fatma2.signinUsername9.sendKeys("team12");
    }

    @And("Yonetici password girilir FC.")
    public void yoneticiPasswordGirilirFC() {
        fatma2.signinPassword9.sendKeys("team12B81");
    }

    @And("Items&Titles'a tiklanir FC.")
    public void itemsTitlesATiklanirFC() {
        fatma2.itemTitles15.click();
    }

    @And("Patient'e tiklanir FC.")
    public void patientETiklanirFC() {
        fatma2.patient15.click();
    }

    @And("Create a new patient'e tiklanir FC.")
    public void createANewPatientETiklanirFC() {
        fatma2.createANewPatient15.click();
    }

    @Then("Create or edit a Patient yazisinin goruldugu test edilir FC.")
    public void createOrEditAPatientYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createOrEditText15.isDisplayed());
    }

    @Then("SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,Description, Created Date, User, Country and state City gibi hasta bilgilerinin goruldugu test edilir FC.")
    public void ssnFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryAndStateCityGibiHastaBilgilerininGorulduguTestEdilirFC() {
        for (WebElement w:fatma2.basliklar15
             ) {
            Assert.assertTrue(w.isDisplayed());

        }

    }

    @And("Istenen hasta bilgileri girilir FC.")
    public void istenenHastaBilgileriGirilirFC() throws InterruptedException {
        fatma2.createFirstname15.sendKeys(faker.name().firstName());
        fatma2.createLastname15.sendKeys(faker.name().lastName());
        fatma2.createBirthDate15.sendKeys("04.12.2000 20:00");
        fatma2.createEmail15.sendKeys(faker.internet().emailAddress());
        fatma2.createPhone15.sendKeys("5558964178");
        Select select=new Select(fatma2.createGender15);
        select.selectByValue("FEMALE");
        Thread.sleep(3000);
        Select select1=new Select(fatma2.createBloodGroup15);
        select1.selectByVisibleText("AB+");
        fatma2.createAdress15.sendKeys(faker.address().fullAddress());
        fatma2.createDescription15.sendKeys(faker.lorem().characters(20));
        Thread.sleep(3000);
        Select select2=new Select(fatma2.createCountry15);
        select2.selectByVisibleText("USA");
        Thread.sleep(3000);
        Select select3=new Select(fatma2.createState15);
        select3.selectByVisibleText("California");

    }

    @And("Save butonuna tıklanır FC.")
    public void saveButonunaTiklanirFC() throws InterruptedException {
        Thread.sleep(3000);
        fatma2.createSave15.click();
    }

    @Then("Hasta oluturuldu yazinin görundugu test edilir FC.")
    public void hastaOluturulduYazininGorunduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }

    @And("Edit'e tiklanir FC.")
    public void editETiklanirFC() {
        //Driver.getDriver().get("https://medunna.com/staff/367707/edit");
        fatma2.edit15.click();
    }

    @And("Hasta bilgileri guncellenir FC.")
    public void hastaBilgileriGuncellenirFC() throws InterruptedException {
        Select select=new Select(fatma2.createCountry15);
        select.selectByVisibleText("USA");
        Select select1=new Select(fatma2.createState15);
        select1.selectByVisibleText("California");
        Thread.sleep(3000);

    }

    @And("Hastanin güncellendigi yazinin görundugu test edilir FC.")
    public void hastaninGuncellendigiYazininGorunduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }

    @Then("Country ve Us state seceneklerinin oldugu test edilir FC.")
    public void countryVeUsStateSeceneklerininOlduguTestEdilirFC() {

        Assert.assertTrue(fatma2.createCountry15.isDisplayed());
        Assert.assertTrue(fatma2.createState15.isDisplayed());
    }

    @And("Delete'e tiklanir FC.")
    public void deleteETiklanirFC() throws InterruptedException {
        fatma2.delete15.click();
        Thread.sleep(3000);
        fatma2.deleteSure15.click();
    }

    @Then("Hasta silindi yazisinin goruldugu test edilir FC.")
    public void hastaSilindiYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma2.createSaveBasarili15.isDisplayed());
    }
}
