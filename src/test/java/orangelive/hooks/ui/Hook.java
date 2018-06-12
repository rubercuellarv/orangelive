package orangelive.hooks.ui;

import cucumber.api.java.Before;
import orangelive.selenium.pages.LogIn;
import orangelive.utils.Environment;

/**
 * Hooks for UI.
 */
public class Hook {

    private static final
    Environment ENVIRONMENT = Environment.getInstance();

    /**
     * Login hook.
     */
    @Before("@login")
    public void login() {
        LogIn.login(ENVIRONMENT.getUser(), ENVIRONMENT.getPassword());

    }
}
