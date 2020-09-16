package sptvr19game;

import java.util.Random;
import java.util.Scanner;
class App {
    public void run(){
        System.out.println("Угадай задуманное число.");
        System.out.println("---------------------------");
        int min = 0;
        int max = 20;
        Random random = new Random();
        int myNumber = random.nextInt(max-min+1)+min;
        System.out.println("Задумано число от "+min+" до "+max+". Угадай!");
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        do{
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл!");
                break;
            }else{
                if(attempt < 3){
                    System.out.println("Не угадал, попробуй еще: ");
                    if(myNumber > gamerNumber){
                        System.out.println("(Задуманное число больше)");
                    }else{
                        System.out.println("(Задуманное число меньше)");
                    }
                }else{
                    System.out.println("Ты проиграл. Задумано число: "+myNumber);
                    break;
                }
            }
            attempt++;
        }while(true);
    }
}
