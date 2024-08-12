import java.util.Scanner;

public class ATB04_SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser Name");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

//INSTEAD OF IF, ELSE IF--WE CAN ALSO USE "SWITCH" TO MAKE IT EASIER
        switch (browserName) {
            case "chrome":
                System.out.println("Starting Chrome Browser");
                break;//BREAK IS USED, OTHERWISE ALL CODE WILL RUN.
            case "firefox":
                System.out.println("Starting the Firefox browser");
            break;
            default:
                System.out.println("NOT SUPPORTED");
                break;
        }


    }
}
