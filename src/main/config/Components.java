package config;

import operations.NavigationOperations;

/**
 * Class for automation components to pass into the driver
 */
public class Components {

    public NavigationOperations getNavigationOperations() {
        return new NavigationOperations();
    }

}
