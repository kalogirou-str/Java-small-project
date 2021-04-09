package mainpackage;

 class Appointment{
    //rantebou
    private Doctor doctor;
    private Patient patient;
    private Illness illness;
    private Date date;


    public Appointment(Doctor doctor, Patient patient, Illness illness, Date date)
    {
        this.doctor = doctor;
        this.patient = patient;
        this.illness = illness;
        this.date = date;
    }
}
