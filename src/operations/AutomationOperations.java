package operations;

import main.config.Components;

/**
 * This class serves as a head object for all operations that a test can use
 */
public class AutomationOperations {
    public Components components = new Components();

    private static class SingletonHelper {
        private static final AutomationOperations INSTANCE = new AutomationOperations();
    }
    public static AutomationOperations instance() {
        return SingletonHelper.INSTANCE;
    }

    public NavigationOperations navOps = components.getNavigationOperations();

    public void initOperations(Components components) {
        this.components = components;
        //This is where we initialize our components such as navOps, userOps, browser type, assertions, resource locator, etc.

        navOps = components.getNavigationOperations();
    }

}
