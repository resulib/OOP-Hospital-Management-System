package main;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Person> personList;
    private static Hospital hospital;

    private Hospital() {
        personList = new ArrayList<>();
    }

    public static Hospital getInstance() {
        if (hospital == null) {
            hospital = new Hospital();
        }
        return hospital;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void remove(Person person) {
        personList.remove(person);
        System.out.println("Removed -> " + person);
    }

    public void getAll() {
        for (Person p : personList) {
            System.out.println(p);
        }
    }
}
