package main.automationtests;

import main.config.Components;
import main.config.WebDriverWrapper;

/**
 * Created by Steve on 6/26/2019.
 */
public class firstTestClass extends WebDriverWrapper {

    public static void main(String[] args) {
        Components component = new Components();
        ops.initOperations(component);

        ops.navOps.navigateToURL("https://login.stage.transloc.com/login/?next=https://architect.stage.transloc.com/");
        ops.navOps.login("qa_user_3", "n4km@XrhP4MA");

    }
}
