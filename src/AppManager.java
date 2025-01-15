public class AppManager {

    private static AppManager instance; //singleton
    private boolean isLoggedIn;
    private String currentUser;
    public String currentState;

    public static final String STATE_INIT = "INIT";
    public static final String STATE_LOGGED_IN = "LOGGED_IN";
    public static final String STATE_LOGGED_OUT = "LOGGED_OUT";
    public static final String STATE_LOADING = "LOADING";

    //private constructor to prevent multiple instances are created
    private AppManager() {
        isLoggedIn = false;
        currentUser = "";
        currentState = "INIT";
    }

    //singleton pattern
    public static AppManager getInstance() {
        if (instance == null) {
            instance = new AppManager();
        }
        return instance;
    }

    // Initialize app
    public void initializeApp() {
        System.out.println("App is initializing...");
        currentState = "LOADING";
    }

    //user login handler
    public void login(String username) {
        if (!isLoggedIn) {
            isLoggedIn = true;
            currentUser = username;
            currentState = "LOGGED_IN";
            System.out.println("User logged in: " + username);
        }
    }

    //user logout handler
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            currentUser = "";
            currentState = "LOGGED_OUT";
            System.out.println("User logged out.");
        }
    }

    //check current state
    public String getCurrentState() {
        return currentState;
    }
}

