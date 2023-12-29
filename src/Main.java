import appointment.Appointment;
import appointment.AppointmentDetails;
import appointment.AppointmentScheduler;
import main.Doctor;
import main.Hospital;
import main.Patient;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Dr.John", 62, "Baku", "Cardiology", 35);
        Doctor doctor2 = new Doctor("Dr.Robert", 45, "Baku", "Surgery", 15);

        Patient patient = new Patient("Resul", 26, "Baku");
        Patient patient2 = new Patient("Thomas", 18, "Baku");
        Patient patient3 = new Patient("Mark", 37, "Baku");

        Hospital hospital = Hospital.getInstance();
        hospital.addPerson(doctor);
        hospital.addPerson(patient);
        hospital.addPerson(doctor2);
        hospital.remove(doctor2);
        hospital.getAll();

        AppointmentDetails appointmentDetails = new AppointmentDetails(patient, doctor, LocalDate.of(2023, 12, 31));
        AppointmentDetails appointmentDetails2 = new AppointmentDetails(patient2, doctor2, LocalDate.of(2024, 3, 18));
        AppointmentDetails appointmentDetails3 = new AppointmentDetails(patient3, doctor, LocalDate.of(2024, 6, 21));
        AppointmentDetails appointmentDetails4 = new AppointmentDetails(patient3, doctor2, LocalDate.now());

        Appointment appointment = new Appointment();
        AppointmentScheduler appointmentScheduler = new AppointmentScheduler(appointment);

        appointmentScheduler.scheduleAppointment(appointmentDetails);
        appointmentScheduler.scheduleAppointment(appointmentDetails2);
        appointmentScheduler.scheduleAppointment(appointmentDetails3);
        appointmentScheduler.scheduleAppointment(appointmentDetails4);

//        appointmentScheduler.getAll(appointment);
//        appointmentScheduler.cancelAppointment(appointmentDetails2);
        appointmentScheduler.getSpecific(doctor2);



    }
}
