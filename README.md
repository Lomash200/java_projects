# java_projects
This repository contains the code for a simple login and sign-up application written in Java. It demonstrates the implementation of interfaces, user input handling, and basic authentication logic.
import java.util.Scanner;
import java.util.Random;

interface Login {
    void log();
}

interface Pin {
    int generatePin();
}

class App implements Login, Pin {
    String u, p;
    String user, pass;
    int pin, r, cp, i;

    public void log() {
        Scanner ip = new Scanner(System.in);
        System.out.println("<---- Welcome to App ---->");
        System.out.println("FOR SIGN UP, PRESS 1");
        System.out.println("FOR LOG IN, PRESS 2");
        System.out.println("Enter your choice:");
        int choice = ip.nextInt();
        ip.nextLine(); // Consume the newline character from the buffer
        switch (choice) {
            case 1:
                sign(ip);
                break;
            case 2:
                log2(ip);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public void log2(Scanner ip) {
        System.out.println("Enter the username and password:");
        user = ip.nextLine();
        pass = ip.nextLine();
        r = generatePin();
        System.out.println("Generated PIN: " + r);
        System.out.println("Enter the OTP:");
        cp = ip.nextInt();

        if (user.equals(u) && pass.equals(p) && r == cp) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed");
        }
    }

    public void sign(Scanner ip) {
        System.out.println("Enter your new username and password:");
        u = ip.nextLine();
        p = ip.nextLine();
        System.out.println("You have successfully signed up, and now you can proceed to log in :)");
        log2(ip);
    }

    public int generatePin() {
        Random rn = new Random();
        return rn.nextInt();
    }
}

public class Main {
    public static void main(String[] args) {
        App ob = new App();
        ob.log();
    }
}
