package lv.rvt;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        if (numbers.size() >= 3) {
            int sumSecondThird = numbers.get(1) + numbers.get(2);
            System.out.println("Sum of second and third numbers: " + sumSecondThird);
        } else {
            System.out.println("Not enough numbers entered.");
        }
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        System.out.println("Array: " + numbers);
        System.out.println("Sum of all ArrayList elements: " + totalSum);
    }
}