# TranslocAutomation

Hello! 

This framework is built in Java and uses Gradle to bring in dependencies for Selenium, Cucumber, and TestNG.
The main class for our autmoation in general is the WebDriverWrapper class which is how we access Selenium WebDriver for our tests. This kicks off our automation instance which has access to navigation methods, keeping our test classes clean while also maintaining a structure for easier refactoring if neccesary in the future. These navigation methods also give us the opportunity to reuse the same code across multiple tests (for things like login, URL navigation, and flowing through different functionalities).

Each test class is run using TestNG which gives us lots of options and capabilities for automation testing. 
