package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    @FindBy(xpath ="//*[text()='MY PAGES']")
    public WebElement myPages;


    @FindBy(xpath ="//*[@data-icon='search']")
    public WebElement searchPatient;

    @FindBy(xpath ="//*[@name='ssn']")
    public WebElement ssnSearchBox;

    @FindBy(xpath ="//*[text()='Show Appointments']")
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

    @FindBy(xpath ="//*[@class='btn btn-warning btn-sm']")
    public WebElement editBlutton;












}
