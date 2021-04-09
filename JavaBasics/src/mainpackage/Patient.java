package mainpackage;

public class Patient extends Users {

    private final String AMKA;

    public Patient(String username, String password, String name, String surname, String amka) {
        super(username, password, name, surname);
        AMKA = amka;
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    public void registration() { }
    public void availableAppointmentForSpecificDoctor(){}
    public void availableAppointmentForSpecificSpecialty(){}
    public void appointmentsProgram(){}
    public void appointmentsHistory(){}
}
