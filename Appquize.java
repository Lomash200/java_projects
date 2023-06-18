import java.util.Scanner;
import java.util.Random;

interface Login {
    void log();
}

interface Pin {
    int generatePin();
}

class Appquize implements Login, Pin {
    String u, p;
    String user, pass;
    int pin, r, cp, i;

    public void log() {
        Scanner ip = new Scanner(System.in);
        System.out.println("<---- Welcome To Examination Center ---->");
        System.out.println("FOR Faculty PRESS 1");
        System.out.println("FOR Student, PRESS 2");
        System.out.println("Enter your choice:");
        int choice = ip.nextInt();
        ip.nextLine();
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                login();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public void login() {
        Scanner ip = new Scanner(System.in);
        System.out.println("FOR SIGN UP, PRESS 1");
        System.out.println("FOR LOG IN, PRESS 2");
        System.out.println("Enter your choice:");
        int choice = ip.nextInt();
        ip.nextLine();
        switch (choice) {
            case 1:
                signUp(ip);
                break;
            case 2:
                logIn(ip);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    public void facq(Scanner ip) {
        String q1, q11, q12, q13, q14, q2, q21, q22, q23, q24, q3, q31, q32, q33, q34, q4, q41, q42, q43, q44, q5, q51, q52, q53, q54;
        char ans1, ans2, ans3, ans4, ans5;

        System.out.println("Enter your quiz questions:");
        
        // Question 1
        System.out.println("Enter your 1st question:");
        q1 = ip.nextLine();
        System.out.println("Enter the options:");
        q11 = ip.nextLine();
        q12 = ip.nextLine();
        q13 = ip.nextLine();
        q14 = ip.nextLine();
        System.out.println("Enter the correct answer (a, b, c, d):");
        ans1 = ip.nextLine().charAt(0);

        // Question 2
        System.out.println("Enter your 2nd question:");
        q2 = ip.nextLine();
        System.out.println("Enter the options:");
        q21 = ip.nextLine();
        q22 = ip.nextLine();
        q23 = ip.nextLine();
        q24 = ip.nextLine();
        System.out.println("Enter the correct answer (a, b, c, d):");
        ans2 = ip.nextLine().charAt(0);

        // Question 3
        System.out.println("Enter your 3rd question:");
        q3 = ip.nextLine();
        System.out.println("Enter the options:");
        q31 = ip.nextLine();
        q32 = ip.nextLine();
        q33 = ip.nextLine();
        q34 = ip.nextLine();
        System.out.println("Enter the correct answer (a, b, c, d):");
        ans3 = ip.nextLine().charAt(0);

        // Question 4
        System.out.println("Enter your 4th question:");
        q4 = ip.nextLine();
        System.out.println("Enter the options:");
        q41 = ip.nextLine();
        q42 = ip.nextLine();
        q43 = ip.nextLine();
        q44 = ip.nextLine();
        System.out.println("Enter the correct answer (a, b, c, d):");
        ans4 = ip.nextLine().charAt(0);

        // Question 5
        System.out.println("Enter your 5th question:");
        q5 = ip.nextLine();
        System.out.println("Enter the options:");
        q51 = ip.nextLine();
        q52 = ip.nextLine();
        q53 = ip.nextLine();
        q54 = ip.nextLine();
        System.out.println("Enter the correct answer (a, b, c, d):");
        ans5 = ip.nextLine().charAt(0);

        // Displaying the entered quiz
        System.out.println("\nYour quiz:");
        System.out.println("1. " + q1);
        System.out.println("Options: " + q11 + ", " + q12 + ", " + q13 + ", " + q14);
        System.out.println("Correct Answer: " + ans1);
        System.out.println("2. " + q2);
        System.out.println("Options: " + q21 + ", " + q22 + ", " + q23 + ", " + q24);
        System.out.println("Correct Answer: " + ans2);
        System.out.println("3. " + q3);
        System.out.println("Options: " + q31 + ", " + q32 + ", " + q33 + ", " + q34);
        System.out.println("Correct Answer: " + ans3);
        System.out.println("4. " + q4);
        System.out.println("Options: " + q41 + ", " + q42 + ", " + q43 + ", " + q44);
        System.out.println("Correct Answer: " + ans4);
        System.out.println("5. " + q5);
        System.out.println("Options: " + q51 + ", " + q52 + ", " + q53 + ", " + q54);
        System.out.println("Correct Answer: " + ans5);
    }

    public void stuq() {
        System.out.println("Welcome to the quiz");
        System.out.println("Please answer the following questions:");

        Scanner ip = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("1. What is the capital of France?");
        System.out.println("a) Paris");
        System.out.println("b) London");
        System.out.println("c) Rome");
        System.out.println("d) Berlin");
        char answer1 = ip.nextLine().charAt(0);
        if (answer1 == 'a') {
            score++;
        }

        // Question 2
        System.out.println("2. What is the largest planet in our solar system?");
        System.out.println("a) Venus");
        System.out.println("b) Jupiter");
        System.out.println("c) Saturn");
        System.out.println("d) Neptune");
        char answer2 = ip.nextLine().charAt(0);
        if (answer2 == 'b') {
            score++;
        }

        // Question 3
        System.out.println("3. Who painted the Mona Lisa?");
        System.out.println("a) Vincent van Gogh");
        System.out.println("b) Leonardo da Vinci");
        System.out.println("c) Pablo Picasso");
        System.out.println("d) Michelangelo");
        char answer3 = ip.nextLine().charAt(0);
        if (answer3 == 'b') {
            score++;
        }

        // Question 4
        System.out.println("4. What is the chemical symbol for gold?");
        System.out.println("a) Au");
        System.out.println("b) Ag");
        System.out.println("c) Fe");
        System.out.println("d) Hg");
        char answer4 = ip.nextLine().charAt(0);
        if (answer4 == 'a') {
            score++;
        }

        // Question 5
        System.out.println("5. Who wrote the play 'Romeo and Juliet'?");
        System.out.println("a) William Shakespeare");
        System.out.println("b) Charles Dickens");
        System.out.println("c) Jane Austen");
        System.out.println("d) Mark Twain");
        char answer5 = ip.nextLine().charAt(0);
        if (answer5 == 'a') {
            score++;
        }

        System.out.println("\nYour score: " + score + "/5");
        if(score==2){
            System.out.println("pass");
        }
        else{
            System.out.println("fail try next time");
        }
    }

    public void logIn(Scanner ip) {
        System.out.println("Enter the username and password:");
        user = ip.nextLine();
        pass = ip.nextLine();
        r = generatePin();
        System.out.println("Generated PIN: " + r);
        System.out.println("Enter the OTP:");
        cp = ip.nextInt();

        if (user.equals(u) && pass.equals(p) && r == cp) {
            System.out.println("Login successful!");
            choice();
        } else {
            System.out.println("Login failed");
        }
    }

    public void signUp(Scanner ip) {
        System.out.println("Enter your new username and password:");
        u = ip.nextLine();
        p = ip.nextLine();
        System.out.println("You have successfully signed up, and now you can proceed to log in :)");
        logIn(ip);
    }

    public int generatePin() {
        Random rn = new Random();
        return rn.nextInt();
    }

    public void choice() {
        Scanner ip = new Scanner(System.in);
        System.out.println("PRESS 1 for Faculty");
        System.out.println("PRESS 2 for Student to attend quiz");
        System.out.println("Enter your choice:");
        int choice1 = ip.nextInt();
        ip.nextLine();
        switch (choice1) {
            case 1:
                facq(ip);
                break;
            case 2:
                stuq();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Appquize ob = new Appquize();
        ob.log();
    }
}
