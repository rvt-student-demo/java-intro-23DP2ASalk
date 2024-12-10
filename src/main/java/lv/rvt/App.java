package lv.rvt;
import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Person> personList = PersonManager.getPersonList();
        PersonManager.show(personList);
    }
}