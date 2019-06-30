package config;

import operations.NavigationOperations;
import operations.UserOperations;

/**
 * Class for automation components to pass into the driver
 */
public class Components {

    public NavigationOperations getNavigationOperations() {
        return new NavigationOperations();
    }

    public UserOperations getUserOperations() {
        return new UserOperations();
    }

}
