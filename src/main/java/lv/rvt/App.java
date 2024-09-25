package lv.rvt;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count= 0;
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
            break;
            
            } else {
                sum += number;
                count++;
            }
        }
        System.out.println("Numbers :" + count);
        System.out.println("Sum: " + sum);
    }
}