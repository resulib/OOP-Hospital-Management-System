package appointment;

import main.Doctor;
import main.Patient;

import java.time.LocalDate;

public class AppointmentDetails {
    private static int nextId=1;
    private final int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private LocalDate appointmentDate;

    public AppointmentDetails(Patient patient, Doctor doctor, LocalDate appointmentDate) {
        this.appointmentId = nextId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        nextId++;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "AppointmentDetails{" +
                "appointmentId=" + appointmentId +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
