package sptvr19.mathtest;
import java.util.Random;
import java.util.Scanner;

class App {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    public void run() throws InterruptedException {
        System.out.println(" ~~~ MATH TEST ~~~");
        System.out.println(" ~~~ BY GEORG LAABE ~~~");
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        int number3 = rand.nextInt(10);
        int number4 = rand.nextInt(10);
        int number5 = rand.nextInt(10);
        int number6 = rand.nextInt(10);
        int number7 = rand.nextInt(10);
        int number8 = rand.nextInt(10);
        int number9 = rand.nextInt(10);
        int number10 = rand.nextInt(10);
        
        int correct_answers = 0;
        
        System.out.print("\n1) " + number1 + " x " + number2 + " = ");
        int answer = scan.nextInt();
        if (answer != (number1*number2)) {
            System.out.println(ANSI_RED + "Wrong Answer!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "Correct Answer!" + ANSI_RESET);
            correct_answers ++;
        }
        
        System.out.print("\n2) " + number3 + " x " + number4 + " = ");
        answer = scan.nextInt();
        if (answer != (number3*number4)) {
            System.out.println(ANSI_RED + "Wrong Answer!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "Correct Answer!" + ANSI_RESET);
            correct_answers ++;
        }
        
        System.out.print("\n3) " + number5 + " x " + number6 + " = ");
        answer = scan.nextInt();
        if (answer != (number5*number6)) {
            System.out.println(ANSI_RED + "Wrong Answer!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "Correct Answer!" + ANSI_RESET);
            correct_answers ++;
        }
        
        System.out.print("\n4) " + number7 + " x " + number8 + " = ");
        answer = scan.nextInt();
        if (answer != (number7*number8)) {
            System.out.println(ANSI_RED + "Wrong Answer!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "Correct Answer!" + ANSI_RESET);
            correct_answers ++;
        }
        
        System.out.print("\n5) " + number9 + " x " + number10 + " = ");
        answer = scan.nextInt();
        if (answer != (number9*number10)) {
            System.out.println(ANSI_RED + "Wrong Answer!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "Correct Answer!" + ANSI_RESET);
            correct_answers ++;
        }
       
        if (correct_answers == 5) {
            System.out.println("\n-----------" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "\nWell Done!" + ANSI_RESET);
            Thread.sleep(4000);
        } else if (correct_answers >= 3) {
            System.out.println("\n-----------" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Need More Practice, But OK!" + ANSI_RESET);
            Thread.sleep(4000);
        } else {
            System.out.println("\n-----------" + ANSI_RESET);
            System.out.println(ANSI_RED + "GO AND LEARN MATH!" + ANSI_RESET);
            Thread.sleep(4000);
        }
    }
}
