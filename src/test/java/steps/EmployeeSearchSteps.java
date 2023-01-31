package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {
    @When("user clicks on EmployeeList option")
    public void user_clicks_on_employee_list_option() {
        //   WebElement empListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        //  click(empListOption);
        click(dashboardPage.empListOption);
    }

    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {
        //    WebElement empIdField = driver.findElement(By.id("empsearch_id"));
        //    sendText(empIdField, "45154A");
        // sendText(empIdField, ConfigReader.getPropertyValue("empId"));
        sendText(employeeListPage.empSearchIdField, "44230A");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //  WebElement searchButton = driver.findElement(By.id("searchBtn"));
        //  click(searchButton);
        click(employeeListPage.searchButton);
    }

    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("Employee information can be seen");
    }

    // @When("user enters valid employee name")
    //public void user_enters_valid_employee_name() {
    // WebElement searchNameField = driver.findElement(By.id("empsearch_employee_name_empName"));
    // sendText(searchNameField, "dawggy");
    //sendText(employeeListPage.empSearchNameField, "ms");

    @Then("user clicks on the emp name")
    public void user_clicks_on_the_emp_name() {
        click(employeeListPage.clickonthenameofemployee);
    }

    @When("users click on employee details")
    public void users_click_on_employee_details() {
        click(employeeListPage.contactDtlOpt);

    }

    @Then("user click on Edit option")
    public void user_click_on_edit_option() {
        click(employeeListPage.EditOptn);

    }

        @When("users is able to check Address Street")
        public void users_is_able_to_check_address_street () {
        click(employeeListPage.Address1);
            sendText(employeeListPage.Address1,"hmmm");
          employeeListPage.Address1.isDisplayed();





        }
    }

