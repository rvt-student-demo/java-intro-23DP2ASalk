package lv.rvt;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int start = Integer.valueOf(scanner.nextLine());
        int end = 101;
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    }
}