package main.config;

import operations.NavigationOperations;

/**
 * Created by Steve on 6/26/2019.
 */
public class Components {

    public NavigationOperations getNavigationOperations() {
        return new NavigationOperations();
    }
}
