package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
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
    public static void addPerson(Person person){
        BufferedWriter writer =
        Helper.getWriter(filename:"/workspaces/java-intro-23DP2ASalk/data/persons.csv", StandardOpenOption.APPEND)
        Person person = new Person();
        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
    }
}
