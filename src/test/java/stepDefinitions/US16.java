package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPages;
import utilities.Driver;

import java.time.LocalDate;

public class US16 {

    MedunnaPages fatma3 = new MedunnaPages();

    @And("Room'e tiklanir FC.")
    public void roomETiklanirFC() {
        fatma3.room16.click();
    }

    @And("Create a new room'a tiklanir FC.")
    public void createANewRoomATiklanirFC() {
        fatma3.createANewRoom16.click();
    }

    String roomNumber;

    @And("Oda bilgileri doldurulur FC.")
    public void odaBilgileriDoldurulurFC() {

        roomNumber = Faker.instance().number().digits(5);
        fatma3.roomNumber16.sendKeys(roomNumber);
        Select select = new Select(fatma3.roomType16);
        select.selectByVisibleText("SUITE");
        fatma3.status16.click();
        fatma3.price16.sendKeys(Faker.instance().number().digits(4));
        fatma3.roomDescription16.sendKeys(Faker.instance().lorem().characters(20));

    }

    @And("SaveRoom butonuna tıklanır FC.")
    public void saveroomButonunaTiklanirFC() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma3.roomSave16);

    }

    @Then("Yeni oda olusturuldu yazisinin goruldugu test edilir FC.")
    public void yeniOdaOlusturulduYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma3.createSaveBasarili15.isDisplayed());

    }

    @And("Room number bos birakilir FC.")
    public void roomNumberBosBirakilirFC() {
        fatma3.roomNumber16.click();
        fatma3.roomType16.click();
    }

    @Then("This field is required yazisinin goruldugu test edilir FC.")
    public void thisFieldIsRequiredYazisininGorulduguTestEdilirFC() {
        Assert.assertTrue(fatma3.bosBirakilamaz16.isDisplayed());
    }

    @Then("Room type olarak TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE goruldugu test edilir FC.")
    public void roomTypeOlarakTWINDELUXEPREMIUM_DELUXESUITVeDAYCAREGorulduguTestEdilirFC() {
        Select select = new Select(fatma3.roomType16);
        for (WebElement w : select.getAllSelectedOptions()
        ) {

            Assert.assertTrue(w.isDisplayed());

        }

    }

    @Then("Status'un ayarlanabilir oldugu test edilir FC.")
    public void statusUnAyarlanabilirOlduguTestEdilirFC() {

        fatma3.status16.click();
        Assert.assertTrue(fatma3.status16.isSelected());

    }

    String price;

    @And("Price alani doldurulur FC.")
    public void priceAlaniDoldurulurFC() {

        price = Faker.instance().number().digits(5);
        fatma3.price16.sendKeys(price);
    }

    @Then("Price'ın eklendigi test edilir FC.")
    public void priceInEklendigiTestEdilirFC() {

        Assert.assertEquals(price, fatma3.price16.getAttribute("value"));

    }

    @And("Price alani boş birakilir FC.")
    public void priceAlaniBosBirakilirFC() {
        fatma3.price16.click();
        fatma3.roomDescription16.click();
    }

    @Then("Price'ın bos birakilmadıgı test edilir FC.")
    public void priceInBosBirakilmadigiTestEdilirFC() {
        Assert.assertTrue(fatma3.bosBirakilamaz16.isDisplayed());
    }

    @And("Description alaninin bos birakilir FC.")
    public void descriptionAlanininBosBirakilirFC() {
        fatma3.roomNumber16.sendKeys(Faker.instance().number().digits(7));
        fatma3.price16.sendKeys(Faker.instance().number().digits(4));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma3.roomSave16);

    }

    @Then("Description alaninin bos birakilabildigi test edilir FC.")
    public void descriptionAlanininBosBirakilabildigiTestEdilirFC() {

        Assert.assertTrue(fatma3.createSaveBasarili15.isDisplayed());

    }


    @Then("Tarihin gun ay yil seklinde oldugu test edilir FC.")
    public void tarihinGunAyYilSeklindeOlduguTestEdilirFC() {

        Assert.assertEquals(LocalDate.now().atTime(00, 00).toString(), fatma3.roomCreateDate16.getAttribute("value"));

    }

    @And("Room Type'a tiklanir FC.")
    public void roomTypeATiklanirFC() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma3.tabloRoomtype16);


    }

    @Then("Ayni tur odalarin gorulebildigi test edilir FC.")
    public void ayniTurOdalarinGorulebildigiTestEdilirFC() throws InterruptedException {

        Thread.sleep(3000);
        String roomType = fatma3.tabloRoomtypeIlk16.getText();

        for (int i = 0; i < fatma3.tabloRoomtypeAyniList16.size(); i++) {

            Assert.assertEquals(roomType, fatma3.tabloRoomtypeAyniList16.get(i).getText());

        }


    }

    @And("Room Edit'e tiklanir FC.")
    public void roomEditETiklanirFC() {

        fatma3.edit16.click();
    }

    @And("Odanin bilgileri düzenlenir FC.")
    public void odaninBilgileriDuzenlenirFC() {
        fatma3.price16.clear();
        fatma3.price16.sendKeys(Faker.instance().number().digits(4));
        fatma3.roomDescription16.clear();
        fatma3.roomDescription16.sendKeys(Faker.instance().lorem().characters(20));
    }

    @And("Save'e tiklanir FC.")
    public void saveETiklanirFC() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", fatma3.roomSave16);
        //fatma3.roomSave16.click();
    }

    @Then("Secilen odanin guncellendigi test edilir FC.")
    public void secilenOdaninGuncellendigiTestEdilirFC() {
        Assert.assertTrue(fatma3.createSaveBasarili15.isDisplayed());
    }

    @And("Secilen odanin delete butonuna tiklanir FC.")
    public void secilenOdaninDeleteButonunaTiklanirFC() throws InterruptedException {

        fatma3.delete16.click();
        Thread.sleep(3000);
        fatma3.deleteSure16.click();
    }

    @Then("Odanin silinebildigi test edilir FC.")
    public void odaninSilinebildigiTestEdilirFC() {

        Assert.assertTrue(fatma3.createSaveBasarili15.isDisplayed());
    }


}
