package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id="mat-input-0")           // common
    private WebElement username;
    @FindBy(id="mat-input-1")            // common
    private WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")        // common
    private WebElement loginButton;
    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")       // common
    private WebElement dashboard;
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(css = "[data-icon='pen-to-square']>path")         // common
    private WebElement editButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")         // common (sometimes)
    private WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")         // common (sometimes)
    private WebElement codeInput;
    @FindBy(xpath="//ms-save-button//button")                            // common
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")            // common
    private WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")          // common (sometimes)
    private WebElement shortName;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")                  // common (sometimes)
    private WebElement alreadyExist;
//    @FindBy(xpath = "//button[@aria-label='Close dialog']")
//    private WebElement closeDialog;
    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")          // common
    private WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")                     // common
    private WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")                         // common
    private WebElement deleteButton;
    @FindBy(xpath = "(//button[@class='consent-give'])[1]")             // common
    private WebElement acceptCookies;
    @FindBy(xpath = "//span[contains(text(),'Delete')]") //ry
    private WebElement deleteDialogBtn;
    @FindBy(css = "[data-icon='pen-to-square']") //ry
    private WebElement rEdit;
    @FindBy(css = "[data-placeholder='Capacity']") //ry
    private WebElement capacity;
    @FindBy(xpath = "//ms-edit-button//button")                         // inanc
    private WebElement SubjectEditButton;
    @FindBy(xpath = "//textarea[@formcontrolname='description']")                         // inanc
    private WebElement Description;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")                         // selim
    private WebElement Description2;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")                         // selim
    private WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")                         // selim
    private WebElement priority;
    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']//div//div")                         // inanc
    private WebElement Stage;
    @FindBy(css = "[class='mat-option-text']")                         // inanc
    private WebElement  studentRegistration ;
    @FindBy(css = "[data-icon='trash-can']>path")                         // inanc
    private WebElement  deleteButtonnn ;
    @FindBy(css = "[formcontrolname='order']>input")                         // inanc
    private WebElement  orderInput ;
    @FindBy(xpath = "//button[@type='submit']//span")                         // inanc
    private WebElement  deleteinanc ;
    @FindBy(css = "[id='ms-table-0_id']>div")                         // inanc
    private WebElement  siralama ;
    @FindBy(css = "[data-icon='plus']")                         // inanc
    private WebElement  fieldAdd ;
    @FindBy(css = "[data-placeholder='IBAN']")   //seda
    private WebElement ibanInput;
    @FindBy(xpath ="//ms-text-field[@formcontrolname='integrationCode']//input")   //seda
    private WebElement integrationInput;
  //  @FindBy(css = "[class='mat-select-arrow ng-tns-c93-84']")                       // seda
  //  private WebElement currencyInput;
    @FindBy(xpath = "(//mat-select[@formcontrolname='currency']//div//div//span)[1]")                       // seda
    private WebElement currencyInput;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[4]")                       // seda
    private WebElement currencyTRY;
    WebElement myElement;
    public void findAndSend(String strElement , String value) // 2. aşama
    {
        switch (strElement){
            case "username" :       myElement=  username;       break;
            case "password" :       myElement=  password;       break;
            case "nameInput" :      myElement=  nameInput;      break;
            case "codeInput" :      myElement=  codeInput;      break;
            case "shortName" :      myElement=  shortName;      break;
            case "searchInput" :    myElement=  searchInput;    break;
            case "capacity" :       myElement=  capacity;       break;
            case "Description" :    myElement=  Description;    break;
            case "orderInput" :     myElement=  orderInput;     break;
            case "Description2" :   myElement=  Description2;   break;
            case "integrationCode" :myElement=  integrationCode;break;
            case "priority" :       myElement=  priority;       break;
            case "ibanInput":       myElement=ibanInput;        break;
            case "integrationInput": myElement=integrationInput; break;

        }
        // burda string isimden webelemente ulaşıcam
        sendKeysFunction(myElement ,value);
    }
    public void findAndClick(String strElement ) // 2. aşama
    {
        switch (strElement){
            case "loginButton" :    myElement = loginButton; break;
            case "addButton" :      myElement = addButton; break;
            case "saveButton" :     myElement = saveButton; break;
            case "searchButton" :   myElement = searchButton; break;
            case "deleteButton" :   myElement = deleteButton; break;
            case "acceptCookies" :  myElement = acceptCookies; break;
            case "editButton" :     myElement = editButton; break;
            case "deleteDialogBtn" :     myElement = deleteDialogBtn; break;
            case "rEdit" :     myElement = rEdit; break;
            case "SubjectEditButton": myElement = SubjectEditButton;  break;
            case "Stage": myElement = Stage;  break;
            case "studentRegistration": myElement = studentRegistration;  break;
            case "deleteinanc": myElement = deleteinanc;  break;
            case "fieldAdd": myElement = fieldAdd;  break;
            case "currencyInput": myElement=currencyInput; break;
            case "currencyTRY": myElement=currencyTRY; break;
        }
        // burda string isimden webelemente ulaşıcam
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement , String text) // 2. aşama
    {
        switch (strElement){
            case "dashboard" :      myElement = dashboard; break;
            case "successMessage" : myElement = successMessage; break;
            case "alreadyExist" :   myElement = alreadyExist; break;
        }
        // burda string isimden webelemente ulaşıcam
        verifyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText) // 2. aşama
    {
        findAndSend("searchInput",searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

         WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
         wait.until(ExpectedConditions.stalenessOf(deleteButton));

        //GWD.Bekle(2);
        findAndClick("deleteButton"); // silme butonuna bas
        findAndClick("deleteDialogBtn"); // dialogdaki silme butonuna bas
    }
    public void SearchAndEditry(String searchText, String editName) {
        waitUntilSearch();
        findAndSend("searchInput",searchText);
        findAndClick("searchButton");
        waitUntilSearch();
        findAndClick("rEdit");
        findAndSend("nameInput",editName);
        findAndClick("saveButton");
    }


    public void SearchAndDeletery(String searchText){
        waitUntilSearch();
        findAndSend("searchInput",searchText);
        findAndClick("searchButton");
        waitUntilSearch();
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }
    public void SearchAndEdit(String searchText) // 2. aşama
    {
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas
        GWD.Bekle(3);
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.stalenessOf(deleteButton));

        findAndClick("SubjectEditButton"); // silme butonuna bas
    }

    public void searchAndDeleteIn(String searchText) { //inanc
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        GWD.Bekle(2);
        //waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteinanc");

    }
    public void searchAndClick(String searchText) { //inanc
        waitUntilSearch();
        //waitUntilLoading();
        findAndClick("fieldAdd");

    }




}
