package ro.siit;

import javax.print.DocFlavor;

public class Contact {
    private String nrCrt;
    private String number;
    private String firstName;
    private String lastName;

    public Contact(String nrCrt, String number, String firstName, String lastName){
        this.nrCrt=nrCrt;
        this.number=number;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "\n" + "Nr crt: " + this.nrCrt + ", Number: " + this.number + ", First name: " + this.firstName + ", Last name: "+ this.lastName ;
    }
}
