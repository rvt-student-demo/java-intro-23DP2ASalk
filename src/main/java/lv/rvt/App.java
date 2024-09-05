package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi savu vārdu");
        String name = scanner.nextLine();
        System.out.println("Ivadi savu uzvārdu");
        String surname = scanner.nextLine();
        System.out.println("Ievadi savu gruppu");
        String group = scanner.nextLine();
        System.out.println(name + " " + surname + " " + group);

    }

}
