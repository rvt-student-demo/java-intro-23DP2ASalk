package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a sart number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a finish number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(num1, num2);
        }
    public static void divisibleByThreeInRange(int num1, int num2) {
        for (int i = num1; i <= num2; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
        
    }
}
