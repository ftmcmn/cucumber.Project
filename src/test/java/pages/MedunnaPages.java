package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaPages {
    public MedunnaPages() {
        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")    public WebElement login;
    @FindBy(xpath = "//*[@id='login-item']")    public WebElement logSignin9;
    @FindBy(xpath = "//*[@name='username']")    public WebElement signinUsername9;
    @FindBy(xpath = "//*[@name='password']")    public WebElement signinPassword9;
    @FindBy(xpath = "(//span[text()='Sign in'])[3]")    public WebElement signInButton9;
    @FindBy(xpath = "//span[text()='MY PAGES']")    public WebElement dropDownMyPages9;
   @FindBy(xpath = "//span[text()='Search Patient']")    public WebElement dropDownMyPagesSearchPatient9;
    @FindBy(xpath = "//input[@name='ssn']")    public WebElement patientSSNBox9;
    @FindBy(xpath = "//span[text()='View']")    public WebElement patientView9;
    @FindBy(xpath = "//span[text()='Patients']")    public WebElement patientViewTrue9;
    @FindBy(xpath = "//span[text()='Edit']")    public WebElement patientEdit9;
    @FindBy(xpath = "//span[text()='Show Appointments']")    public WebElement patientShowAppointments9;
    @FindBy(xpath = "//h2[text()='Appointments']")    public WebElement patientShowAppointmentsTrue9;
    @FindBy(xpath = "//span[text()='Save']")    public WebElement patientEditSave9;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")    public WebElement patientEditSaveBasarili9;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement patientEditFirstname9;
    @FindBy(xpath = "//input[@name='email']")    public WebElement patientEditEmail9;
    @FindBy(xpath = "//input[@name='phone']")    public WebElement patientEditPhone9;
    @FindBy(xpath = "//span[text()='Items&Titles']")    public WebElement itemTitles15;
    @FindBy(xpath = "//span[text()='Patient']")    public WebElement patient15;
    @FindBy(xpath = "//span[text()='Create a new Patient']")    public WebElement createANewPatient15;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-patient']")    public WebElement deleteSure15;
    @FindBy(xpath = "//span[text()='Create or edit a Patient']")    public WebElement createOrEditText15;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement createFirstname15;
    @FindBy(xpath = "//input[@name='lastName']")    public WebElement createLastname15;
    @FindBy(xpath = "//input[@name='birthDate']")    public WebElement createBirthDate15;
    @FindBy(xpath = "//input[@name='email']")    public WebElement createEmail15;
    @FindBy(xpath = "//input[@name='phone']")    public WebElement createPhone15;
    @FindBy(xpath = "//select[@name='gender']")    public WebElement createGender15;
    @FindBy(xpath = "//select[@name='bloodGroup']")    public WebElement createBloodGroup15;
    @FindBy(xpath = "//input[@name='adress']")    public WebElement createAdress15;
    @FindBy(xpath = "//textarea[@name='description']")    public WebElement createDescription15;
    @FindBy(xpath = "//select[@name='country.id']")    public WebElement createCountry15;
    @FindBy(xpath = "//select[@name='cstate.id']")    public WebElement createState15;
    @FindBy(xpath = "//*[text()='Save']")    public WebElement createSave15;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")    public WebElement createSaveBasarili15;
    @FindBy(xpath = "//*[text()='542-59-8193']/following-sibling::td[14]/div/a[2]")    public WebElement edit15;
    @FindBy(xpath = "//*[text()='647-52-4303']/following-sibling::td[14]/div/a[3]")    public WebElement delete15;
    @FindBy(xpath = "//thead/tr/th")    public List<WebElement> basliklar15;
    @FindBy(xpath = "(//*[text()='Room'])[1]")    public WebElement room16;
    @FindBy(xpath = "//*[text()='17352']/following-sibling::td[6]/div/a[3]")    public WebElement delete16;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-room']")    public WebElement deleteSure16;
    @FindBy(xpath = "//*[text()='274137']/following-sibling::td[6]/div/a[2]")    public WebElement edit16;
    @FindBy(xpath = "//span[text()='Create a new Room']")    public WebElement createANewRoom16;
    @FindBy(xpath = "//input[@name='roomNumber']")    public WebElement roomNumber16;
    @FindBy(xpath = "//*[@name='roomType']")    public WebElement roomType16;
    @FindBy(xpath = "//*[@name='status']")    public WebElement status16;
    @FindBy(xpath = "//*[@name='price']")    public WebElement price16;
    @FindBy(xpath = "//*[@id='room-description']")    public WebElement roomDescription16;
    @FindBy(xpath = "//*[@id='room-createdDate']")    public WebElement roomCreateDate16;
    @FindBy(xpath = "//span[text()='Save']")    public WebElement roomSave16;
    @FindBy(xpath = "(//div[text()='This field is required.'])[1]")    public WebElement bosBirakilamaz16;
    @FindBy(xpath = "//*[text()='Room Type']")    public WebElement tabloRoomtype16;
    @FindBy(xpath = "(//tbody/tr/td[3])[1]")    public WebElement tabloRoomtypeIlk16;
    @FindBy(xpath = "//tbody/tr/td[3]")    public List<WebElement> tabloRoomtypeAyniList16;






}
