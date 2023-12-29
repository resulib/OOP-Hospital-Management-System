package appointment;

import java.util.ArrayList;
import java.util.List;

public class Appointment {
    private List<AppointmentDetails> appointmentDetailsList;

    public Appointment() {
        appointmentDetailsList = new ArrayList<>();
    }

    public List<AppointmentDetails> getAppointmentDetailsList() {
        return appointmentDetailsList;
    }

}
