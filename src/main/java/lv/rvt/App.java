package lv.rvt;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
            break;
            } else if(number > 0) {
                System.out.println(number * number);
                continue;
            } else {
                System.out.println("Unsuitable number!");
                continue;
            }
        }
    }
}