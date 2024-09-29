package sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        //in web automation
        //h browser you want to run the code
        // chrome --> execute chrome
        // firefox --> execute firefox
        // Edge --> execute edge cases
        String browser = "safari";
        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome browser");
                // further code to start the chrome
                // webdriver driver = new chrome(); // selenium code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // further code to start the firefox
                // webdriver driver = new firefox(); // selenium code
                break;
            case "edge":
                System.out.println("Starting the edge code");
                // further code to start the edge
                // webdriver driver = new edge(); // selenium code
                break;
            default:
                System.out.println("I have not idea which browser is this ");
                break;

        }
    }
}

