package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chicken:");
        String chicken = scanner.nextLine();
        System.out.println("Bacon(kg):");
        String bacon = scanner.nextLine();
        System.out.println("Tractor:");
        String tractor = scanner.nextLine();

        System.out.println("And finally, a smmary:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);
    }

}
