package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.TaskConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class AddTaskService {

    public static void getWait(){
        MobileActionManager.getWait();
    }

    public static void clickProject(){
        getWait();
        MobileActionManager.click(TaskConstants.PROJECT_FLUBER_LOCATOR);
    }

    public static void clickTasks(){
        getWait();
        MobileActionManager.click(TaskConstants.TASK_FLUBER_LOCATOR);
    }

    public static void clickAddTask(){
        getWait();
        MobileActionManager.click(TaskConstants.ADD_TASK_LOCATOR);
    }

    public static void inputNameTask(String nameTask){
        getWait();
        MobileActionManager.setInput(TaskConstants.INPUT_TASK_LOCATOR, nameTask);
    }

    public static void clickSaveTask(){
        getWait();
        MobileActionManager.click(TaskConstants.SAVE_TASK_LOCATOR);
    }

    public static void clickSaveProject(){
        getWait();
        MobileActionManager.click(TaskConstants.END_SAVE_TASK_LOCATOR);
    }

    public static void verifyTask(String task){
        MobileActionManager.waitVisibility(TaskConstants.VERIFY_TASK_LOCATOR);
        Assert.assertTrue(MobileActionManager.getAttribute(TaskConstants.VERIFY_TASK_LOCATOR, "text").equals(task));
    }
}
