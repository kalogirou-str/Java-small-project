package mainpackage;

public class Doctor extends Users {

    private String speciality;


    private Doctor(String username, String password, String name, String surname, String speciality) {
        super(username, password, name, surname);
        this.speciality = speciality;
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    public void newFreeAppointment(){}
    public void appointments(){}
}
