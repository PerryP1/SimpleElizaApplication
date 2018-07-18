import java.util.Scanner;

public class SimpleElizaApplication {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String response;

        System.out.println("Good day. What is your problem? Enter each response here or Q to quit:");
        response = keyboard.nextLine();

        while (!response.equalsIgnoreCase("q")) {

            if (response.equals("I am feeling great")) {
                System.out.println("Great to hear!");
            } else if (response.contains("My teacher hates me.")) {
                System.out.println("Whats wrong?");
            } else if (response.contains("I don't know whats wrong.")) {
                System.out.println("Whats wrong?");
                response = keyboard.next();

            }

            // when are you ever asking for user input again?


        }

    }
}
//You will be creating an interactive chat-bot type program. Eliza is a therapist program that interacts with the user. Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like the therapist really cares.
//
//Your first task is to develop a program with a running loop. If the user types in "I am feeling great" or enter "Q", the program will stop running. Your program should print out the last input (as an output) every time before accepting new input. Make sure you are accommodating for NO case-sensitivity. (Q is the same as q)
//
//We will continue to build on top of this application throughout the week.
//
//
//
//Example output:
//Good day. What is your problem? Enter your response here or Q to quit: my teacher hates me
//my teacher hates me
//Enter your response here or Q to quit: i dont know what's wrong
//i dont know what's wrong
//Enter your response here or Q to quit: i am feeling great
//i am feeling great
//>>> END
//Previous Next
/*

        int bot;

        new bot() {

        };
        /*int quitQ, guess = q;

        quitQ = q;
        */