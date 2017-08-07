import java.util.Scanner;


public abstract class Enginetemp{

    Scanner in = new Scanner(System.in);
    int choice;
        public void run() {
                do{ 
                        //Simulating Temperature input
                        System.out.println("Simulating temperature input");
                        System.out.println("Enter temperature range: [1] to [10]");
                        System.out.println("[0] Exit");
                        // Display output
                        choice = in.nextInt();
                        if (choice >=1  && choice <=7)
                                System.out.println("Temperature is \033[32mnormal" + "\033[0m");
                        else if (choice >=8 && choice <=10)
                                System.out.println("Temperature is \033[31mhot!" + "\033[0m");
                } while (choice !=0);   

        }
}

