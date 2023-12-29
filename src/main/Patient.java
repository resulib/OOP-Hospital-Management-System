package main;

public class Patient extends Person {
    private static int nextId = 1;
    private final int patientId;


    public Patient(String name, int age, String address) {
        super(name, age, address);
        this.patientId = nextId;
        nextId++;
    }

    public int getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                '}';
    }
}
