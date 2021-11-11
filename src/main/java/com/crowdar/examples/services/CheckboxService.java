package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CheckboxConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class CheckboxService {

    public static void verifyStateCheckbox(String statusCheckbox){
        MobileActionManager.getWait();
        Assert.assertFalse(MobileActionManager.getAttribute(CheckboxConstants.CHECKBOX_DARK_MODE_LOCATOR, "checked").equals(statusCheckbox));
    }

    public static void clickMenu(){
        MobileActionManager.waitVisibility(CheckboxConstants.MENU_LOCATOR);
        MobileActionManager.click(CheckboxConstants.MENU_LOCATOR);
    }

    public static void clickSettings(){
        MobileActionManager.waitVisibility(CheckboxConstants.SETTINGS_LOCATOR);
        MobileActionManager.click(CheckboxConstants.SETTINGS_LOCATOR);
    }

    public static void clickCheckbox(){
        MobileActionManager.click(CheckboxConstants.CHECKBOX_DARK_MODE_LOCATOR);
    }

}
