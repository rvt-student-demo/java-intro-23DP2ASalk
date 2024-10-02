package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int num = Integer.valueOf(scanner.nextLine());
        printUntilNumber(num);
        }
    public static void printUntilNumber(int numOfTimes) {
        int i = 1;
        while (i <= numOfTimes) {
            System.out.println(i++);
        }
        
    }
}
