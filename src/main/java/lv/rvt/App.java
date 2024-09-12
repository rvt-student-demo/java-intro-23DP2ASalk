package lv.rvt;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. skaitlis");
        int pirmais = Integer.valueOf(scanner.nextLine());
        System.out.println("2. skaitlis");
        int otrais = Integer.valueOf(scanner.nextLine());
        System.out.println(pirmais + "+" + otrais + "=" + (pirmais + otrais));
        System.out.println(pirmais + "-" + otrais + "=" + (pirmais - otrais));
        System.out.println(pirmais + "*" + otrais + "=" + (pirmais * otrais));
        System.out.println(pirmais + "/" + otrais + "=" + ((pirmais * 1.0) / otrais));

    }
}
