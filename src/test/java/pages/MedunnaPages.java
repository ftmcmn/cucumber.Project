package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
    @FindBy(xpath = "//span[text()='Patient']")    public WebElement patientViewTrue9;
    @FindBy(xpath = "//span[text()='Edit']")    public WebElement patientEdit9;
    @FindBy(xpath = "//span[text()='Show Appointments']")    public WebElement patientShowAppointments9;
    @FindBy(xpath = "//h2[text()='Appointments']")    public WebElement patientShowAppointmentsTrue9;
    @FindBy(xpath = "//span[text()='Save']")    public WebElement patientEditSave9;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")    public WebElement patientEditSaveBasarili9;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement patientEditFirstname9;
    @FindBy(xpath = "//input[@name='email']")    public WebElement patientEditEmail9;
    @FindBy(xpath = "//input[@name='phone']")    public WebElement patientEditPhone9;




}
