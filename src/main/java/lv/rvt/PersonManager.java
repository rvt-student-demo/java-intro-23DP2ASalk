package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/workspaces/java-intro-23DP2ASalk/data/persons.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                int weight = Integer.parseInt(data[2].trim());
                int height = Integer.parseInt(data[3].trim());
                Person person = new Person(name, age, weight, height);
                personList.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }
    public static void addPerson(Person person) {
        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get("/workspaces/java-intro-23DP2ASalk/data/persons.csv"),
                StandardOpenOption.APPEND)) {
            writer.write(person.toCsvRow());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void show(ArrayList<Person> personList) {
        System.out.printf("| %-10s | %-3s | %-6s | %-6s | %-22s |%n", "Name", "Age", "Weight", "Height", "BMI (body mass index)");
        System.out.println("|------------|-----|--------|--------|------------------------|");
        for (Person person : personList) {
            double heightInMeters = person.getHeight() / 100.0; // Konvertē augstumu metros
            double bmi = person.getWeight() / (heightInMeters * heightInMeters); // Aprēķina BMI
            System.out.printf("| %-10s | %-3d | %-6d | %-6d | %-22.2f |%n",
                    person.getName(), person.getAge(), person.getWeight(), person.getHeight(), bmi);
        }
    }
}
