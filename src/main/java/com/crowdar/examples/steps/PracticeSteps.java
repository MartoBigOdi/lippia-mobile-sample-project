package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.AddTaskService;
import com.crowdar.examples.services.CheckboxService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class PracticeSteps extends PageSteps {

    @Given("The app is loaded correctly")
    @Then("Login page is displayed")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user goes to the Log in page")
    public void goToLogin() {
        MobileActionManager.click(LoginConstants.LOG_IN_BUTTON_LOCATOR);
    }

    @When("The user logs in the application with: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

    @Then("Login Ok")
    public void LoginOk() {
        LoginService.verifyLogIn();
    }


    @When("The user clicks menu")
    public void theUserClicksSettingsMenu() {
        CheckboxService.clickMenu();
    }

    @And("The user clicks settings")
    public void theUserClicksSettings() {
        CheckboxService.clickSettings();
    }


    @And("the user clicks darkmode")
    public void theUserClickDarkmode() {
        CheckboxService.clickCheckbox();
    }


    @Then("verify checkbox status (.*)")
    public void verifyCheckboxStatus(String status) {
        CheckboxService.verifyStateCheckbox(status);
    }


    @When("The user clicks the project")
    public void theUserClicksTheProject() {
        AddTaskService.clickProject();
    }


    @And("The user clicks Tasks")
    public void theUserClicksTasks() {
        AddTaskService.clickTasks();
    }


    @And("The user clicks add task")
    public void theUserClicksAddTask() {
        AddTaskService.clickAddTask();
    }


    @When("The user enters the name of the (.*)$")
    public void theUserEntersTheNameOfTheNameTask(String nameTask) {
        AddTaskService.inputNameTask(nameTask);
    }


    @And("The user clicks add")
    public void theUserClicksAdd() {
        AddTaskService.clickSaveTask();
    }


    @And("The user clicks save")
    public void theUserClicksSave() {
        AddTaskService.clickSaveProject();
    }


    @Then("verify the name (.*)")
    public void verifyTheNameTaskTask(String task) {
        AddTaskService.verifyTask(task);
    }
}
