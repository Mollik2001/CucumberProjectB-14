package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement empSearchIdField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement empSearchNameField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(linkText ="Azeddine M")
    public WebElement clickonthenameofemployee;
    @FindBy(id = "btnSave")
    public WebElement EditOptn;

    @FindBy(id = "contact_street1")
    public WebElement Address1;

    @FindBy(linkText = "Contact Details")
    public WebElement contactDtlOpt;






    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }
}
