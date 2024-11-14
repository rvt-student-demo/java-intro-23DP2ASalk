package lv.rvt;
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> personList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("/workspaces/java-intro-23DP2ASalk/src/main/resources/persons.csv"));
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());
            int weight = Integer.parseInt(parts[2].trim());
            int height = Integer.parseInt(parts[3].trim());
            Person person = new Person(name, age, weight, height);
            personList.add(person);
        }
        reader.close();
        for (Person person : personList) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Weight: " + person.getWeight() + ", Height: " + person.getHeight());
        }
        int totalAge = 0;
        for (Person person : personList) {
            totalAge += person.getAge();
        }
        double averageAge = totalAge / (double) personList.size();
        System.out.println("Average Age: " + averageAge);
    }
}
