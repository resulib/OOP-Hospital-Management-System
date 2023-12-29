package appointment;

import main.Person;

public class AppointmentScheduler {
    private Appointment appointment;

    public AppointmentScheduler(Appointment appointment) {
        this.appointment = appointment;
    }

    public AppointmentDetails scheduleAppointment(AppointmentDetails appointmentDetails) {
        appointment.getAppointmentDetailsList().add(appointmentDetails);
        return appointmentDetails;
    }

    public void getSpecific(Person person) {
        for (AppointmentDetails appointmentDetails : appointment.getAppointmentDetailsList()) {
            if (appointmentDetails.getDoctor().equals(person)) {
                System.out.println(appointmentDetails);
            } else if (appointmentDetails.getPatient().equals(person)) {
                System.out.println(appointmentDetails);
            }
        }
    }

    public void cancelAppointment(AppointmentDetails appointmentDetails) {
        appointment.getAppointmentDetailsList().remove(appointmentDetails);
        System.out.println("Cancelled -> " + appointmentDetails.toString());
    }

    public void getAll(Appointment appointment) {
        for (AppointmentDetails appointmentDetails : appointment.getAppointmentDetailsList()) {
            System.out.println(appointmentDetails);
        }
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointmentScheduler{" +
                "appointment=" + appointment +
                '}';
    }
}
