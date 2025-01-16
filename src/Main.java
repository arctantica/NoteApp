public class Main {
    public static void main(String[] args) {
        AppManager appManager = AppManager.getInstance();
        appManager.initializeApp();
        appManager.login("Carolyn");
        System.out.println("App is running...");
        appManager.logout();

        switch (appManager.currentState){
            case "INIT":

                break;

            case "LOGGED_IN":
                break;

            case "LOGGED_OUT":
                break;

            case "LOADING":
                break;
        }
    }
}
