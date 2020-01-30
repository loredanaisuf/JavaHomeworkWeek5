package ro.siit;

public class Contact {
    private int nrCrt;
    private String number;
    private String firstName;
    private String lastName;

    public Contact(int nrCrt, String number, String firstName, String lastName){
        this.nrCrt=nrCrt;
        this.number=number;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "Nr crt: " + this.nrCrt + "Number: " + this.number + "First name: " + this.firstName + "Last name: "+ this.lastName;
    }
}
