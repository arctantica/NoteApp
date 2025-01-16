public class AppManager {

    private static AppManager instance; //singleton
    private boolean isLoggedIn;
    private String currentUser;
    public String currentState;

    public static final String STATE_INIT = "INIT";
    public static final String STATE_LOGGED_IN = "LOGGED_IN";
    public static final String STATE_LOGOUT = "LOGOUT";
    public static final String STATE_LOGIN = "LOGIN";

    private boolean running;

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

        while (running){
            switch (currentState){
                case "INIT":
                    initializeApp();
                    break;

                case "LOGIN":
                    login("Carolyn");
                    break;

                case "LOGOUT":
                    logout();
                    break;
            }
        }

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
            System.out.println("User logged out.");
        }
    }

    //check current state
    public String getCurrentState() {
        return currentState;
    }

}

