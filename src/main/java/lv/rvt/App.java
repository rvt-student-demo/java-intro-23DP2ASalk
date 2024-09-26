package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        while(true){
            System.out.println("Ievadiet skaitli(lsi beigtu -1): ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                if (numbers > 0) {
                    avg = (double) sum / numbers;
                }
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + numbers);
                System.out.println("Average: " + avg);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            } 
            else{
                sum += num;
                numbers++;
                if (num % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }
        }
        scanner.close();
    }
}
