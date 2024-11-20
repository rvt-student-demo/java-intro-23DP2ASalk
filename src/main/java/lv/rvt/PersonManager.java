package lv.rvt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
}
