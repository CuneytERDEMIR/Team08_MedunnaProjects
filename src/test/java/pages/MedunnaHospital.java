package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaHospital {
    public MedunnaHospital(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath ="//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement enterButton;

    @FindBy(xpath ="//*[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath ="//*[@name='username']")
    public WebElement userName;

    @FindBy(xpath ="//*[@name='password']")
    public WebElement password;

    @FindBy(xpath ="//*[@class='btn btn-primary']")
    public WebElement signInButton2;

    @FindBy(xpath ="//*[@id='entity-menu']")
    public WebElement myPages;


    @FindBy(xpath ="//*[@class='svg-inline--fa fa-search fa-w-16 fa-fw ']")
    public WebElement searchPatient;

    @FindBy(xpath ="//*[@class='form-control']")
    public WebElement ssnSearchBox;

    @FindBy(xpath ="(//*[@class='btn btn-warning btn-sm'])[1]")
    public WebElement showAppointment;

    @FindBy(xpath ="//*[@class='btn btn-warning btn-sm']")
    public WebElement editButton;

    @FindBy(xpath ="//*[@id='appointment-prescription']")
    public WebElement prescription;

    @FindBy(xpath ="//*[@id='appointment-description']")
    public WebElement description;

    @FindBy(xpath ="//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath ="//*[@class='Toastify__toast-body']")
    public WebElement successMessage;

    @FindBy(xpath ="//*[@name='status']")
    public WebElement statusButton;

    @FindBy(xpath = "//*[@id='appointment-status']")
    public List<WebElement> statusList;

    @FindBy(xpath ="//*[text()='UNAPPROVED']")
    public WebElement unapproved;

    @FindBy(xpath ="//*[text()='PENDING']")
    public WebElement pending;

    @FindBy(xpath ="//*[text()='CANCELLED']")
    public WebElement cancelled;

    @FindBy(xpath ="//*[text()='COMPLETED']")
    public WebElement completed;

    @FindBy (xpath="//*[@id='appointment-physician']")
    public WebElement physician;


    @FindBy (xpath="(//*[@class='d-none d-md-inline'])[2]")
    public WebElement showTestButton;

    @FindBy (xpath = "//*[text()='523-52-5230']")
    public WebElement exceptedSsn;


    @FindBy (xpath="//*[@class='Toastify']")
    public WebElement successMessage2;

    @FindBy (xpath="//*[@href='/patient-appointments/318253']")
    public WebElement showAppointmentPeter;

    @FindBy (xpath = "//*[text()='Tests']")
    public WebElement testsScreen;

    @FindBy (xpath = "//*[@class='d-none d-md-inline']")
    public WebElement viewResultButton;

    @FindBy (xpath = "(//*[@class='hand'])[1]")
    public WebElement idTestResult;

    @FindBy (xpath = "(//*[@class='hand'])[3]")
    public WebElement resultTestResult;

    @FindBy (xpath = "(//*[@class='hand'])[6]")
    public WebElement descriptionTestResult;

    @FindBy (xpath = "(//*[@class='hand'])[7]")
    public WebElement dateTestResult;

    @FindBy (xpath = "(//*[@class='d-none d-md-inline'])[1]")
    public WebElement albuminEdit;

    @FindBy (xpath = "//*[@id='c-test-result-result']")
    public WebElement resultTextBox;

    @FindBy (xpath = "//*[@id='save-entity']")
    public WebElement saveTestResult;

    @FindBy (xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement successUpdated;

    @FindBy (xpath = "//*[text()='Payment / Invoice Process']")
    public WebElement paymentInvoice;

    @FindBy(xpath = "//thead//tbody//tr")
    public List<WebElement> coastList;

    @FindBy (xpath = "(//tbody//tr[1])[2]")
    public WebElement totalPrice;

    @FindBy (xpath = "//*[@class='btn btn-danger btn-sm']")
    public WebElement createinvoice;

    @FindBy (xpath = "//*[@class='btn btn-success btn-sm']")
    public WebElement showInvoice;

    @FindBy (xpath = "//*[text()='INVOICE']")
    public WebElement invoiceTitle;













}
