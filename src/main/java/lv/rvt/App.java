package lv.rvt;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int num = Integer.valueOf(scanner.nextLine());
        int x = 1;
        for (int i = 1; i <= num; i++) {
            x *= i;
        }
        System.out.println(x);
    }
}