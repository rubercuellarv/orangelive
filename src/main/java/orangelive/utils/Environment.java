package orangelive.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Environment class.
 */
public final class Environment {
    private static final String BASE_URL = "singInUrl";
    private static final String TIMEOUT = "timeout";
    private static final String AUTHENTICATION_BROWSER = "browser";
    private static final String USERNAME = "username";
    private static final String PASS = "password";
    private static Environment instance;
    private Properties userProperties;


    /**
     * Private constructor.
     */
    private Environment() {

        try (FileInputStream fileInputStream = new FileInputStream("user.properties")) {
            userProperties = new Properties();
            userProperties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    /**
     * The method returns the instance of the class.
     *
     * @return a Environment instance.
     */
    public static Environment getInstance() {
        if (instance == null) {
            instance = new Environment();
        }
        return instance;
    }

    /**
     * Get the properties of the file.
     *
     * @param env string name of property setting.
     * @return String that is a property
     */
    public String getEnv(final String env) {
        String property = System.getProperty(env);
        if (property == null) {
            return userProperties.getProperty(env);
        }
        return property;
    }

    /**
     * @return int this is a time
     */
    public int getTimeout() {
        return Integer.parseInt(getEnv(TIMEOUT));
    }

    /**
     * Get the base url of pivotal tracker.
     *
     * @return String url.
     */
    public String getBaseUrl() {
        return getEnv(BASE_URL);
    }

    /**
     * Method that return the password.
     *
     * @return String password of user.
     */
    public String getPassword() {
        return getEnv(PASS);
    }

    /**
     * Method return the username of user.
     *
     * @return String get username
     */
    public String getUser() {
        return getEnv(USERNAME);
    }

    /**
     * Get the timeout.
     *
     * @return String with the configure timeout.
     */
    public String getBrowser() {
        return getEnv(AUTHENTICATION_BROWSER);
    }

}
