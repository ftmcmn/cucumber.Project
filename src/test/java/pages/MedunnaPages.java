package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPages {
    public MedunnaPages() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement logSignin;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement signinUsername;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement signinPassword;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement dropDownMyPages;

   @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement dropDownMyPagesSearchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSSNBox;

    @FindBy(xpath = "//span[text()='View']")
    public WebElement patientView;

    @FindBy(xpath = "//span[text()='Patient']")
    public WebElement patientViewTrue;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement patientEdit;

    @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement patientShowAppointments;

    @FindBy(xpath = "//h2[text()='Appointments']")
    public WebElement patientShowAppointmentsTrue;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement patientEditSave;

    @FindBy(xpath = "//div[text()='A Patient is updated with identifier 328526']")
    public WebElement patientEditSaveBasarili;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement patientEditFirstname;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement patientEditEmail;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement patientEditPhone;








}
